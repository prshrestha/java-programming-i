
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        String word = reader.nextLine();
        words.add(word);

        while (true) {
            if (word.isEmpty()) {
                break;
            } else {
                System.out.println("Type a word: ");
                word = reader.nextLine();
                words.add(word);
            }
        }
        for (String toPrint : words) {
            System.out.println(toPrint);
        }
    }
}
