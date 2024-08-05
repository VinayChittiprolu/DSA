public class L5_Max_SubArray_Sum {
   public static void main(String[] args) {
      int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
      System.out.println(maxSubArray(arr)); // 6

      int arr2[] = { 1 };
      System.out.println(maxSubArray(arr2)); // 1

      int arr3[] = { 5, 4, -1, 7, 8 };
      System.out.println(maxSubArray(arr3)); // 23
   }

   public static int maxSubArray(int[] nums) {
      int sum = 0;
      int result = Integer.MIN_VALUE;

      for (int i = 0; i < nums.length; i++) {
         if (sum >= 0) {
            sum += nums[i];
         } else {
            sum = nums[i];
         }
         result = Math.max(sum, result);
      }

      return result;
   }
}