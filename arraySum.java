package Array;

public class arraySum {
  public static void main(String[] args) {
    int arr[] = { 5, 3, 8, 2, 9, 1 };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

    }
    System.err.println(sum);
  }

}
