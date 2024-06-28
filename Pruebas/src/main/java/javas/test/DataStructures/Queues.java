package javas.test.DataStructures;

import java.util.LinkedList;
/**
 *
 * Queues follows the (FIFO) order.
 * Principle: The first element added to the collection will be the first one to be removed.
 * Queues are often used in scenarios where elements need to be processed in a specific order, like task scheduling, breadth-first search algorithms, and more.
 *
 * **/
public class Queues {

    public static void main(String[] args) {
        LinkedList<String> queue =  new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        queue.add("Cherry");

        // Peek: Retrieves, but does not remove, the head of the queue
        System.out.println("Front element: " + queue.peek());
        System.out.println("Size of queue: " + queue.size()); // Output: 3

        // Remove: Retrieves and removes the head of the queue
        // Throws NoSuchElementException if the queue is empty
        System.out.println(queue.remove()); // Output: Apple
        System.out.println(queue.remove()); // Output: Banana

        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: false

        System.out.println(queue.remove()); // Output: Orange

        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: true


    }
}
