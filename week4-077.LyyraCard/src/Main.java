
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LyyraCard Pekka = new LyyraCard(20);
        LyyraCard Brian = new LyyraCard(30);

        Pekka.payGourmet();
        System.out.println("Pekka: " + Pekka);
        Brian.payEconomical();
        System.out.println("Brian: " + Brian);

        Pekka.loadMoney(20.00);
        System.out.println("Pekka: " + Pekka);
        Brian.payGourmet();
        System.out.println("Brian: " + Brian);

        Pekka.payEconomical();
        Pekka.payEconomical();
        System.out.println("Pekka: " + Pekka);
        Brian.loadMoney(50);
        System.out.println("Brian: " + Brian);

    }
}
