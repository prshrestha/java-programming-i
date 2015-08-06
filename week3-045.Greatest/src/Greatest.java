
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int result = 0;

        if (number1 > number2 && number1 > number3) {
            result = number1;
        } else if (number2 > number1 && number2 > number3) {
            result = number2;
        } else if (number3 > number1 && number3 > number2) {
            result = number3;
        } else if (number1 == number2 && number1 > number3) {
            result = number1;
        } else if (number1 == number3 && number1 > number2) {
            result = number1;
        } else if (number2 == number3 && number2 > number1) {
            result = number2;
        } else if (number1 == number2 && number1 == number3) {
            result = number1;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
