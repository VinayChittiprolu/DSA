// import java.util.Scanner;

public class L4_Spiral_Matrix_sqr {
   public static void main(String[] args) {
      int[][] arr = {
            { 1, 2, 3, 4, 5 },
            { 6, 7, 8, 9, 10 },
            { 11, 12, 13, 14, 15 },
            { 16, 17, 18, 19, 20 },
            { 21, 22, 23, 24, 25 }
      };
      int n = arr.length;

      // Scanner scn = new Scanner(System.in);
      // int n = scn.nextInt();
      // int arr[][] = new int[n][n];

      // for (int i = 0; i < n; i++) {
      // for (int j = 0; j < n; j++) {
      // arr[i][j] = scn.nextInt();
      // }
      // }
      // scn.close();

      int i = 0;
      int j = 0;
      int steps = n - 1;

      while (steps >= 0) {
         for (int k = 0; k < steps; k++) {
            System.out.print(arr[i][j] + " ");
            j++;
         }
         for (int k = 0; k < steps; k++) {
            System.out.print(arr[i][j] + " ");
            i++;
         }
         for (int k = 0; k < steps; k++) {
            System.out.print(arr[i][j] + " ");
            j--;
         }
         for (int k = 0; k < steps; k++) {
            System.out.print(arr[i][j] + " ");
            i--;
         }
         i++;
         j++;
         steps = steps - 2;

         if (steps == 0) {
            System.out.print(arr[i][j] + " ");
         }
      }
   }
}
