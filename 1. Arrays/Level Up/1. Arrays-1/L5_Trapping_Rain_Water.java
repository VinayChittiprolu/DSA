public class L5_Trapping_Rain_Water {
   public static void main(String[] args) {
     
      // int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
      int height[] = { 4, 2, 0, 3, 2, 5 };
      int n = height.length;
      
      int[] prefix = new int[n];
      int[] suffix = new int[n];

      prefix[0] = height[0];
      for (int i = 1; i < n; i++) {
         prefix[i] = Math.max(prefix[i - 1], height[i]);
      }

      suffix[n - 1] = height[n - 1];
      for (int i = n - 2; i >= 0; i--) {
         suffix[i] = Math.max(suffix[i + 1], height[i]);
      }

      int result = 0;
      for (int i = 0; i < n; i++) {
         result = result + Math.min(prefix[i], suffix[i]) - height[i];
      }

      System.out.println(result);
   }
}