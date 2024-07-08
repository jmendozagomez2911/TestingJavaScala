package javas.project.referenceVariables;

/**
 * This example shows that even after setting one variable (original) to null,
 * the reference held by another variable (reference) remains intact and
 * still points to the original object (Integer with value 5).
 */
public class ReferenceExample {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables
        Integer original = new Integer(5); // original points to an Integer object with value 5
        Integer reference = original;      // reference points to the same Integer object as original

        // Step 2: Print the values to see the references
        System.out.println("Original value: " + original);   // Should print: Original value: 5
        System.out.println("Reference value: " + reference); // Should print: Reference value: 5

        // Step 3: Set original to null
        original = null;

        // Step 4: Print the values again to see the effect
        System.out.println("Original after setting: " + original);   // Should print: Original after setting: null
        System.out.println("Reference after setting: " + reference); // Should print: Reference after setting: 5
    }
}