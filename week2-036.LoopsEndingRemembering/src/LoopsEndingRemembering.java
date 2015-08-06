
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);

        int sentinel = -1;
        int input;
        int sum = 0;
        int counter = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Type numbers: ");
        input = Integer.parseInt(reader.nextLine());

        while (input != sentinel) {
            sum += input;
            counter++;
            avg = (double) sum / counter;

	    //check for even or odd
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            System.out.println("Type numbers:");
            input = Integer.parseInt(reader.nextLine());
        }

        System.out.println("");
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
