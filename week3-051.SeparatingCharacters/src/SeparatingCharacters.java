
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = reader.nextLine();
        int numberChar = name.length();
        int counter = 1;

        while (counter <= numberChar) {
            char charAtCounter = name.charAt(counter - 1);
            if (charAtCounter == 0) {
                System.out.println(counter + "." + " character: " + Character.toUpperCase(charAtCounter));
            } else {
                System.out.println(counter + "." + " character: " + charAtCounter);
            }
            counter++;
        }
    }
}
