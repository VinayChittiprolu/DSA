import java.util.Scanner;

public class F9_Two_Sum_Brute {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }

      int k = scn.nextInt();
      System.out.println(twosum(arr, k, n));
      scn.close();
   }

   public static boolean twosum(int[] arr, int k, int n) {
      // int n = arr.length;
      for (int i = 0; i < n - 1; i++) {
         for (int j = i + 1; j < n; j++) {
            if (arr[i] + arr[j] == k) {
               return true;
            }
         }
      }
      return false;
   }
}