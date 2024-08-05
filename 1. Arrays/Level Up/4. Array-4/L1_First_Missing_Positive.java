public class L1_First_Missing_Positive {
   public static void main(String[] args) {
      int arr[] = { 7, 8, 9, 11, 12 }; // 1
      int arr2[] = { 3, 4, -1, 1 };// 2
      int arr3[] = { 1, 2, 3, 3, 4, 5, 6 };// 7

      System.out.println(FirstMissingPositive(arr));
      System.out.println(FirstMissingPositive(arr2));
      System.out.println(FirstMissingPositive(arr3));
   }

   public static int FirstMissingPositive(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n; i++) {
         int element = arr[i];
         if (element >= 1 && element <= n) {
            int chair = element - 1;

            if (arr[chair] != element) {
               int temp = arr[i];
               arr[i] = arr[chair];
               arr[chair] = temp;
               i--;
            }

         }
      }

      for (int i = 0; i < n; i++) {
         if (i + 1 != arr[i]) {
            return i + 1;
         }
      }
      return n + 1;
   }
}