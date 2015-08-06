
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int lowerLimit, upperLimit, n;

        System.out.println("First:");
        lowerLimit = Integer.parseInt(reader.nextLine());

        System.out.println("Last");
        upperLimit = Integer.parseInt(reader.nextLine());

        for (n = lowerLimit; n <= upperLimit; n++) {
            System.out.println(n);
        }
    }
}
