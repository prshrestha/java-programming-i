
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String secretMessage = "jryy qbar";

        while (true) {
            System.out.println("Type the password:");
            String readPassword = reader.nextLine();

            if (readPassword.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: " + secretMessage);
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
