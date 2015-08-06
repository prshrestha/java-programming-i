
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE
        while (hangman.gameOn()) {
            //printMenu();
            System.out.println("Type a command:");
            String command = reader.nextLine();
            if (command.equals("quit")) {
                break;
            } else {
                if (command.equals("status")) {
                    hangman.printStatus();
                } else if (command.length() == 1) {
                    hangman.guess(command);
                } else if (command.isEmpty()) {
                    printMenu();
                }
            }
            hangman.printMan();
            hangman.printWord();
        }

        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
