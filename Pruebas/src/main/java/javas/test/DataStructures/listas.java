package javas.test.DataStructures;

import java.util.*;

/**
 * LIST
 * a list is an interface provided by the Java Collections Framework.
 * It represents an ordered collection of elements,
 * where each element can be accessed by its index.
*/

public class listas {
    public static void main(String[] args) {

        //The variable fruits is of type List<String>
        //fruits is a variable that can hold a reference to an object implementing the List interface, specifically with elements of type String.
        //By using new ArrayList<>(), you are instantiating an ArrayList object and assigning it to the fruits variable.
        List<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements in the ArrayList
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Check if the ArrayList contains an element
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        //use indexOf
        int index = fruits.indexOf("banana");
        System.out.println("The index of banana is: " + index);

        //use foreach to print it
        fruits.forEach(System.out::println);



        //Vectores
        //It's like ArrayList but is thread safety
        // (Thread safety refers to the property of a program or code that ensures safe and correct behavior when multiple threads are executing concurrently.)
        // You should use Vectors instead ArrayList when you are using multiple threads
        List<String> fruits2 = new Vector<>();

        // For example, if two threads simultaneously try to add or remove elements from the same ArrayList,
        // it can result in unexpected behavior, such as lost updates, incorrect order, or even ConcurrentModificationException.



        //linkedlist
        // It is a linear data structure where each element, called a node, contains a reference to the previous and next nodes.
        //LinkedList can be useful in scenarios where frequent insertion or removal of elements at the beginning or end of the list is required.
        // However, if you need frequent random access or need to access elements by index, an ArrayList might be a more suitable choice.

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

        Iterator<String> iterator = fruits3.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        //Double linkedList
        //A Doubly LinkedList is similar to a LinkedList, but with an extra feature.
        // In addition to knowing the next item in the list, each item also knows the previous item.
        // It's like a chain where you can move forward and backward easily. This allows for efficient insertion,
        // removal, and traversal in both directions.
//

    }
}
