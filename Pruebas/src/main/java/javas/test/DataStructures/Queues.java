package javas.test.DataStructures;

import java.util.LinkedList;

public class Queues {
    
    public static void main(String[] args) {
        LinkedList<String> queue =  new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        System.out.println("Front element: " + queue.peek()); // Output: Apple
        System.out.println("Size of queue: " + queue.size()); // Output: 3

        System.out.println(queue.remove()); // Output: Apple
        System.out.println(queue.remove()); // Output: Banana

        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: false

        System.out.println(queue.remove()); // Output: Orange

        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: true


    }
}
