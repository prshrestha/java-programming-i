
import java.util.Random;

public class Dice {

    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        return random.nextInt(this.numberOfSides) + 1;
        // (int max - int min + 1) + int min
    }
}
