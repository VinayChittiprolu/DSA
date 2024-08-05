public class L16_Sum_XOR {
   public static void main(String[] args) {
      int arr[] = { 5, 9, 7, 6 };
      System.out.println(sumXOR(arr));
   }

   // Function for finding maximum and value pair
   public static long sumXOR(int arr[]) {

      long ans = 0;
      for (int i = 31; i >= 0; i--) {
         long set = 0;
         long unset = 0;
         for (long j : arr) {
            if ((j & (1 << i)) != 0) {
               unset += 1;
            } else {
               set += 1;
            }
         }
         ans += (((long) (1 << i)) * (unset * set));
      }

      return ans;
   }
}