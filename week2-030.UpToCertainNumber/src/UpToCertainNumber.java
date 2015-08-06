
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Up to what number?");
        int user = Integer.parseInt(reader.nextLine());
        int n = 1;
        while (n <= user) {
            System.out.println(n);
            n++;
        }
    }
}
