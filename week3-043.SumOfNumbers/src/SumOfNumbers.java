
public class SumOfNumbers {

    public static int sum(int number1, int number2, int number3, int number4) {

	//System.out.println("number1");
        //number1 = Integer.parseInt(reader.nextLine());
	//System.out.println("number2");
        //number2 = Integer.parseInt(reader.nextLine());
	//System.out.println("number3");
        //number3 = Integer.parseInt(reader.nextLine());
	//System.out.println("number4");
        //number4 = Integer.parseInt(reader.nextLine());
        int answer = number1 + number2 + number3 + number4;

        return answer;
    }

    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }
}
