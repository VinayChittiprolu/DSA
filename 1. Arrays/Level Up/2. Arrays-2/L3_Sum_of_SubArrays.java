public class L3_Sum_of_SubArrays {
   public static void main(String[] args) {
      int[] arr = { 5, 3, -1, 8 };
      int n = arr.length;
      System.out.println(sum_of_subarray(arr, n));
      int[] arr2 = { 1, 2, 3, 4, 5 };
      int m = arr2.length;
      System.out.println(sum_of_subarray(arr2, m));
   }

   public static int sum_of_subarray(int arr[], int n) {
      int sum = 0;
      for (int i = 0; i < n; i++) {
         int occ = (i + 1) * (n - i);
         sum = sum + (occ * arr[i]);
      }
      return sum;
   }
}