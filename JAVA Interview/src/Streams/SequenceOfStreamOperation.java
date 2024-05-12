package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SequenceOfStreamOperation {
    public static void main(String[] args) {
        //------This will be the output---------//
//        after filter:4
//        after negating:-4
//        after filter:7
//        after negating:-7
//        after filter:10
//        after negating:-10
//        after Sorted:-10
//        after Sorted:-7
//        after Sorted:-4

        List<Integer> numbers =Arrays.asList(2, 1, 4, 7, 10);
        Stream<Integer> numbersStream = numbers.stream()
                .filter((Integer val) -> val >=3)
                .peek((Integer val)-> System.out.println("after filter:" + val))
                //This operation doesn't require the entire stream so stream will be processed sequentially
                .map((Integer val) -> (val * -1))
                .peek((Integer val)-> System.out.println("after negating:" + val))
                //This operation requires all the stream so it will be executed for all the stream at once
                .sorted()
                .peek((Integer val)-> System.out.println("after Sorted:" + val));
        List<Integer> filteredNumberStream =numbersStream.collect(Collectors.toList());
    }
}
