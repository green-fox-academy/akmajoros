import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please give me a number that will define the height of the square");

    int size = input.nextInt();

    for (int i = 1; i <= size; i++) {
      if ( i == 1 || i == size ) {
        for (int j = 0; j < size; j++) {
          System.out.print("%");
        }
      }
      else {

        for (int j = 1; j <= size; j++) {
          if ( j == 1 || j == size || j == i) {
            System.out.print("%");
          }
          else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}