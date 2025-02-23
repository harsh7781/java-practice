package DataStructures.Stack;

import java.util.Stack;

public class StackExampleInBuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top Element: " + stack.peek()); // Output: 30
        System.out.println("Popped Element: " + stack.pop()); // Output: 30
        System.out.println("Is Stack Empty? " + stack.isEmpty()); // Output: false
    }
}

