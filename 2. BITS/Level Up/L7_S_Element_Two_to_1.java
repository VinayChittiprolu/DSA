public class L7_S_Element_Two_to_1 {
   public static void main(String[] args) {
      int arr[] = { 4, 2, 4, 9, 2, 8, 9 }; // 8
      int ans = arr[0];

      for (int i = 1; i < arr.length; i++) {
         ans = ans ^ arr[i];
      }

      System.out.println(ans);
   }
}