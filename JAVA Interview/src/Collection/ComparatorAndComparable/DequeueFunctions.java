package Collection.ComparatorAndComparable;

import java.util.ArrayDeque;

public class DequeueFunctions {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        //Insertion
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(18);
        //Deletion
        int element =arrayDequeAsQueue.removeFirst();
        System.out.println(element);
        //LIFO (last in first out)
        ArrayDeque<Integer> arrayDequeAsStack =new ArrayDeque<>();
        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst( 5);
        arrayDequeAsStack.addFirst( 18);
        //Deletion
        int removedElem =arrayDequeAsStack.removeFirst();
        System.out.println(removedElem);
    }
}
