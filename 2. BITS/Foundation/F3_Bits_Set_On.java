import java.util.Scanner;

public class F3_Bits_Set_On {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();

      int ans = n | (1 << k);

      System.out.println(ans);
      scn.close();
   }
}