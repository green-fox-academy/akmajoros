import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me the number of integers you want me to add up:");
    int numOfIntegers = scanner.nextInt();
    int total = 0;
    int count = 0;

    for ( int i = 1; i <= numOfIntegers; i++) {
      Scanner integers = new Scanner(System.in);
      System.out.println("Please enter the integer");
      int integersToAdd = integers.nextInt();
      count ++;
      total += integersToAdd;
    }
    System.out.println("Sum: " + total + ", Average: " + total/count);
  }
}