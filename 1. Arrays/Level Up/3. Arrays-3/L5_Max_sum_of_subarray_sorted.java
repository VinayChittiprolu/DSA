import java.util.*;

public class L5_Max_sum_of_subarray_sorted {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      int[][] matrix = new int[n][m];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            matrix[i][j] = scn.nextInt();
         }
      }

      // storing the Prefix matrix values to new int[][] pm
      int[][] pm = Prefix(matrix);

      int result = Integer.MIN_VALUE;

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            int temp = SumRange(pm, i, j, n - 1, m - 1);
            result = Math.max(result, temp);
         }
      }
      System.out.println(result);
      scn.close();
   }

   public static int[][] Prefix(int mat_1[][]) {
      int n = mat_1.length;
      int m = mat_1[0].length;

      int psum[][] = new int[mat_1.length][mat_1[0].length];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (j == 0) {
               psum[i][j] = mat_1[i][j];
            } else {
               psum[i][j] = psum[i][j - 1] + mat_1[i][j];
            }
         }
      }

      for (int j = 0; j < m; j++) {
         for (int i = 1; i < n; i++) {
            psum[i][j] = psum[i - 1][j] + psum[i][j];
         }
      }
      return psum;
   }

   public static int SumRange(int mat_2[][], int r1, int c1, int r2, int c2) {

      int ans = mat_2[r2][c2];

      if (r1 > 0) {
         ans -= mat_2[r1 - 1][c2];
      }
      if (c1 > 0) {
         ans -= mat_2[r2][c1 - 1];
      }
      if (r1 > 0 && c1 > 0) {
         ans += mat_2[r1 - 1][c1 - 1];
      }
      return ans;
   }
}