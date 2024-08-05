import java.util.Scanner;

public class F2_Max_of_Array {

   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }

      int result = Integer.MIN_VALUE; // where Integer.MIN_VALUE stores minimum value.
      // int result = 0;
      for (int i = 0; i < n; i++) {
         if (arr[i] > result) {
            result = arr[i];
         }
      }
      System.out.println(result);

      scn.close();
   }
}