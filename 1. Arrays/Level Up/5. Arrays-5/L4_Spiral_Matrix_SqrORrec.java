import java.util.ArrayList;
import java.util.List;

public class L4_Spiral_Matrix_SqrORrec {
   public static void main(String[] args) {

      int arr_rec[][] = {
            { 1, 2, 3, 4, 5, 6 },
            { 7, 8, 9, 10, 11, 12, },
            { 13, 14, 15, 16, 17, 18 },
            { 19, 20, 21, 22, 23, 24 },
            { 25, 26, 27, 28, 29, 30 }
      };
      System.out.println(SpiralMatrix(arr_rec));

      int[][] arr_sqr = {
            { 1, 2, 3, 4, 5 },
            { 6, 7, 8, 9, 10 },
            { 11, 12, 13, 14, 15 },
            { 16, 17, 18, 19, 20 },
            { 21, 22, 23, 24, 25 }
      };
      System.out.println(SpiralMatrix(arr_sqr));

      int arr2[][] = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
      };
      System.out.println(SpiralMatrix(arr2));
   }

   public static List<Integer> SpiralMatrix(int arr[][]) {
      List<Integer> result = new ArrayList<>();

      int n = arr.length;
      int row = n - 1;

      int m = arr[0].length;
      int col = m - 1;

      int i = 0;
      int j = 0;
      while (row >= 1 && col >= 1) {
         for (int k = 0; k < col; k++) {
            // System.out.print(arr[i][j] + " ");
            result.add(arr[i][j]);
            j++;
         }

         for (int k = 0; k < row; k++) {
            // System.out.print(arr[i][j] + " ");
            result.add(arr[i][j]);
            i++;
         }

         for (int k = 0; k < col; k++) {
            // System.out.print(arr[i][j] + " ");
            result.add(arr[i][j]);
            j--;
         }

         for (int k = 0; k < row; k++) {
            // System.out.print(arr[i][j] + " ");
            result.add(arr[i][j]);
            i--;
         }

         i++;
         j++;
         row = row - 2;
         col = col - 2;
      }

      if (row == 0) {
         for (int k = 0; k < col + 1; k++) {
            // System.out.print(arr[i][j] + " ");
            result.add(arr[i][j]);
            j++;
         }
      } else if (col == 0) {
         for (int k = 0; k < row + 1; k++) {
            // System.out.print(arr[i][j] + " ");
            result.add(arr[i][j]);
            i++;
         }
      }
      return result;
   }
}