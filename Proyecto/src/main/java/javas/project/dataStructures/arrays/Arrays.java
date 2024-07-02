package javas.project.dataStructures.arrays;

/**
 * Arrays
 * Data Structure which can store a
 * fixed size collection of elements of the same dataType
 */

public class Arrays {
    public static void main(String[] args) {
        // Step 1: Declare an array
        int[] numbers;

        // Step 2: Initialize the array with a fixed size
        numbers = new int[5];

        // Step 3: Populate the array with values
        numbers[0] = 10; // Assign value to the first element
        numbers[1] = 20; // Assign value to the second element
        numbers[2] = 30; // Assign value to the third element
        numbers[3] = 40; // Assign value to the fourth element
        numbers[4] = 50; // Assign value to the fifth element

        // Step 4: Access and print elements of the array
        System.out.println("Accessing individual elements:");
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Step 5: Modify elements of the array
        numbers[2] = 35; // Change the third element to 35

        // Step 6: Iterate through the array using a for loop
        System.out.println("\nIterating through the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Step 7: Using an enhanced for loop (for-each loop)
        System.out.println("\nUsing enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Step 8: Find the length of the array
        System.out.println("\nLength of the array: " + numbers.length);

        // Step 9: Combined declaration, initialization, and population
        int[] moreNumbers = {5, 10, 15, 20, 25};
        System.out.println("\nCombined declaration and initialization:");
        for (int num : moreNumbers) {
            System.out.println(num);
        }
    }
}
