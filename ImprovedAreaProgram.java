// Journey Forrest, CS 3354, Fall 2026 
import java.util.Scanner;
/**
 * ImprovedAreaProgram is the improved version 
 * of an area calculator application for 
 * 2D Squares, Circles, and Triangles.
 */
public class ImprovedAreaProgram {
    /**
     * calcSquare is a void function that 
     * calculates the square area given a side
     * from the user.
     * 
     * @param input
     */
    public static void calcSquare (Scanner input){
        System.out.println("\n\n=== AREA OF A SQUARE ===\n");
        System.out.print("Please enter a side length: ");
        int side = input.nextInt();
        double area = side * side;
        System.out.println("The area of this square is " + area);
    }

    /**
     * calcCircle is a void function that 
     * calculates the circle area given a radius
     * from the user.
     * 
     * @param input
     */
    public static void calcCircle (Scanner input){
        System.out.println("\n\n=== AREA OF A CIRCLE ===\n");
        System.out.print("Please enter a radius: ");
        int radius = input.nextInt();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of this circle is " + area);
    }

    /**
     * calcTriangle is a void function that 
     * calculates the triangle area given a base
     * and height from the user.
     * 
     * @param input
     */
    public static void calcTriangle (Scanner input){
        System.out.println("\n\n=== AREA OF A TRIANGLE ===\n");
        System.out.print("Please enter a base: ");
        int base = input.nextInt();
        System.out.print("Please enter a width height: ");
        int height = input.nextInt();
        double area = base * height * .5;
        System.out.println("The area of this triangle is " + area);
    }

    /**
	 * Main function executes the menu feature and 
     * do-while loop for ImprovedAreaProgram.
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n=== AREA CALCULATOR ===\n");
            System.out.println("1. Area of a Square");
		    System.out.println("2. Area of a Circle");
		    System.out.println("3. Area of a Triangle");
		    System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            option = input.nextInt();
            if (option < 1 || option > 4)
                System.out.println("ERROR: Please provide a option between 1-4! ");
            else
                switch(option) {
                    case 1:
                        calcSquare(input);
                        break; 
                    case 2:
                        calcCircle(input);
                        break; 
                    case 3:
                        calcTriangle(input);
                        break; 
                }
        } while (option != 4);
        System.out.println("Exiting... Goodbye!");
        input.close();
    }
}
