package Collection.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorFeatures {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        //add(int index, Element e)
        list1.add(0, 100);
        list1.add(1, 200);
        list1.add(2, 300);
        //addAll(int index, Collection c)
        List<Integer> list2 = new ArrayList<>();
        list2.add(0, 408);
        list2.add(1, 500);
        list2.add(2, 600);
        list1.addAll(2, list2);
        list1.forEach((Integer val) -> System.out.println(val));
        //replaceAll(Uniary@perator op)
        list1.replaceAll((Integer val) -> -1 * val);
        System.out.println("after replace all");
        list1.forEach((Integer val) -> System.out.println(val));
        //sort(Comparator c)
        list1.sort((Integer val1, Integer val2) -> val1 - val2);
        System.out.println("after sorting in increasing order");
        list1.forEach((Integer val) -> System.out.println(val));
        //get(int index)
        System.out.println("value present at index 2 is:" + list1.get(2));
        //set(int index, Element e)
        list1.set(2, -4000);
        System.out.println("after set method");
        list1.forEach((Integer val) -> System.out.println(val));
        //remove(int index)
        list1.remove(2);
        System.out.println("after removing");
        list1.forEach((Integer val) -> System.out.println(val));
        //indexOf(Object ol
        System.out.println("index of 200 Integer object is:" + list1.indexOf(-200));
        //need to provide the index in list iterator, from where it has to start.
        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());
        //traversing backward direction
        while (listIterator1.hasPrevious()) {
            int previousVal = listIterator1.previous();
            System.out.println("reversing backward:" + previousVal + "nextIndex" + listIterator1.nextIndex() + "previous Index" + listIterator1.previousIndex());
            if (previousVal == -100) {
                listIterator1.set(-50);
            }
        }
        list1.forEach((Integer val) -> System.out.println("after set val" + val));
        //traversing forward direction
        ListIterator<Integer> listIterator2 = list1.listIterator();
        while (listIterator2.hasNext()) {
            int val = listIterator2.next();
            System.out.println("traversing forward: val next Index:" + listIterator2.nextIndex());
            if (val == -200) {
                //Subsequent call to next() will remain unaffected
                //This one requires a bit of understanding
                listIterator2.add(-100);
            }
        }

        list1.forEach((Integer val) -> System.out.println("after add:" + val));
        List<Integer> subList = list1.subList(1, 4);
        subList.forEach((Integer val) -> System.out.println("sublist:" + val));
        subList.add(-900);
        list1.forEach((Integer val) -> System.out.println("after value added in sublist:" + val));
    }
}
