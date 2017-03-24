import java.util.Scanner;

public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println("Please enter a word:");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();

    int length = string.length();
    for (int i = length-1; i >= 0 ; i--) {
      string = string + (string.charAt(i));
    }

  }
}