import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Random random = new Random();
    int storedNumber = random.nextInt(20);
    int guess = 0;

    do {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Guess a number between 0 and 20: ");
      guess = scanner.nextInt();

      if (guess > storedNumber)
      {
        System.out.println("The stored number is smaller");
      }
      if (guess < storedNumber)
      {
        System.out.println("The stored number is bigger");
      }
    } while( guess != storedNumber);
    System.out.println("Yaaay! You got the answer correctly");
  }
}
