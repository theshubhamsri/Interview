package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraversingCollection {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        //using iterator
        System.out.println("Iterating the values using iterator method");
        Iterator<Integer> valuesIterator = values.iterator();
        while (valuesIterator.hasNext()) {
            int val =valuesIterator.next();
            System.out.println(val);
            if(val == 3) {
                valuesIterator.remove();
            }
        }
        System.out.println("Iterating the values using for-each loop");
        for (int val: values) {
            System.out.println(val);
        }
        //using forEach method
        System.out.println("testing forEach method");
        values.forEach((Integer val) -> System.out.println(val));
    }
}
