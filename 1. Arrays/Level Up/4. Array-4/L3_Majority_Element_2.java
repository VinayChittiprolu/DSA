import java.util.ArrayList;
import java.util.List;

public class L3_Majority_Element_2 {
   public static void main(String[] args) {
      int[] nums = { 1, 2 };
      int[] nums2 = { 3, 2, 3 };

      List<Integer> result = MajorityElement2(nums);
      System.out.println(result);

      List<Integer> result2 = MajorityElement2(nums2);
      System.out.println(result2);
   }

   public static List<Integer> MajorityElement2(int nums[]) {
      int value1 = 0;
      int value2 = 0;
      int count1 = 0;
      int count2 = 0;

      for (int i = 0; i < nums.length; i++) {
         if (count1 == 0) {
            value1 = nums[i];
            count1 = 1;
         } else if (count2 == 0) {
            value2 = nums[i];
            count2 = 1;
         } else if (value1 == nums[i]) {
            count1++;
         } else if (value2 == nums[i]) {
            count2++;
         } else {
            count1--;
            count2--;
         }
      }

      int c1 = 0;
      int c2 = 0;
      for (int i = 0; i < nums.length; i++) {
         int number = nums[i];
         if (number == value1) {
            c1++;
         } else if (number == value2) {
            c2++;
         }
      }

      List<Integer> ans = new ArrayList<>();
      if (c1 > nums.length / 3) {
         ans.add(value1);
      }
      if (c2 > nums.length / 3) {
         ans.add(value2);
      }
      return ans;
   }
}