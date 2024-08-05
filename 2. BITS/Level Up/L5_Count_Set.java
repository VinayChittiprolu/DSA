public class L5_Count_Set {
   public static void main(String[] args) {
      int n = 6;
      System.out.println(Count_Set(n));

      int n1 = 15;
      System.out.println(Count_Set(n1));
   }

   public static int Count_Set(int n) {
      int count = 0;
      for (int k = 0; k < 32; k++) {

         // boolean CheckBits
         if (((n & (1 << k)) != 0)) {
            count++;
         }
      }
      return count;
   }
}