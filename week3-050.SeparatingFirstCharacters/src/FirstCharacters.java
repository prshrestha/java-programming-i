
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = reader.nextLine();
        int numberChar = name.length();
        char firstChar;
        char secondChar;
        char thirdChar;

        if (numberChar >= 3) {

            firstChar = name.charAt(0);
            secondChar = name.charAt(1);
            thirdChar = name.charAt(2);

            System.out.println("1. character: " + firstChar);
            System.out.println("2. character: " + secondChar);
            System.out.println("3. character: " + thirdChar);
        }
    }
}
