
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
	int majorityAge = 18;
		
	System.out.println("How old are you?");
	int age = Integer.parseInt(reader.nextLine());
	
	if (age >= majorityAge){
	    System.out.println("You have reached the age of majority!");
	}
	else {
	    System.out.println("You have not reached the age of majority yet!");
	}
    }
}
