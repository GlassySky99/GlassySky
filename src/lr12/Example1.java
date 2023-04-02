package lr12;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Random;
public class Example1 {

    public static int[] geteven(int[] raw) {
        return IntStream.of(raw).filter(x -> x % 2 == 0).toArray();
    }

    public static void main(String[] args) {
        int[] arr = new Random().ints(25, 1, 1000).toArray();
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Required array: " + Arrays.toString(geteven(arr)));
    }
}
