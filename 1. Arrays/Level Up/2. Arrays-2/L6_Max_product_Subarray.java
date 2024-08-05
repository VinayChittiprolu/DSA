public class L6_Max_product_Subarray {
   public static void main(String[] args) {
      int arr[] = { 2, 3, -2, 4 };
      System.out.println(maxProduct(arr)); // 6

      int arr1[] = { -2, 0, -1 };
      System.out.println(maxProduct(arr1)); // 0
   }

   public static int maxProduct(int[] nums) {
      int prefix = 1;
      int max_1 = Integer.MIN_VALUE;

      for (int i = 0; i < nums.length; i++) {
         if (prefix == 0) {
            prefix = nums[i];
         } else {
            prefix = prefix * nums[i];
         }
         max_1 = Math.max(max_1, prefix);
      }

      int suffix = 1;
      int max_2 = Integer.MIN_VALUE;

      for (int i = nums.length - 1; i >= 0; i--) {
         if (suffix == 0) {
            suffix = nums[i];
         } else {
            suffix = suffix * nums[i];
         }
         max_2 = Math.max(max_2, suffix);
      }
      return Math.max(max_1, max_2);
   }
}