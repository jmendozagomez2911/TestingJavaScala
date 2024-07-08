package javas.project.dataStructures.listas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *Types of LinkedLists
 * linkedList
 * Circular singly linkedList
 * double linkedList
 * Circular double linkedList
 */

public class LinkedLists {
    public static void main(String[] args) {

        /**
         * linkedlist
         * It is a linear data structure where each element, called a node, contains a reference to the next node in the sequence.
         * LinkedList can be useful in scenarios where frequent insertion or removal of elements at the beginning of the list.
         * However, if you need frequent random access or need to access elements by index, an ArrayList might be a more suitable choice
         * because if you need to access to an element, you need to iterate over reference until founds the specific reference.
         */


        List<String> fruits3 = new LinkedList<>();

        // Add elements to the LinkedList
        fruits3.add("Apple");
        fruits3.add("Banana");
        fruits3.add("Orange");

        // Print the LinkedList
        System.out.println(fruits3); // Output: [Apple, Banana, Orange]

        // Access elements in the LinkedList
        String secondFruit = fruits3.get(1);
        System.out.println("Second fruit: " + secondFruit);

        //iterator.hasNext(): Se encuentra antes del primer elemento ("Apple") durante la primera iteración del bucle.
        //iterator.next(): Avanza el Iterator al primer elemento ("Apple") durante la primera iteración del bucle.
        Iterator<String> iterator = fruits3.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }



        /**
         * Double linkedList
         * Doubly LinkedList is similar to a LinkedList, but with an extra feature.
         * In addition to knowing the next item in the list, each item also knows the previous item.
         * It's like a chain where you can move forward and backward easily. This allows for efficient insertion,
         * removal, and traversal in both directions.
         */

//


    }
}
