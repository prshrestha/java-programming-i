
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int factorial = 1;
        int multiplier = 1;

        System.out.println("Type a number:");
        int number = Integer.parseInt(reader.nextLine());

        if (number == 0) {
            System.out.println("Factorial is " + factorial);
        } else {
            while (multiplier <= number) {
                factorial *= multiplier;
                multiplier++;
            }
            System.out.println("Factorial is " + factorial);
        }
    }
}
