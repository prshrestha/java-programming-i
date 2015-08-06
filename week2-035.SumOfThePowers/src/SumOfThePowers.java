
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int base = 2;
        int power = 0;  //this is the power to start with
        int powerMax; //the user input max power
        int sum = 0;

        System.out.println("Type a number: ");
        powerMax = Integer.parseInt(reader.nextLine());

        while (power <= powerMax) {
            sum += Math.pow(base, power);
            power++;
        }
        System.out.println("The result is " + sum);
    }
}
