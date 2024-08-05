import java.util.*;

// Given an integer array nums of size N, rotate the array to the right by k steps, where k is non-negative.

// Sample Input:
// len = 7
// 1 2 3 4 5 6 7
// k = 3

// Sample Output: 
// s1. 7 6 5 4 3 2 1  
// s2. 5 6 7 4 3 2 1
// s3. 5 6 7 1 2 3 4 
public class F8_Rotate_Array_K {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter the length of array: ");
      int len = scn.nextInt();
      int[] arr = new int[len];

      System.out.print("Enter the elements of Array: ");
      for (int i = 0; i < len; i++) {
         arr[i] = scn.nextInt();
      }
      System.out.print("Enter the K value: ");
      int k = scn.nextInt();
      k = k % len;

      RPA(arr, 0, len - 1);
      RPA(arr, 0, k - 1);
      RPA(arr, k, len - 1);

      System.out.print("Reversed_part of Array: ");
      for (int i = 0; i < len; i++) {
         System.out.print(arr[i] + " ");
      }
      scn.close();
   }

   public static void RPA(int[] arr, int s, int e) {
      int sp = s;
      int ep = e;
      while (sp < ep) {
         int temp = arr[sp];
         arr[sp] = arr[ep];
         arr[ep] = temp;
         sp++;
         ep--;
      }
   }
}
