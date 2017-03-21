import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number that is a distance in kilometers");
        int kiloMeter = scanner.nextInt();
        double mileConvert = 0.621371192;
        double miles = kiloMeter * mileConvert;
        System.out.println(miles);
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}
