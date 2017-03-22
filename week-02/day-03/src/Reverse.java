import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};

    for (int i = 0; i < aj.length / 2; i++) {
      int last = aj.length - i -1;
      int initial = aj[i];
      aj[i] = aj[last];
      aj[last] = initial;
    }
    System.out.println(Arrays.toString(aj));
  }
}
