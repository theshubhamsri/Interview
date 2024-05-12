package Set;

import java.util.HashSet;
import java.util.Set;

public class SetImpl {
//    Few properties of SET:
//            1. Collections of Objects, but it does not contains duplicate value (any only one 'null' value you can insert).
//            2. Unlike List, Set is not an Ordered Collection, means objects inside set does not follow the insertion order.
//            3. Unlike List, Set can not be accessed via index.
//    Few questions should have come to our mind:
//            1. What Data Structure is used in Set internally (as it does not allow duplicate values) ?
//            2. As order is not guarantee, then what if we want to Sort the Set collection?


//          Data structure used: HashMap
//    HashMap<E, Object>map = new HashMap<>();
//    During Add method invocation, it stored the element in the key part and in value it stores the dummy object: map.put(element, new Object()) what if 2 values get the same hash value? how its handled? what is load factor
//    No guarantee that the order will remain constant.
//    HashSet is not threadSafe. newKeySet method present in ConcurrentHashMap
//    class is used to create threadSafe Set.

//    Time complexity:
//    add: 0(1)
//    remove: Amortized O(1)
//    contains: Amortized O(1)
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);
        Set<Integer> set2 = new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);
        //UNION of 2 sets
        set1.addAll(set2);
        System.out.println("after union:");
        set1.forEach((Integer val) -> System.out.println(val));
        //INTERACTION of 2 sets
        set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);
        set2= new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);
        set1.retainAll(set2);
        System.out.println("after Intersection:");
        set1.forEach((Integer val) -> System.out.println(val));
        //DIFFERENCE of 2 sets set1 new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);
        set2= new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);
        set1.removeAll(set2);
        System.out.println("after Difference:");
        set1.forEach((Integer val) -> System.out.println(val));
    }
}
