
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account test = new Account("Adam's account", 100.0);
        test.deposit(20.0);
        System.out.println(test.toString());
    }
}
