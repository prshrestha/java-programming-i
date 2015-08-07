
public class NumberStatistics {

    private int amountofNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountofNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.amountofNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        return this.amountofNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.amountofNumbers == 0) {
            return 0;
        } else {
            return (double) this.sum / this.amountofNumbers;
        }
    }
}
