package Collection;

import java.util.LinkedList;

public class LinkedListExample {
//    LinkedList: Data structure used is Linked List
//    LinkedList implements both Deque and List interface.
//    Means it support Dequeue methods like: "getFirst", "getLast", "removeFirst", "removeLast" etc...
//    + It also support index based operations like List: "get(index)", "add(index, object)" etc.

//    Time Complexity:
//    Insertion at start and end: O(1)
//    Insertion at particular index: O(n) for lookup of the index + O(1) for adding
//    Search: O(n)
//    Deletion at start or end: O(1)
//    Deletion at specific index: O(n) for the lookup of the index + O(1) for removal
//    Space Complexity: O(n)

// Thread safe version CopyOnWriteArrayList
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //using deque functionality
        list.addLast(200);
        list.addLast(300);
        list.addLast(408);
        list.addFirst(100);
        System.out.println(list.getFirst());
        //using list functionality
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0,  100);
        list2.add(1,  300);
        list2.add(2,  406);
        list2.add(1, 200);
        System.out.println(list2.get(1) + " and "+ list2.get(2));
    }
}
