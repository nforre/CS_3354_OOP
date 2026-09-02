import java.util.Scanner;
/**
 * AreaProgram is a area calculator application for 2D Squares, Circles, and Triangles
 */
public class AreaProgram {
    /**
	 * Executes all of AreaProgram
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        double area;

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
                        System.out.println("\n\n=== AREA OF A SQUARE ===\n");
                        System.out.print("Please enter a side length: ");
                        int side = input.nextInt();
                        area = side * side;
                        System.out.println("The area of this square is " + area);
                        break; 
                    case 2:
                        System.out.println("\n\n=== AREA OF A CIRCLE ===\n");
                        System.out.print("Please enter a radius: ");
                        int radius = input.nextInt();
                        area = Math.PI * Math.pow(radius, 2);
                        System.out.println("The area of this circle is " + area);
                        break; 
                    case 3:
                        System.out.println("\n\n=== AREA OF A TRIANGLE ===\n");
                        System.out.print("Please enter a base: ");
                        int base = input.nextInt();
                        System.out.print("Please enter a width height: ");
                        int height = input.nextInt();
                        area = base * height * .5;
                        System.out.println("The area of this triangle is " + area);
                        break; 
                }
        } while (option != 4);
        System.out.println("Exiting... Goodbye!");
        input.close();
    }
}
