package Collection;

import java.util.Stack;

public class StackImpl {
//        Time Complexity:
//            - Insertion: O(1)
//            - Deletion: O(1)
//            - Search: O(n)
//        Space Complexity: O(n)
//    Stack extends vector that's why it is thread safe and and synchronized
//    doesn't requires any thread safe version
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
    }
}
