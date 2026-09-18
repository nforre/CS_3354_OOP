// Journey Forrest, CS 3354, Fall 2026 
import java.util.ArrayList;

public class ArrayListExample {
    /** 
     * Main function creates a size 20 String ArrayList 
     * for names of countries. Countries are added to list and 
     * printed out using a for-loop. ArrayList allows for flexible 
     * sizing.
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Creates a String ArrayList with the initial capacity of 20.
        ArrayList<String> countries = new ArrayList<String>(20);

        // ArrayList differs from regular arrays by allowing elements to be
        // added freely even past the initial capacity of 20.
        countries.add("Belgium");   
        countries.add("Italy");     
        countries.add("Thailand");  

        countries.add("United States"); // Testing ArrayList's flexible sizing 
        countries.add("Japan");         
        countries.add("Canada");
        countries.add("Germany");        

        for (String s : countries) {      // For loop that prints out country strings
            System.out.println(s);        // countries printed in order added
        }
    }
}
