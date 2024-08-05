public class L3_Range_Sum_Query {

   public static void main(String[] args) {
      int[][] input_matrix = {
            { 3, 0, 1, 4, 2 },
            { 5, 6, 3, 2, 1 },
            { 1, 2, 0, 1, 5 },
            { 4, 1, 0, 1, 7 },
            { 1, 0, 3, 0, 5 }
      };

      int[][] new_matrix = prefix(input_matrix);
      for (int i = 0; i < new_matrix.length; i++) {
         for (int j = 0; j < new_matrix[0].length; j++) {
            System.out.print(new_matrix[i][j] + " ");
         }
         System.out.println();
      }

      System.out.println(Sum_Range(new_matrix, 2, 1, 4, 3));
      System.out.println(Sum_Range(new_matrix, 1, 1, 2, 2));
      System.out.println(Sum_Range(new_matrix, 1, 2, 2, 4));
      System.out.println(Sum_Range(new_matrix, 0, 0, 4, 4));
      System.out.println(Sum_Range(new_matrix, 0, 0, 0, 0));
   }

   public static int[][] prefix(int mat_1[][]) {
      int n = mat_1.length;
      int m = mat_1[0].length;
      int[][] psum = new int[n][m];

      // 1(a). prefix sum for rows
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (j == 0) {
               psum[i][j] = mat_1[i][j];
            } else {
               psum[i][j] = psum[i][j - 1] + mat_1[i][j];
            }
         }
      }
      // 1(b). prefix sum for columns
      for (int j = 0; j < m; j++) {
         for (int i = 1; i < n; i++) {
            psum[i][j] += psum[i - 1][j];
         }
      }
      return psum;
   }

   // finding the sum for required range(query).
   public static int Sum_Range(int[][] mat_2, int row1, int col1, int row2, int col2) {

      int sum = mat_2[row2][col2];

      if (row1 > 0 && col1 > 0) {
         sum += mat_2[row1 - 1][col1 - 1];
      }
      if (row1 > 0) {
         sum -= mat_2[row1 - 1][col2];
      }
      if (col1 > 0) {
         sum -= mat_2[row2][col1 - 1];
      }
      return sum;
   }
}