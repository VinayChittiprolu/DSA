public class L2_Majority_Element {
   public static void main(String[] args) {
      int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
      int nums1[] = { 3, 2, 3 };
      int nums2[] = { 5, 2, 3, 3, 3 };
      System.out.println(MajorityElement(nums));
      System.out.println(MajorityElement(nums1));
      System.out.println(MajorityElement(nums2));
   }

   public static int MajorityElement(int nums[]) {
      int value = 0;
      int count = 0;

      for (int i = 0; i < nums.length; i++) {
         if (count == 0) {
            value = nums[i];
            count = 1;
         } else if (value == nums[i]) {
            count++;
         } else {
            count--;
         }
      }
      return value;
   }
}