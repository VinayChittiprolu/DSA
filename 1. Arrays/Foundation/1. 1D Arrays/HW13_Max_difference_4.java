import java.util.Scanner;

public class HW13_Max_difference_4 {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }

      System.out.println(Math.max(Max_Differnce_2(arr, n), Max_Differnce_3(arr, n)));
      scn.close();
   }

   public static int Max_Differnce_2(int arr[], int n) {
      for (int i = 0; i < n; i++) {
         arr[i] = arr[i] + i;
      }

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for (int i = 0; i < n; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
         if (arr[i] < min) {
            min = arr[i];
         }
      }
      for (int i = 0; i < n; i++) {
         arr[i] = arr[i] - i;
      }
      return max - min;
   }

   public static int Max_Differnce_3(int arr[], int n) {
      for (int i = 0; i < n; i++) {
         arr[i] = arr[i] - i;
      }

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for (int i = 0; i < n; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
         if (arr[i] < min) {
            min = arr[i];
         }
      }
      return max - min;
   }
}