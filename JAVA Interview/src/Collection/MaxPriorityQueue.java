package Collection;

import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        //max priority queue, used to solve problems of max heap
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b) -> b - a);
        maxPQ.add(5);                                                                      //  8
        maxPQ.add(2);                                                                     //  / \
        maxPQ.add(8);                                                                    //  2   5
        maxPQ.add(1);                                                                   //  /
                                                                                       //  1
        //lets print all the values
        //The order will be the level order traversal 8,2,5,1
        maxPQ.forEach((Integer val) -> System.out.println(val));
        //remove top element from the PQ and print

        /*Time complexity:
        Add and Offer: O(logn)
        Peak: O(1)
        Poll and Remove head element: O(logn)
        Remove arbitrary element: O(n)*/
        while (!maxPQ.isEmpty()) {
            int val = maxPQ.poll();
            System.out.println("remove from top:" + val);
        }
    }
}
