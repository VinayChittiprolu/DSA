import java.util.Scanner;

public class F5_largest_num {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter the length of Array: ");
      int n = scn.nextInt();
      int[] arr = new int[n];

      System.out.print("Enter the elements of Array: ");
      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }
      System.out.println("The largest number is at index of: " + largestNumber(arr));
      scn.close();
   }

   public static int largestNumber(int[] arr) {
      int max_1 = Integer.MIN_VALUE;
      int max_2 = Integer.MIN_VALUE;
      int index = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > max_1) {
            max_2 = max_1;
            max_1 = arr[i];
            index = i;
         } else if (arr[i] > max_2) {
            max_2 = arr[i];
         }
      }
      // return max_2 * 2 <= max_1 ? index : -1;
      if (max_2 * 2 <= max_1) {
         return index;
      } else {
         return -1;
      }
   }
}