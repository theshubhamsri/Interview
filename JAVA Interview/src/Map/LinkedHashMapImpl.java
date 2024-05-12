package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImpl {
//    1. Helps in Maintain Insertion order or
//    Helps in Maintain Access order ( when access order=true, most frequently used will be at the end and least frequently used will be at the start)
//   2. Similar to HashMap, but also uses Double LinkedList .

    //Structure of object how linkedHashMap stores each value
//    final int hash;
//        final K key;
//        V value;
//        next;
//    before, after;

//    -
//    Time complexity is same as of HashMap: Average O(1)
//    Its not thread safe and there is no thread safe version available for this.
//    so we have to explicitly make it this collection thread safe like this:
//    Map<Integer, String>map2= Collections.synchronizedMap (new LinkedHashMap<>());
    public static void main(String[] args) {
        System.out.println("----------below is LinkedHashMap output--------");
                Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "A");
        map.put(21, "8");
        map.put(23, "C");
        map.put(141, "D");
        map.put(25, "E");
        map.forEach((Integer key, String val) -> System.out.println(key+":"+ val));
        System.out.println("below is normal hash map output");
        Map<Integer, String> map2= new HashMap<>();
        map2.put(1, "A");
        map2.put(21, "в");
        map2.put(23, "C");
        map2.put(141, "D");
        map2.put(25, "E");
        for (Map.Entry <Integer, String> entry: map2.entrySet()){
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }

        //--------With access order true-----------
        System.out.println("--------------------below is LinkedHashMap output with access order true-----------------" );
        Map<Integer, String> mapWithAccessOrder = new LinkedHashMap<>(16, .75F, true);
        mapWithAccessOrder.put(1, "A");
        mapWithAccessOrder.put(21, "B");
        mapWithAccessOrder.put(23, "C");
        mapWithAccessOrder.put(141,"0");
        mapWithAccessOrder.put(25, "E");
       //accessing some data
        mapWithAccessOrder.get(23);
        mapWithAccessOrder.forEach((Integer key, String val) -> System.out.println(key+":"+val));
    }
}
