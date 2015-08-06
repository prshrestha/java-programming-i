
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word:");
        String userWord = reader.nextLine();

        System.out.println("Length of the first part:");
        int userLength = Integer.parseInt(reader.nextLine());

        String answer = userWord.substring(0, userLength);

        System.out.println("Result: " + answer);
    }
}
