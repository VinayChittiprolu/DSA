import java.util.*;

public class F6_reverse_the_array {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter the length of Array: ");
      int n = scn.nextInt();
      int[] arr = new int[n];

      System.out.print("Enter the elements of Array: ");
      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }

      reverseArray(arr, 0, n - 1);

      System.out.print("Reversed Array: ");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
      scn.close();
   }

   public static void reverseArray(int[] arr, int sp, int ep) {
      while (sp < ep) {
         int temp = arr[sp];
         arr[sp] = arr[ep];
         arr[ep] = temp;
         sp++;
         ep--;
      }
   }
}