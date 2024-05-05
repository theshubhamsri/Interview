package Collection;

import java.util.PriorityQueue;

public class MinPriorityQueue {
    //Iteration involves level order traversal
    //Uses heap data structure Heapify is done
    //max priority queue, used to solve problems of max heap
    //Heap is a complete binary tree
//    A heap is a binary tree-based data structure that satisfies the heap property:
//    the value of each node is greater than or equal to the value of its children.
//    This property makes sure that the root node contains the maximum or minimum value (depending on the type of heap),
//    and the values decrease or increase as you move down the tree.
    public static void main(String[] args) {
        //min priority queue, used to solve problems of min heap.
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();                              //     1
        minPQ.add(5);                                                                     //   /     \
        minPQ.add(2);                                                                    //   2       8
        minPQ.add(8);                                                                   //   /
        minPQ.add(1);                                                                  //   5
//lets print all the values
    minPQ.forEach((Integer val) -> System.out.println(val));                //Prints the value in level order traversal because no comparator has been provided while creating the priority queue
 //remove top element from the PQ and print
    while(!minPQ.isEmpty())
        {
            int val = minPQ.poll();
            System.out.println("remove from top:" + val);
        }
    }
}
