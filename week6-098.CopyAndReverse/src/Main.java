
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] test = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            test[i] = array[i];
        }
        return test;
    }

    public static int[] reverseCopy(int[] array) {
        int[] test = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            test[i] = array[array.length - i - 1];
        }
        return test;
    }
}
