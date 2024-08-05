import java.util.Scanner;

public class L1a {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt(); // Reads the size of the square matrix
      int[][] arr = new int[n][n]; // Creates a square matrix of size n x n
      
      // Reads input values and populates the matrix
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            arr[i][j] = scn.nextInt();
         }
      }

      // Transposes the matrix and prints the transposed matrix
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {

            System.out.print(arr[j][i] + " ");// Prints the element at position (j, i) of the transposed matrix
         }
         System.out.println(); // Moves to the next line after printing each row
      }
      scn.close();
   }
}