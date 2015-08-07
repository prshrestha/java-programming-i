
public class Main {

    public static void main(String[] args) {

        GuessingGame game = new GuessingGame();
        game.play(1, 10);  // value to be guessed now within range 1-10
        game.play(10, 99);
    }
}
