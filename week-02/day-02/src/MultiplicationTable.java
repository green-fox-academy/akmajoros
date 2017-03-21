import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number");
    int number = scanner.nextInt();

    for (int a = 1; a < 11; a++) {
      System.out.println(a + " * " + number + " = " + (a * number));
    }
  }
}
