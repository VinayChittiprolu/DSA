public class L12_T_Elements_Two_to_1 {
   public static void main(String[] args) {
      int[] arr = { 10, 8, 8, 9, 12, 9, 6, 11, 10, 6, 12, 21 };
      // int arr[] = { 1, 2, 1, 3, 2, 5 };

      int result[] = SingleNumber(arr);

      for (int i = 0; i < result.length; i++) {
         System.out.println(result[i] + " ");
      }
   }

   public static int[] SingleNumber(int nums[]) {
      // Step 1: Perform XOR operation on all elements of the array
      int value = 0;
      for (int i = 0; i < nums.length; i++) {
         value = value ^ nums[i];
      }

      // Step 2: Find the rightmost set bit in the XOR result
      int index = 0;
      for (int i = 0; i < 32; i++) {
         if (CheckBit(value, i) == true) {
            index = i;
            break;
         }
      }

      // Step 3: Separate the numbers based on the rightmost set bit
      int SetBit = 0;
      int UnSetBit = 0;
      for (int i = 0; i < nums.length; i++) {
         if (CheckBit(nums[i], index) == true) {
            UnSetBit = UnSetBit ^ nums[i];
         } else {
            SetBit = SetBit ^ nums[i];
         }
      }
      return new int[] { SetBit, UnSetBit };
   }

   public static boolean CheckBit(int n, int i) {
      return (n & (1 << i)) != 0;
   }
}