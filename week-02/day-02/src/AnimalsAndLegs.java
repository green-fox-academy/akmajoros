import java.util.Scanner;

public class AnimalsAndLegs {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number of chickens the farmer has");
            int chickenAmount = scanner.nextInt();
            System.out.println("Please enter the number of pigs the farmer has");
            int pigAmount = scanner.nextInt();
            int chickenLegs = chickenAmount * 2;
            int pigLegs = pigAmount * 4;
            int numberofLegs = pigLegs + chickenLegs;
            System.out.println("The number of allthe legs in the farm = " + numberofLegs);
    }
}
