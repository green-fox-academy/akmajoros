import java.util.Arrays;

public class PrintElement {
  public static void main(String[] args) {
    int[] af = {4, 5, 6, 7};
    System.out.println(Arrays.toString(af));

    for (int afs : af) {
      System.out.println(afs);
    }
  }
}
