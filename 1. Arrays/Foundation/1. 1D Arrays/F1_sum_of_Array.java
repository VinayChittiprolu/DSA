import java.util.Scanner;

public class F1_sum_of_Array {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // System.out.print("Enter the length of an Array: ")
    int length = scn.nextInt();
    int[] arr = new int[length];
    
    // System.out.print("Enter the elements of an Array: ");
    for (int i = 0; i < length; i++) {
      arr[i] = scn.nextInt();
    }

    int sum = 0;
    for (int i = 0; i < length; i++) {
      sum = sum + arr[i];
    }
    System.out.println("Sum of an Array: " + sum);
    scn.close();
  }
}