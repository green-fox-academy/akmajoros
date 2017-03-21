import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number!");
    int number1 = scanner.nextInt();
    System.out.println("Please give me another number");
    int number2 = scanner.nextInt();

    if (number1 >= number2) {
      System.out.println("The second number should be bigger!");
    } else if (number1 < number2) {
      for (int a = number1; a < number2; a++) {
        System.out.println(a);
      }
    }
  }
}