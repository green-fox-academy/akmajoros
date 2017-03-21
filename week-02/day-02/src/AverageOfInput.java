import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int integer1 = scanner.nextInt();
        System.out.println("Please enter another integer");
        int integer2 = scanner.nextInt();
        System.out.println("Please enter another integer");
        int integer3 = scanner.nextInt();
        System.out.println("Please enter another integer");
        int integer4 = scanner.nextInt();
        System.out.println("Please enter another integer");
        int integer5 = scanner.nextInt();
        int sum = integer1 + integer2 + integer3 + integer4 + integer5;
        int average = sum / 4;
        System.out.println("The sum of the integers you provided = " + sum);
        System.out.println("The average of the integers you provided = " + average);
    }
}
