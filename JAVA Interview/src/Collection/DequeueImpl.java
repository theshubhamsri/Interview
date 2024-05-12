package Collection;

import java.util.ArrayDeque;

public class DequeueImpl {


//    add() -> internally calls addLast() method
//    offer() -> calls offerLast() method
//    poll() -> calls pollFirst() method
//    remove() -> calls removeFirst() method
//    peek() -> calls peekFirst() method
//    element() -> calls getFirst() method
//    Time Complexity:
//    Insertion: Amortized(Most of the time or Average) complexity is O(1) except few cases like
//    O(n): when queue size threshold reached and try to insert an element at end or front,
//    then its O(n) as values are copied to new queue with
//    bigger size.
//    Deletion: O(1)
//    Search: O(1)
//    Space Complexity:
//    O(n)
//    Thread safe version of ArrayDeque is ConcurrentLinkedDeque
//    Thread safe version of PriorityQueue is PriorityBlockingQueue
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        //Insertion
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(10);
        //Deletion
        int element = arrayDequeAsQueue.removeFirst();
        System.out.println(element);
        //LIFO (last in first out)
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(5);
        arrayDequeAsStack.addFirst(10);
        //Deletion
        int removedElem = arrayDequeAsStack.removeFirst();
        System.out.println(removedElem);
    }
}
