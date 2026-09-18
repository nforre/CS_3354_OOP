// Journey Forrest, CS 3354, Fall 2026 
import java.util.ArrayList;

public class ArrayListExample {
    /** 
     * Main function creates a size 20 String ArrayList 
     * for names of countries. Countries are added to list and 
     * printed out using a for-loop.
     * @param args
     */
    public static void main(String[] args) {
        // Creates a String ArrayList with the initial capacity of 20
        ArrayList<String> countries = new ArrayList<String>(20);
        countries.add("Belgium");   // Adds country to ArrayList
        countries.add("Italy");     // Adds country to ArrayList
        countries.add("Thailand");  // Adds country to ArrayList

        countries.add("United States"); // Adds additional country to ArrayList
        countries.add("Japan");         // Adds additional country to ArrayList
        countries.add("Canada");        // Adds additional country to ArrayList

        for (String s : countries) {      // For loop that prints out country strings
            System.out.println(s);        // countries printed in order added
        }
    }
}
