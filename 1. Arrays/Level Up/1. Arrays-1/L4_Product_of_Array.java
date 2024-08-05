import java.util.Scanner;

public class L4_Product_of_Array {
   public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int nums[] = new int[n];

      for (int i = 0; i < n; i++) {
         nums[i] = scn.nextInt();
      }

      int[] result = productExceptSelf(nums);
      for (int i = 0; i < n; i++) {
         System.out.print((result[i]) + " ");
      }
      
      System.out.println();

      scn.close();
   }

   public static int[] productExceptSelf(int[] nums) {

      int prefix[] = new int[nums.length];
      prefix[0] = nums[0];
      for (int i = 1; i < nums.length; i++) {
         prefix[i] = prefix[i - 1] * nums[i];
      }

      int sufix = 1;
      for (int i = nums.length - 1; i > 0; i--) {
         prefix[i] = prefix[i - 1] * sufix;
         sufix = sufix * nums[i];
      }
      prefix[0] = sufix;

      return prefix;
   }
}