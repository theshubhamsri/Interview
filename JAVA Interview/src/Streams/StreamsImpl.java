package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsImpl {
    //The original collection remains untouched and new stream is created and operations are performed
    //on that, There can be only one terminal operation
//    We can consider Stream as a pipeline, through which our collection elements passes through.
//    While elements passes through pipelines, it perform various operations like sorting, filtering etc.
//    Useful when deals with bulk processing. (can do parallel processing)

    //------------Steps Involved in stream
//    Step1: Streams are created from the data source like collection or array etc.
    //--------------------------------Step-2-------------------------------
//    At Step2:
//            - Intermediate Operations
//    like:
//    filter(),
//    sorted(),
//    map(),
//    distinct() etc...
//    are used.
//    These operations transform the stream into another stream and more operations can be done on top of it.
//    These are Lazy in nature, means these operations get executed only when terminal operation is invoked.
    //---------------------Step-3----------------------------------------//
//    At Step3:
//    Terminal Operations like:
//    collect(),
//    reduce(),
//    count() etc...
//    are used.
//            - These operations triggers the processing of the stream.
//    And produce the Output. Means after Terminal operation used, no more operation we can perform.
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(4100);
        salaryList.add(9000);
        salaryList.add(1000);
        salaryList.add(3500);
        long output =salaryList.stream().filter((Integer sal) -> sal>3000).count();
        System.out.println("Total Employee with salary > 3000:" + output);
    }
}
