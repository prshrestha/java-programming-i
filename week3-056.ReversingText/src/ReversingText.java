
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int numberChar = text.length();
        String finalWord = "";
        int counter = 1;
        while (counter <= numberChar) {
            char charPosition = text.charAt(numberChar - counter);
            finalWord = finalWord + charPosition;
            counter++;
        }
        return finalWord;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
