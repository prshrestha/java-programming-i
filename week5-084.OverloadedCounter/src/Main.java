
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Counter c = new Counter(2, true);
        System.out.println("Value of c: " + c.value());

        c.decrease();
        System.out.println("Value of c after decrease: " + c.value());

        c.decrease(2);
        System.out.println("Value of c after decrease by 2: " + c.value());

        c.increase();
        System.out.println("Value of c after increase: " + c.value());

        c.increase(3);
        System.out.println("Value of c after increase by 3: " + c.value());
    }
}
