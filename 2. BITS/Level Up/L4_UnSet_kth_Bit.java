public class L4_UnSet_kth_Bit {
   public static void main(String[] args) {
      int n = 15;
      int k = 1;
      System.out.println(UnsetBit(n, k));

      int n1 = 2;
      int k1 = 0;
      System.out.println(UnsetBit(n1, k1));

      int n2 = 2;
      int k2 = 1;
      System.out.println(UnsetBit(n2, k2));
   }

   public static int UnsetBit(int n, int k) {
      // boolean CheckBits
      if ((n & (1 << k)) != 0) {
         int ans = n ^ (1 << k);
         return ans;
      } else {
         return n;
      }
   }
}