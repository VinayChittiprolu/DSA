public class L3_Toggle_kth_Bit {
   public static void main(String[] args) {
      int n = 15;
      int k = 1;
      System.out.println(UnsetBit(n, k));

      int n1 = 2;
      int k1 = 1;
      System.out.println(UnsetBit(n1, k1));
   }

   public static int UnsetBit(int n, int k) {
      int ans = (n ^ (1 << k));
      return ans;
   }
}