public class L5a_Simpler_code {
   public static void main(String[] args) {
      // int height[] = { 4, 2, 0, 3, 2, 5 };
      // int height[] = { 4, 2, 4 };
      int height[] = { 2, 3, 3, 1, 0, 4 };

      int sp = 0; // starting index[]
      int ep = height.length - 1; // last index[n-1]

      int result = 0;

      int lmax = -1;
      int rmax = -1;

      while (sp < ep) {
         lmax = Math.max(lmax, height[sp]);
         rmax = Math.max(rmax, height[ep]);

         if (lmax < rmax) {
            result += lmax - height[sp];
            sp++;
         } else {
            result += rmax - height[ep];
            ep--;
         }
      }
      System.out.println(result); // 5
   }
}