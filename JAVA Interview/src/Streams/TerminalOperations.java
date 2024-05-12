package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {

//    How many times we can use a single stream?
//    One Terminal Operation is used on a Stream, it is closed/consumed and can not be used again for another terminal operation.
    public static void main(String[] args) {
        //--------Perform action on each element of the stream do not return any value--------//
        List<Integer> numbers = Arrays.asList(2, 1, 4, 7, 10);
        numbers.stream()
                .filter((Integer val) -> val >=3)
                .forEach((Integer val)-> System.out.println(val));
        //OUTPUT: 4, 7, 10

        //--------Collect the number of the element of the stream into an array------//
        List<Integer> numbers1 = Arrays.asList(2, 1, 4, 7, 10);
        Object[] filteredNumberArrType1 = numbers1.stream()
                .filter((Integer val) -> val >=3)
                .toArray();
        Integer[] filteredNumberArrType2 = numbers1.stream()
                .filter((Integer val) -> val >=3) .toArray((int size) -> new Integer [size]);

        //-------------Does reduction on the stream perform associative aggregation function------//

        List<Integer> numbers2 = Arrays.asList(2, 1, 4, 7, 10);
        Optional<Integer> reducedValue = numbers2.stream() .reduce((Integer val1, Integer val2) -> val1+val2);
        System.out.println(reducedValue.get());
        //output: 24

        //-----Can be used to collect the element of the stream into list-----------//

        List<Integer> numbers3 = Arrays.asList(2, 1, 4, 7, 10);
        List<Integer> filteredNumber = numbers3.stream()
                .filter((Integer val) -> val >=3)
                .collect(Collectors.toList());

        //----------Find the minimum or the maximum element from the stream based on the comparator provided-------//

        List<Integer> numbers4 = Arrays.asList(2, 1, 4, 7, 10);
        Optional<Integer> minimumValueType1 = numbers4.stream().
        filter((Integer val) -> val>=3)
                .min((Integer val1, Integer val2) -> val1-val2);
        System.out.println(minimumValueType1.get());
        //output: 4
        Optional<Integer> minimumValueType2 = numbers.stream()
                .filter((Integer val) -> val>=3) .min((Integer val1, Integer val2) -> val2-val1);
        System.out.println(minimumValueType2.get());
        //output: 10

        //-----------------Return the count of the element present in stream-------------//
        List<Integer> numbers5 = Arrays.asList(2, 1, 4, 7, 10);
        Long noOfValuesPresent = numbers5.stream() .filter((Integer val1) -> val1>=3) .count();
        System.out.println(noOfValuesPresent);
        //output: 3

        //----------------Check if any value matches in stream with the given predicate and return boolean value-------------//
        List<Integer> numbers6 = Arrays.asList(2, 1, 4, 7, 10);
        boolean hasValueGreaterThanThree = numbers6.stream() .anyMatch((Integer val) -> val>3);
        System.out.println(hasValueGreaterThanThree);
        //output: true

        //-----------------Find the first element of the stream------------//
        List<Integer> numbers7 = Arrays.asList(2, 1, 4, 7, 10);
        Optional<Integer> firstValue = numbers7.stream()
                .filter((Integer val) -> val >= 3)
                .findFirst();
        System.out.println(firstValue.get());
        //output: 4

    }
}
