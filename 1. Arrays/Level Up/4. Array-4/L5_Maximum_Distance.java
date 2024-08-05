public class L5_Maximum_Distance {
   public static void main(String[] args) {
      int arr[] = { 1, 0, 0, 0, 1, 0, 1 };
      System.out.println(Max_Distance_to_Closest(arr));

      int arr1[] = { 1, 0, 0, 0 };
      System.out.println(Max_Distance_to_Closest(arr1));

      int arr2[] = { 0, 1 };
      System.out.println(Max_Distance_to_Closest(arr2));
   }

   public static int Max_Distance_to_Closest(int[] arr) {
      int distance = Integer.MIN_VALUE;
      int i = -1;

      for (int j = 0; j < arr.length; j++) {
         if (arr[j] == 1) {
            if (i == -1) {
               distance = Math.max(distance, j);
            } else {
               distance = Math.max(distance, (j - i) / 2);
            }
            i = j;
         }
      }
      distance = Math.max(distance, arr.length - 1 - i);
      return distance;
   }
}