import java.util.Scanner;

public class F2_Single_Element {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }
      int xor = 0;
      for (int i = 0; i < n; i++) {
         xor = xor ^ arr[i];
      }
      System.out.println(xor);
      scn.close();
   }
}