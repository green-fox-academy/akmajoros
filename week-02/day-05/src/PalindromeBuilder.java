import java.util.Scanner;

public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println("Please give me a string: ");
    Scanner scanner = new Scanner(System.in);
    String string1 = scanner.nextLine();
    System.out.println(createPalindrome(string1));
  }
  public static String createPalindrome (String incomingString){
    int length = incomingString.length();
    for (int i = length-1; i >= 0 ; i--) {
      incomingString = incomingString + (incomingString.charAt(i));
    }
    return incomingString;
  }
}