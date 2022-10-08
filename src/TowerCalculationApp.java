import java.util.Scanner;

public class TowerCalculationApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number: ");
        long number = scanner.nextLong();

        int counter = 2;
        while (counter <= 9) {
            System.out.print(number + " * " + counter + " = " );
            number = number * counter;
            System.out.println(number);
            counter++;
        }
        counter = 2;
        while (counter <= 9) {
            System.out.print(number + " / " + counter + " = " );
            number = number / counter;
            System.out.println(number);
            counter++;
        }


    }
}
