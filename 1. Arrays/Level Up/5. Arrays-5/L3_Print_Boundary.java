import java.util.ArrayList;
import java.util.List;

public class L3_Print_Boundary {
   public static void main(String[] args) {
      int arr[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
      };
      System.out.println(SpiralMatrix(arr));

      int arr2[][] = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
      };
      System.out.println(SpiralMatrix(arr2));
   }

   public static List<Integer> SpiralMatrix(int[][] arr) {
      List<Integer> result = new ArrayList<>();
      int n = arr.length;
      int m = arr[0].length;
      int i = 0;
      int j = 0;

      for (int k = 0; k < m - 1; k++) {
         // System.out.print(arr[i][j] + " ");
         result.add(arr[i][j]);
         j++;
      }

      for (int k = 0; k < n - 1; k++) {
         // System.out.print(arr[i][j] + " ");
         result.add(arr[i][j]);
         i++;
      }

      for (int k = 0; k < m - 1; k++) {
         // System.out.print(arr[i][j] + " ");
         result.add(arr[i][j]);
         j--;
      }

      for (int k = 0; k < n - 1; k++) {
         // System.out.print(arr[i][j] + " ");
         result.add(arr[i][j]);
         i--;
      }
      return result;
   }
}