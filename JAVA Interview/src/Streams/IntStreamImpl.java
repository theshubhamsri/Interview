package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamImpl {
    public static void main(String[] args) {
        // Creating an IntStream
        IntStream stream = IntStream.of(1, 3, 5, 7, 9);

        // Using IntStream toArray()
        int[] arr = stream.toArray();

        // Displaying the elements in array arr
        System.out.println(Arrays.toString(arr));
    }
}
