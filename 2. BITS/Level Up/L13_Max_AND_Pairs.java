public class L13_Max_AND_Pairs {
   public static void main(String[] args) {
      int[] arr = { 4, 8, 12, 16 };

      for (int i = 31; i >= 0; i--) {
         int count = 0;
         for (int j = 0; j < arr.length; j++) {
            if (CheckBit(arr[j], i) == true) {
               count++;
            }
         }
         if (count >= 2) {
            for (int j = 0; j < arr.length; j++) {
               if (CheckBit(arr[j], i) == false) {
                  arr[j] = 0;
               }
            }
         }
      }

      int index1 = -1;
      int index2 = -1;

      for (int k = 0; k < arr.length; k++) {
         if (arr[k] > 0 && index1 == -1) {
            index1 = k;
         } else if (arr[k] > 0 && index1 != -1) {
            index2 = k;
            break;
         }
      }

      System.out.println((arr[index1] & arr[index2]));
   }

   public static boolean CheckBit(int n, int i) {
      return ((n & (1 << i)) != 0);
   }
}