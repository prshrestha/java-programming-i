
public class Main {

    public static void main(String[] args) {
        Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
        Person steve = new Person("Steve");

        System.out.println(pekka);
        System.out.println(steve);
    }
}
