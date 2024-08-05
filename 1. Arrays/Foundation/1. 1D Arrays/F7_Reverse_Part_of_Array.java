
// Given n length Array and two valid index [s,e], You have to Reverse the array from s to e and print the final array.
import java.util.*;

public class F7_Reverse_Part_of_Array {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter the length of Array: ");
      int len = scn.nextInt();
      int[] arr = new int[len];

      System.out.print("Enter the elements of Array: ");
      for (int i = 0; i < len; i++) {
         arr[i] = scn.nextInt();
      }

      System.out.print("Enter the index sp: ");
      int sp = scn.nextInt();
      System.out.print("Enter the index ep: ");
      int ep = scn.nextInt();

      reversePart(arr, sp, ep);

      System.out.print("Reversed_part of Array: ");
      for (int i = 0; i < len; i++) {
         System.out.print(arr[i] + " ");
      }
      scn.close();
   }

   public static void reversePart(int[] arr, int sp, int ep) {
      while (sp < ep) {
         int temp = arr[sp];
         arr[sp] = arr[ep];
         arr[ep] = temp;
         sp++;
         ep--;
      }
   }
}