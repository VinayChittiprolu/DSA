public class L5_Flip_Bits {
   public static void main(String[] args) {
      int[] matrix = { 1, 0, 0, 1, 0 };
      int[] matrix_2 = { 1, 0, 0, 1, 0, 0, 1 };

      System.out.println(FlipBits(matrix));// 4
      System.out.println(FlipBits(matrix_2)); // 6
   }

   public static int FlipBits(int[] matrix) {

      int count = 0;
      // Loop through the array to adjust values and count non-zero elements
      for (int i = 0; i < matrix.length; i++) {
         if (matrix[i] == 0) {
            matrix[i] = 1;
         } else {
            matrix[i] = -1;
            count++;
         }
      }

      int current_sum = 0;
      int max_sum = Integer.MIN_VALUE;

      // Loop through the array to find maximum subarray sum using Kadane's algorithm
      for (int i = 0; i < matrix.length; i++) {
         if (current_sum >= 0) {
            current_sum += matrix[i];
         } else {
            current_sum = matrix[i];
         }

         // Update maximum sum encountered so far
         max_sum = Math.max(max_sum, current_sum);
      }

      // Check if there's at least one positive subarray
      if (max_sum > 0) {
         return max_sum + count;
      } else {
         return count;
      }
   }
}