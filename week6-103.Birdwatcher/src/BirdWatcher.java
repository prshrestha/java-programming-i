
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class BirdWatcher {

    private final ArrayList<Bird> birdWatch;
    private Bird bird;

    public BirdWatcher() {
        this.birdWatch = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName) {
        bird = new Bird(name, latinName);
        this.birdWatch.add(bird);
    }

    public ArrayList<Bird> getBirds() {
        return this.birdWatch;
    }

    public void statistics() {
        for (Bird b : birdWatch) {
            System.out.println(b);
        }
    }
}
