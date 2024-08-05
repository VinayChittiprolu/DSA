public class L2_Range_Sum_Query_immu {

   public static void main(String[] args) {
      int[] nums = { 1, 2, 3, 4, 5, 6 };
      int left = 2;
      int right = 4;

      NumArray(nums);

      for (int i = left - 1; i < nums.length; i++) {
         if (left > 0) {
            System.out.print(nums[right] - nums[left - 1]);
         } else {
            System.out.print(nums[right]);
         }
      }
   }

   public static void NumArray(int nums[]) {
      int arr[] = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
         if (i == 0) {
            arr[i] = arr[i];
         } else {
            arr[i] = arr[i - 1] + nums[i];
         }
      }
      // return arr;
   }
}