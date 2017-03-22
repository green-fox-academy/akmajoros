import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number:");
    int chosenNumber = scanner.nextInt();
    System.out.println(factorio(chosenNumber));
  }

  public static int factorio(int number) {
    int j = 1;
    for (int i = 1; i <= number; i++) {
      j = j * i;
      System.out.println(j);
    }
    return j;
  }

}