import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Please give me a number!");
    int chosenNumber = scanner.nextInt();
    System.out.println(sumNumbers(chosenNumber));
  }
  public static int sumNumbers (int number) {
    int a2 = 0;
    for(int a = 0; a < number; a++){//a+=(a+1){
      a2 = a + a2;
      //System.out.println(a);
    }
    return a2;
  }
}
