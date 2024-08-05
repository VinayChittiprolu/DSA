public class L1_Max_Chunks_Sorted_1 {
   public static void main(String[] args) {
      int arr[] = { 4, 3, 2, 1, 0 };
      System.out.println(MaxChunksSorted1(arr));

      int arr2[] = { 1, 0, 2, 3, 4 };
      System.out.println(MaxChunksSorted1(arr2));
   }

   public static int MaxChunksSorted1(int arr[]) {
      int count = 0;
      int max_value = 0;

      for (int i = 0; i < arr.length; i++) {
         max_value = Math.max(max_value, arr[i]);
         if (max_value == i) {
            count++;
         }
      }
      return count;
   }
}