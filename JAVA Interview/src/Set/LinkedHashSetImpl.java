package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImpl {
//    - Internally it uses: LinkedHashMap
//    Maintains the insertion Order of the element
//    Its not thread safe:
//    Set<Integer> set= Collections.synchronizedMap (new LinkedHashSet<>());
    public static void main(String[] args) {
        Set<Integer> intSet = new LinkedHashSet<>();
        intSet.add(2);
        intSet.add(77);
        intSet.add(82);
        intSet.add(63);
        intSet.add(5);
        Iterator<Integer> iterable =intSet.iterator();
        while(iterable.hasNext()){
            int val =iterable.next();
            System.out.println(val);
        }
    }
}
