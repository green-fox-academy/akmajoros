import java.util.Arrays;

public class SumAll {
  public static void main(String[] args) {
    int[] a = {3, 4, 5, 6, 7};
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    System.out.println(sum);
  }
}

