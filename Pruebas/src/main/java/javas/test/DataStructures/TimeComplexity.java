package javas.test.DataStructures;

public class TimeComplexity {
    public static void main(String[] args) {
        //Arrays
        //They are not dynamic structure. Once you create an array instance, you can't modify size (you can modify the values, but not the size)
        // Every element in array occupies the same. For example if its an array of ints, each cell ocuppies 4 bytes.
        // Another example, array of objects, each cell occuppies a reference to the class.
        int[] intArray = new int[7];


        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for(int i= 0; i < intArray.length; i++){

            System.out.println("elemento " + i +": " + intArray[i]);
        }

        System.out.println("There are two times of complexity:" +
                "Time complexity: Number of steps involved to run an algorithm" + //big O notation.
                "Memory complexity: Amount of memory it takes to run an algorithm"); //These days, memory is not an issue


    }
}
