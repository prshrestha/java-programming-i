
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int divisor = 2;

        System.out.println("Type a number:");
        int a = Integer.parseInt(reader.nextLine());

        if (a % divisor == 0) {
            System.out.println("Number " + a + " is even.");
        } else {
            System.out.println("Number " + a + " is odd.");
        }
    }
}
