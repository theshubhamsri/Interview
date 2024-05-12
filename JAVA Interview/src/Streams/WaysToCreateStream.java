package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysToCreateStream {
    public static void main(String[] args) {
        //From Collection
        List<Integer> salaryList = Arrays.asList(3000, 4100, 9000, 1000, 3500);
        Stream<Integer> streamFromIntegerList = salaryList.stream();
        //From array
        Integer[] salaryArray = {3000, 4100, 9000, 1000, 3500};
        Stream<Integer> streamFromIntegerArray = Arrays.stream(salaryArray);
        //From static method
        Stream<Integer> streamFromStaticMethod= Stream.of(1000, 3500, 4000, 9000);
        //From stream builder
        Stream.Builder<Integer> streamBuilder = Stream.builder(); streamBuilder.add(1000).add(9000).add(3500);
        Stream<Integer> streamFromStreamBuilder = streamBuilder.build();
        //From stream iterate
        Stream<Integer> streamFromIterate = Stream.iterate (1000, (Integer n) -> n + 5000).limit(5);

    }
}
