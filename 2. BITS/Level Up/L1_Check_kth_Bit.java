import java.util.Scanner;

public class L1_Check_kth_Bit {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
     
      System.out.println(CheckBits(n, k));
      scn.close();
   }

   public static boolean CheckBits(int n, int k) {
      return ((n & (1 << k)) != 0);
   }
}