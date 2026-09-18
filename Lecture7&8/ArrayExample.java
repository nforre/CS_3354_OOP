// Journey Forrest, CS 3354, Fall 2026 

public class ArrayExample {
    /**
     * An empty nested class inside of the ArrayExample
     * class. This type of array can only reserve slots for objects.
     * We must use a for-loop to actually fill in the null
     * slots with Weeble objects
     * 
     * FIX: Changed class to static so it could be declared 
     * from the main function without an enclosing instance.
     */
    static class Weeble {

    }

    /** 
     * Main function that fills in null slots in Weeble array
     * & creates a int array with 20 integer variables defaulted at 0
     * & creates a String array with 20 null String objects.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Weeble[] c = new Weeble[6];        // Size 6 array of Weeble references (MODIFIED: size from 4 to 6)
        for (int i = 0; i < c.length; i++) // For-Loop to fill in null slots with actual Weeble objects
            if (c[i] == null)              // Checks if item in the array is null
                c[i] = new Weeble();       // If item is null, item is assigned a new Weeble object
        int[] a = new int[20];             // Size 20 array of integer variables
        String[] b = new String[20];   // Size 20 array of String objects (MODIFIED: name from "Array" to "b")
        // Print statements for arrays
        System.out.println("Array a holds " + a.length + " integer variables defaulted as 0.");
        System.out.println("Array b holds " + b.length + " null String objects.");
        System.out.println("Array c holds " + c.length + " initialized Weeble objects.");
    }
}