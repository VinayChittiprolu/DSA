public class L2_Set_kth_Bit {
   public static void main(String[] args) {
      int n = 10;
      int k = 2;
      System.out.println(SetBit(n, k));

      int n1 = 2;
      int k1 = 0;
      System.out.println(SetBit(n1, k1));
   }

   public static int SetBit(int n, int k) {
      int ans = (n | (1 << k));
      return ans;
   }
}