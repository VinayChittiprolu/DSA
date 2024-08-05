public class L1_Transpose_of_Matrix {
   public static void main(String[] args) {
      int[][] matrix = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 }, { 130, 140, 150, 160 } };

      for (int i = 1; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
         }
      }

      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix.length; j++) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }
}