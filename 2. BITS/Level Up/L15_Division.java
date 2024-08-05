public class L15_Division {
   public static void main(String[] args) {
      int dividend = -1;
      int divisor = -1;

      System.out.println(divide(dividend, divisor));
   }

   public static int divide(int A, int B) {
      int sign = 1;

      long a = A;
      long b = B;
      if (A < 0) {
         sign = sign * -1;
      }
      if (B < 0) {
         sign = sign * -1;
      }

      a = Math.abs(a);
      b = Math.abs(b);

      long result = 0;
      long temp = 0;

      for (int i = 31; i >= 0; i--) {
         if ((temp + (b << i) <= a)) {
            temp += b << i;
            result += ((long) 1 << i);
         }
      }

      if (sign < 0) {
         result = -result;
      }

      if (result > Integer.MAX_VALUE) {
         return Integer.MAX_VALUE;
      } else if (result < Integer.MIN_VALUE) {
         return Integer.MIN_VALUE;
      } else {
         return (int) result;
      }
   }
}