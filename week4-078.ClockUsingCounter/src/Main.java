
import java.util.Scanner;

//public class Main {
//
//    public static void main(String[] args) {
//	BoundedCounter minutes = new BoundedCounter(59);
//	BoundedCounter hours = new BoundedCounter(23);
//
//	int i = 0;
//	while (i < 121) {
//	    System.out.println(hours + ":" + minutes);   // the current time printed
//	    // advance minutes
//	    minutes.next();
//	    // if minutes become zero, advance hours
//	    if (minutes.getValue() == 0) {
//		hours.next();
//	    }
//	    i++;
//	}
//    }
//}
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        // read the initial value of seconds from the user
        System.out.println("seconds: ");
        int s = Integer.parseInt(reader.nextLine());

        // read the initial value of minutes from the user
        System.out.println("minutes: ");
        int m = Integer.parseInt(reader.nextLine());

        // read the initial value of hours from the user
        System.out.println("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while (i < 121) {
            System.out.println(hours + ":" + minutes + ":" + seconds);   // the current time printed
            // advance seconds
            seconds.next();
            // if second becomes zero, advance minutes
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
            // advance minutes
            //minutes.next();
            // if minutes become zero, advance hours

            i++;
        }
    }
}
