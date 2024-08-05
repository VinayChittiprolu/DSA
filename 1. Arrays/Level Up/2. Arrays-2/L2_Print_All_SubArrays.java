import java.util.Scanner;

public class L2_Print_All_SubArrays {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }

      for (int sp = 0; sp < n; sp++) {
         for (int ep = sp; ep < n; ep++) {
            for (int i = sp; i <= ep; i++) {
               System.out.print(arr[i] + " ");
            }
            System.out.println();
         }
      }
      scn.close();
   }
}