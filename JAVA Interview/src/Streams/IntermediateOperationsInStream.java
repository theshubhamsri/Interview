package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperationsInStream {
    //Intermediate operations are lazy, they will work when there is a terminal operation
    public static void main(String[] args) {

        //Filter the element
        Stream<String> nameStream = Stream.of("HELLO", "EVERYBODY", "HOW", "ARE", "YOU", "DOING");
        Stream<String> filteredStream =nameStream.filter((String name) -> name.length() <= 3);
        List<String> filteredNameList = filteredStream.collect(Collectors.toList());

        //Used to transform each element
        Stream<String> nameStreamMap =Stream.of("HELLO", "EVERYBODY", "HOW", "ARE", "YOU", "DOING");
        Stream<String> filteredNames = nameStreamMap.map((String name)-> name.toLowerCase());

        //Used to iterate over all the element of the complex collection and flatten it
        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I", "LOVE", "JAVA"), Arrays.asList("CONCEPTS", "ARE", "CLEAR"), Arrays.asList("ITS", "VERY", "EASY")
        );
        Stream<String> wordsStream1= sentenceList.stream()
                .flatMap((List<String> sentence)-> sentence.stream());
        Stream<String> wordsStream2=sentenceList.stream()
                .flatMap((List<String> sentence)-> sentence.stream().map((String value)-> value.toLowerCase()));

        //----Removes duplicate---------//
        Integer[] arr = {1,5,2,7,4,4,2,0,9};
        Stream<Integer> arrStream = Arrays.stream(arr).distinct();

        //---------Sort the element-------------------//
        Integer[] arr1 = {1,5,2,7,4,4,2,0,9};
        Stream<Integer> arrStream1 = Arrays.stream(arr1).sorted();
        Integer[] arr2 = {1,5,2,7,4,4,2,8,9};
        Stream<Integer> arrStream2 =Arrays.stream(arr2).sorted ((Integer val1, Integer val2) -> val2-val1);

        //-------Helps to see the intermediate stream that is getting processed----------------//
        List<Integer> numbers = Arrays.asList(2,1,3,4,6);
        Stream<Integer> numberStream = numbers.stream()
                .filter((Integer val) -> val>2)
                .peek((Integer val) -> System.out.println(val)) //it will print 3, 4, 6
                .map((Integer val) -> -1*val);
        List<Integer> numberList = numberStream.collect(Collectors.toList());

        //-----Truncate the stream to have no longer size than given maxSize----------//

        List<Integer> numbers1 = Arrays.asList(2,1,3,4,6);
        Stream<Integer> numberStream1 = numbers1.stream().limit(3);
        List<Integer> numberList1 = numberStream1.collect(Collectors.toList());
        //Output: 2, 1, 3

        //------Skip the first n element of the stream---------------//

        List<Integer> numbers2 = Arrays.asList(2,1,3,4,6);
        Stream<Integer> numberStream2 = numbers2.stream().skip( 3);
        List<Integer> numberList2 = numberStream2.collect(Collectors.toList());
        //Output: 4,6

        //--------Helps to work with primitive data int--------------//

        List<String> numbers3= Arrays.asList("2", "1", "4", "7");
        IntStream numberStream3= numbers3.stream().mapToInt((String val) -> Integer.parseInt(val));
        int[] numberArray = numberStream3.toArray();
        //Output: 2, 1, 4, 7
        int[] numbersArray4= {2, 1, 4, 7};
        IntStream numbersStream4 = Arrays.stream(numbersArray4);
        //Supplier<Stream<IntStream>> streamSupplier=numbersStream4.filter((int val) -> val > 2);
        int[] filteredArray= numbersStream4.filter((int val) -> val > 2).toArray();
        //Supplier<Stream<IntStream>> streamSupplier= (Supplier<Stream<IntStream>>) numbersStream4.filter((int val) -> val > 2);
        //This point is causing issue need to check it
        //int[] filteredArray= numbersStream4.toArray(); //This is not working not sure why
        //Output: 4,7

    }
}
