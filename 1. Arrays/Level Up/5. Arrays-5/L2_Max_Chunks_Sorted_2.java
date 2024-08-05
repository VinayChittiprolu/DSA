public class L2_Max_Chunks_Sorted_2 {
   public static void main(String[] args) {
      int[] arr = { 5, 4, 3, 2, 1 };
      System.out.println(MaxChunkssorted2(arr));

      int[] arr2 = { 2, 1, 3, 4, 4 };
      System.out.println(MaxChunkssorted2(arr2));
   }

   public static int MaxChunkssorted2(int[] arr) {
      int n = arr.length;
      int[] prefixmax = new int[n];
      prefixmax[0] = arr[0];
      for (int i = 1; i < n; i++) {
         prefixmax[i] = Math.max(prefixmax[i - 1], arr[i]);
      }

      int[] suffixmin = new int[n];
      suffixmin[n - 1] = arr[n - 1];
      for (int i = n - 2; i >= 0; i--) {
         suffixmin[i] = Math.min(suffixmin[i + 1], arr[i]);
      }

      int count = 0;
      for (int i = 0; i < n - 1; i++) {
         if (prefixmax[i] <= suffixmin[i + 1]) {
            count++;
         }
      }
      count++;
      return count;
   }
}