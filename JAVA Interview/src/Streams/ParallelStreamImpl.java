package Streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamImpl {
//    Helps to perform operation on stream concurrently, taking advantage of multi core CPU.
//    ParallelStream() method is used instead of regular stream() method.
//    Internally it does:
//  - Task splitting: it uses "spliterator" function to split the data into multiple chunks.
//    Task submission and parallel processing: Uses Fork-Join pool technique.
    public static void main(String[] args) {
        List<Integer> numbers =Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 110);
        // Sequential processing
        long sequentialProcessingStartTime = System.currentTimeMillis();
        numbers.stream().
        map((Integer val)->val*val)
                .forEach((Integer val) -> System.out.println(val));
        System.out.println("Sequential processing Time Taken:"+ (System.currentTimeMillis() -sequentialProcessingStartTime) +"millisecond");
        // Parallel processing
        long parallelProcessingStartTime = System.currentTimeMillis();
        numbers.parallelStream().
        map((Integer val) -> val*val)
                .forEach((Integer val) -> System.out.println(val));
        System.out.println("Parallel processing Time Taken:" +(System.currentTimeMillis() -parallelProcessingStartTime) + "millisecond");
    }
}
