public class L4_Sum_of_all_Subarray {
   public static void main(String[] args) {
      int[][] matrix = { { 1, 2 }, { 3, 4 } };
      int n = matrix.length;
      int m = matrix[0].length;

      System.out.println(Sum_of_all_Subarray(matrix, n, m));
   }

   public static int Sum_of_all_Subarray(int[][] matrix, int n, int m) {
      int sum = 0;

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            int occ = (i + 1) * (j + 1) * (n - i) * (m - j);
            sum = sum + (occ * matrix[i][j]);
         }
      }
      return sum;
   }
}