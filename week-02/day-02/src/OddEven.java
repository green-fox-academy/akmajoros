import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        double number = scanner.nextDouble();
     if (number % 2 == 0){
         System.out.println("Even");
     } else {
         System.out.println("Odd");
     }
    }
}
