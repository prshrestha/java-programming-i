
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first word:");
        String userWord1 = reader.nextLine();

        System.out.println("Type the second word:");
        String userWord2 = reader.nextLine();

        if (userWord1.indexOf(userWord2) >= 0) {
            System.out.println("The word " + userWord2 + " is found in the word " + userWord1);
        } else {
            System.out.println("The word " + userWord2 + " is not found in the word " + userWord1);
        }
    }
}
