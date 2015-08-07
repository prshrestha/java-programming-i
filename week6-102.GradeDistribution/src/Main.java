
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type exam scores, -1 completes:");

        Grade grade = new Grade();

        grade.doSomething(reader);
        grade.printStars();
        grade.printAcceptance();
    }
}
