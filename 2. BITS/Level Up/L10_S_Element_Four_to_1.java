public class L10_S_Element_Four_to_1 {
   public static void main(String[] args) {
      int arr[] = { 3, 2, 2, 3, 1, 2, 3, 3, 2 }; // 1
      System.out.println(singleNumber(arr));
   }

   public static int singleNumber(int[] nums) {
      int ans = 0;
      for (int i = 0; i < 32; i++) {
         int count = 0;
         for (int j = 0; j < nums.length; j++) {

            if ((nums[j] & (1 << i)) != 0) {
               count++;
            }
         }
         if (count % 4 == 1) {
            ans = ans + (1 << i);
         }
      }
      return ans;
   }
}