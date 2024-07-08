package javas.project.dataStructures.linkedList;

import java.util.*;

/**
 * LIST
 * a list is an interface provided by the Java Collections Framework.
 * It represents an ordered collection of elements,
 * where each element can be accessed by its index.
*/

/**
 * ArrayList
 * a list is an interface provided by the Java Collections Framework.
 * It represents an ordered collection of elements,
 * ArrayList is slower than arrays due to the overhead of resizing and additional methods
 */
public class ArrayLists {
    public static void main(String[] args) {

        //List -> Interface
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

        // Insert a new element at index 1
        fruits.add(1, "Grapes");

        // Check if the ArrayList contains an element
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        //use indexOf
        int index = fruits.indexOf("banana");
        System.out.println("The index of banana is: " + index);

        // Remove an element by value
        fruits.remove("Banana");

        //use foreach to print it
        fruits.forEach(System.out::println);

        List<String> frutas = new ArrayList<>(Arrays.asList("banana","cherry","orange"));
        //use foreach to print it
        frutas.forEach(System.out::println);



        //Vectores
        //It's like ArrayList but is thread safety
        // (Thread safety refers to the property of a program or code that ensures safe and correct behavior when multiple threads are executing concurrently.)
        // You should use Vectors instead ArrayList when you are using multiple threads
        List<String> fruits2 = new Vector<>();

        // For example, if two threads simultaneously try to add or remove elements from the same ArrayList,
        // it can result in unexpected behavior, such as lost updates, incorrect order, or even ConcurrentModificationException.



    }
}
