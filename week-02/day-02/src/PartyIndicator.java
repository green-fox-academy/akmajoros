import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter the number of girls you want to invite to the party!");
      int girls = scanner.nextInt();
      System.out.println("Please enter the number of boys you want to invite to the party!");
      int boys = scanner.nextInt();
      boolean gbequal = (girls == boys);
      boolean manypeople = (girls + boys >= 20);
      boolean gbuneqal = (girls != boys);
      boolean notsomanyppl = (girls + boys < 20);

    if (gbequal && manypeople) {
      System.out.println("The party is excelent");
    } else if (gbuneqal && manypeople && girls > 0) {
      System.out.println("Quite cool party!");
    } else if (notsomanyppl) {
      System.out.println("Average party...");
    } else if (girls == 0) {
      System.out.println("Sausage party");
    }
  }
}