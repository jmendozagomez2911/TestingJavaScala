package javas.test.DataStructures;

import java.util.*;

/**
 * Stack
 *  a stack is like a pile of items
 *  where you can only add or remove items from the top,
 *  following the LIFO principle (Last-In, First-Out).
 */

public class Stacks {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        // Print the top element
        System.out.println("Top element: " + stack.peek()); // Output: Orange

        // Pop elements from the stack
        System.out.println(stack.pop()); // Output: Orange
        System.out.println(stack.pop()); // Output: Banana

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: false

        // Pop the remaining element
        System.out.println(stack.pop()); // Output: Apple

        // Check if the stack is empty again
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: true

    }
}