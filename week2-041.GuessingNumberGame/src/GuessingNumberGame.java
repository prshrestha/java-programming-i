
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess = 1;

        while (true) {

            System.out.println("Guess a number:");
            int user = Integer.parseInt(reader.nextLine());

            if (user == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (user != numberDrawn) {
                if (user < numberDrawn) {
                    System.out.println("The number is greater, guesses made: " + guess);
		    //guess++;
                    //break;	
                } else if (user > numberDrawn) {
                    System.out.println("The number is lesser, guesses made: " + guess);
                    //guess++;
                }
            }
            guess++;
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
