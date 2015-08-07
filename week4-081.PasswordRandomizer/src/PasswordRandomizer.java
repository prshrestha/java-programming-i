
import java.util.Random;

public class PasswordRandomizer {

    private Random random = new Random();
    private int length;
    private String alphabets = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        int charPosition;
        String password = "";
        while (i < this.length) {
            charPosition = random.nextInt(alphabets.length());
            password += alphabets.charAt(charPosition);
            i++;
        }
        return password;
    }
}
