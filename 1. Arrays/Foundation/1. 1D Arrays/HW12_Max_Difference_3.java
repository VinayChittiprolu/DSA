import java.util.Scanner;

public class HW12_Max_Difference_3 {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }
      System.out.println(Max_Diffrence(arr));
      scn.close();
   }

   public static int Max_Diffrence(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
         arr[i] = arr[i] - i;
      }

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
         if (arr[i] < min) {
            min = arr[i];
         }
      }
      return max - min;
   }
}