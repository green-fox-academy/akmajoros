import sun.plugin2.util.SystemUtil;

import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a number!");
      int number1 = scanner.nextInt();
      System.out.println("Please enter another number!");
      int number2 = scanner.nextInt();

    if (number1 > number2) {
      System.out.println(number1);
    } else if (number2 > number1) {
      System.out.println(number2);
    } else {
      System.out.println("The numbers are equal");
    }
  }

}
