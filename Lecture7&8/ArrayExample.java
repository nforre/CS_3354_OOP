// Journey Forrest, CS 3354, Fall 2026 

public class ArrayExample {

    class Weeble {
        // This is an empty class

    }


    /** 
     * Main function that creates arrays & checks if they're null
     * 
     * @param args
     */
    public static void main(String[] args) {
        Weeble[] c = new Weeble[4];        // Size 4 array of Weeble objects
        for (int i = 0; i < c.length; i++) // Loops through array c.length number of times
            if (c[i] == null)              // Checks if item in the array is null
                c[i] = new Weeble();       // If item is null, item is assigned a new Weeble object
        int[] a = new int[20];             // Size 20 array of integer variables
        String[] Array = new String[20];   // Size 20 array of String objects
    }
}