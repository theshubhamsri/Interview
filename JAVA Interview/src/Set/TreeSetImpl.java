package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {
//    Internally it uses:TreeMap -
//    It can not store null value
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(77);
        treeSet.add(82);
        treeSet.add(63);
        treeSet.add(5);
        Iterator<Integer> iterable2 = treeSet.iterator();
        while(iterable2.hasNext()){
            int val=iterable2.next();
            System.out.println(val);
        }
    }
}
