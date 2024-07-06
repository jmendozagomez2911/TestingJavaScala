package javas.test.dataStructures.arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(array);

        System.out.println("Reversed array with While loop:");
        reverseArray(array);
        printArray(array);

        System.out.println("Reversed array with For loop:");
        reverseArrayWithForLoop(array);
        printArray(array);
    }
/***
 * Two-pointer Technique:
 *
 * Initialization: Start with two pointers, left at the beginning (index 0) and right at the end (index array.length - 1) of the array.
 * Swapping: Swap the elements at the left and right indices.
 * Moving Pointers: Increment the left pointer and decrement the right pointer.
 * Termination: Continue the process until the left pointer is no longer less than the right pointer.
 *
 **/
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap the elements at the left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }

    /***
     *
     * Explanation:
     * For Loop:
     * Initialization: The loop starts with i at 0 and runs until i is less than n / 2, where n is the length of the array. This ensures that we only loop through the first half of the array, as each swap operation involves two elements.
     * Swapping: The elements at index i and n-1-i are swapped.
     * Termination: The loop stops when it has reached the middle of the array.
     */
    public static void reverseArrayWithForLoop(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            // Swap the elements at index i and n-1-i
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

/***
 * Time Complexity:
 *
 * The algorithm still runs in O(n) time complexity, where n is the number of elements in the array.
 * Space Complexity:
 *
 * The space complexity remains O(1) because it uses a constant amount of additional memory.
 */