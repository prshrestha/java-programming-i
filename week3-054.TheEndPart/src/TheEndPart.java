
import java.util.Scanner;

public class TheEndPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word:");
        String userWord = reader.nextLine();
        int wordLength = userWord.length();

        System.out.println("Length of the end part:");
        int userLength = Integer.parseInt(reader.nextLine());

        String answer = userWord.substring(wordLength - (userLength));

        System.out.println("Result: " + answer);
    }
}
