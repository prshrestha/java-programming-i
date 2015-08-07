
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Grade {

    String grade0 = "";
    String grade1 = "";
    String grade2 = "";
    String grade3 = "";
    String grade4 = "";
    String grade5 = "";

    int sum;
    double acrate;

    public void doSomething(Scanner scanner) {
        while (true) {
            int a = Integer.parseInt(scanner.nextLine());
            if (a == -1) {
                break;
            } else if (a >= 0 && a <= 29) {
                grade0 += "*";
            } else if (a >= 30 && a <= 34) {
                grade1 += "*";
            } else if (a >= 35 && a <= 39) {
                grade2 += "*";
            } else if (a >= 40 && a <= 44) {
                grade3 += "*";
            } else if (a >= 45 && a <= 49) {
                grade4 += "*";
            } else if (a >= 50 && a <= 60) {
                grade5 += "*";
            }
        }
    }

    public void printStars() {
        System.out.println("Grade distribution:");
        System.out.println("5: " + grade5);
        System.out.println("4: " + grade4);
        System.out.println("3: " + grade3);
        System.out.println("2: " + grade2);
        System.out.println("1: " + grade1);
        System.out.println("0: " + grade0);
    }

    public void sum() {
        //Calculate acceptance rate
        sum = grade1.length() + grade2.length()
                + grade3.length() + grade4.length()
                + grade5.length() + grade0.length();
    }

    public void printAcceptance() {
        sum();
        if (sum == 0) {
            acrate = 0.0;
        } else {
            acrate = (sum - grade0.length()) * 100 / sum;
        }
        System.out.println("Acceptance percentage: " + acrate);
    }
}
