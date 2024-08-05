import java.util.Scanner;

public class L3_Pivot_Index {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }

      System.out.println(pivotIndex(arr));
      scn.close();
   }

   public static int pivotIndex(int[] nums) {

      int leftsum = 0;
      int rightsum = 0;

      for (int i = 0; i < nums.length; i++) {
         rightsum = rightsum + nums[i];
      }

      for (int i = 0; i < nums.length; i++) {
         if (leftsum == rightsum - leftsum - nums[i]) {
            return i;
         } else {
            leftsum = leftsum + nums[i];
         }
      }
      return -1;
   }
}