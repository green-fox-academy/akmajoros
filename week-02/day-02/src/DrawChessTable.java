import java.util.Scanner;

public class DrawChessTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of the chess table:");
    int length = scanner.nextInt();

    for (int i = 1; i <= length; i++){
      for (int j = 1; j < length; j++){
        if((i + j) % 2 == 0){
          System.out.print("#");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
