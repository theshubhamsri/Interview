package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListImpl {

//    Time Complexity:
//    Insertion:
//    O(1): when inserting the element at the end of the array. And space is sufficient
//    O(n): when inserting the lement at the particular index of the array, then it require shifting of the values,
//    O(n): when array size threshold reached and try to insert an element at end,
//    then also its O(n) as values are copied to new array with bigger array size.
//            Deletion: O(n), we have to shift all the values
//    Search: 0(1)
//    Space Complexity:
//    O(n)
    //ArrayList thread safe version CopyOnWriteArrayListVector:
    //Vector is Exactly same as arrayList, elements can be access via index.
    //But its Thread safe
    //Puts lock when operation is performed on vector.
    //Less efficient then ArrayList as for each operation it do lock/unlock internally.

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
//add(int index, Element e)
        list1.add(0, 100);
        list1.add(1, 200);
        list1.add(2, 300);
//addAll(int index, Collection c)
        List<Integer> list2 = new ArrayList<>();
        list2.add(0, 400);
        list2.add(1, 500);
        list2.add(2, 600);
        list1.addAll(2, list2);
        list1.forEach((Integer val) -> System.out.println(val));
//replaceAll(UnaryOperator op)
        list1.replaceAll((Integer val) -> 1 * val);
        System.out.println("after replace all");
        list1.forEach((Integer val) -> System.out.println(val));
//sort(Comparator c)
        list1.sort((Integer val1, Integer val2) -> val1 - val2);
        System.out.println("after sorting in increasing order");
        list1.forEach((Integer val) -> System.out.println(val));
        //get(int index)
        System.out.println("value present at index 2 is:" + list1.get(2));
//set(int index, Element a)
        list1.set(2, -4000);
        System.out.println("after set method");
        list1.forEach((Integer val) -> System.out.println(val));
//remove(int index)
        list1.remove(2);
        System.out.println("after removing");
        list1.forEach((Integer val) -> System.out.println(val));
//indexOf(Object o)
        System.out.println("index of -200 Integer object is:" + list1.indexOf(-200));
//need to provide the index in ListIterator, from where it has to start,
        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());
//traversing backward direction
        while (listIterator1.hasPrevious()) {
            int previousVal = listIterator1.previous();
            System.out.println("traversing backward:" + previousVal + "nextIndex:" + listIterator1.nextIndex() + "previous index:" + listIterator1.previousIndex());
            if (previousVal == -100) {
                listIterator1.set(-50);
            }
        }
        list1.forEach((Integer val) -> System.out.println("after set:" + val));
        //traversing forward direction
        ListIterator<Integer> listIterator2 = list1.listIterator();
        while (listIterator2.hasNext()) {
            int val = listIterator2.next();
            System.out.println("traversing forward:" + val + "nextIndex:" + listIterator2.nextIndex() + "previous index:" + listIterator2.previousIndex());
            if (val == -200) {
                listIterator2.add(-100);
            }
        }
        list1.forEach((Integer val) -> System.out.println("after add:" + val));
        List<Integer> sublist = list1.subList(1, 4);
        sublist.forEach((Integer val) -> System.out.println("sublist:" + val));
        sublist.add(-900);
        list1.forEach((Integer val) -> System.out.println("after value added in sublist:" + val));
    }
}
