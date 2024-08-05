import java.util.Scanner;

public class F1_Is_Even {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      if ((n & 1) == 0) {
         System.out.println("even");
      } else {
         System.out.println("odd");
      }
      scn.close();
   }
}