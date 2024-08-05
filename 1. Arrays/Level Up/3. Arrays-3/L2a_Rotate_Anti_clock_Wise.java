public class L2a_Rotate_Anti_clock_Wise {
   public static void main(String[] args) {
      int[][] matrix = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 }, { 130, 140, 150, 160 } };
      
      int[][] final_matrix = rotate(matrix);

      // Print the rotated matrix
      System.out.println("Anti_Clockwise:");
      for (int i = 0; i < final_matrix.length; i++) {
         for (int j = 0; j < final_matrix[i].length; j++) {
            System.out.print(final_matrix[i][j] + " ");
         }
         System.out.println();
      }
   }

   public static int[][] rotate(int[][] matrix) {
      int n = matrix.length;

      // 1. Transpose the matrix
      for (int i = 0; i < n; i++) {
         for (int j = i; j < n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
         }
      }

      // 1(a) Printing the Transpose Matrix.
      System.out.println("Transposed matrix:");
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }

      // 2. Interchanging the Rows of the transposed matrix
      for (int i = 0; i < n; i++) {
         int sp = 0;
         int ep = n - 1;

         while (sp < ep) {
            int temp = matrix[sp][i];
            matrix[sp][i] = matrix[ep][i];
            matrix[ep][i] = temp;
            sp++;
            ep--;
         }
      }
      return matrix;
   }
}