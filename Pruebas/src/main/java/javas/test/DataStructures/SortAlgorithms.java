package javas.test.DataStructures;

public class SortAlgorithms {

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            //aux variable = smallerNumber
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public static void main(String[] args) {



//Stable and Unstable sorts are important when we are ordering elements that are objects
        //unstable sort
        //when there are duplicates, the first element is sorted after the existing element. It exists changes
        //stable sort
        //when there are duplicates, the first element is sorted before the existing element. It doesn't exist changes



//SORT ALGORITHMS
    //Bubble sort
    //quadratic algorithm, is awful


//SelectionSortAlgorithm
    // In-place algorith
    // O(n^2) time complexity -quadratic
    // Doesn't require as much swapping as bubble sort
    // Unstable algorithm
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }

//Insertion sort
        int[] arr2 = {9,14,3,2,43,11,58,22};
        System.out.println("\nBefore Insertion Sort");
        for(int i:arr2){
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr2);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for(int i:arr2){
            System.out.print(i+" ");
        }

//InsertionSortAlgorithm
    // Insertion is good for small elements only
    //1.Work left to right
    //2. Examine each item and compare it to items on its left
    //3. Insert the item in the correct position in the arrag
    }
}
