public class L4_SubArray_Bounded_maximum {
   public static void main(String[] args) {
      int arr[] = { 2, 1, 4, 3 };
      // int n = arr.length;// not necessary to define.
      int left = 2;
      int right = 3;
      System.out.println(Bounded_Max(arr, left, right));

      int arr2[] = { 2, 9, 2, 5, 6 };
      // int n2 = arr2.length;
      int left2 = 2;
      int right2 = 8;
      System.out.println(Bounded_Max(arr2, left2, right2));
   }

   public static int Bounded_Max(int arr[], int left, int right) {
      int start = 0;
      int count = 0;
      int result = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] >= left && arr[i] <= right) {
            count = i - start + 1;
            result += count;
         } else if (arr[i] < left) {
            result += count;
         } else {
            count = 0;
            start = i + 1;
         }
      }
      return result;
   }
}