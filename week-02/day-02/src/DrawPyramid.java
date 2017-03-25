import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type the number of line the pyramid should have!");
    int pyramidHeight = scanner.nextInt();

    for (int i = 0; i < pyramidHeight; i++) {
      for (int j = i; j < pyramidHeight; j++){
        if(j < pyramidHeight){
          System.out.print(" ");
        }
      }
      for (int k = 0; k <= i * 2; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}