
public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Pekka", "040-123654");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        phonebook.printAll();
    }
}
