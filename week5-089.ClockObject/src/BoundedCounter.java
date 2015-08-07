
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upper) {
        this.upperLimit = upper;
        this.value = 0;
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int newValue) {
        if (newValue > 0 && newValue <= this.upperLimit) {
            this.value = newValue;
        }
    }
}
