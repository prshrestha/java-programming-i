
import java.util.Scanner;

public class LengthOfName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        //String userName;
        System.out.println("Type your name:");
        String userName = reader.nextLine();

        int numberChar = calculateCharacters(userName);

        System.out.println("Number of characters: " + numberChar);
    }

    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String text) {
        //int numberChar;
        int numberChar = text.length();
        return numberChar;
    }
}
