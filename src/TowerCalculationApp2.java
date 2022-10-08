import java.util.Scanner;

public class TowerCalculationApp2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number: ");
        long number = scanner.nextLong();

        for (int i = 2; i <= 9; i++) {
            System.out.print(number + " * " + i + " = " );
            number = number * i;
            System.out.println(number);
        }

        for (int i = 2; i <= 9; i++) {
            System.out.print(number + " / " + i + " = " );
            number = number / i;
            System.out.println(number);
        }


    }

}
