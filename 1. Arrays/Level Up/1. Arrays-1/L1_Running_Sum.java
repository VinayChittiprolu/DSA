import java.util.Scanner;

public class L1_Running_Sum {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }
      int[] prefix = RunningSum(arr);
      for (int i = 0; i < n; i++) {
         System.out.print((prefix[i]) + " ");
      }
      scn.close();
   }

   public static int[] RunningSum(int arr[]) {
      int n = arr.length;
      int[] prefix = new int[n]; // Initialize a new array to store the prefix sums

      for (int i = 0; i < n; i++) {
         if (i == 0) {
            prefix[i] = arr[i];
         } else {
            prefix[i] = prefix[i - 1] + arr[i];
         }
      }
      return prefix;
   }
}