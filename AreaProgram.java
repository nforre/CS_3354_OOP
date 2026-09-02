import java.util.Scanner;
public class AreaProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        double area;

        do {
            System.out.println("=== AREA CALCULATOR ===\n");
            System.out.println("1. Area of a Square");
		    System.out.println("2. Area of a Circle");
		    System.out.println("3. Area of a Triangle");
		    System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            option = input.nextInt();

            if (option == 1) {
                System.out.println("\n\n=== AREA OF A SQUARE ===");
                System.out.print("Please enter a side length: ");
                int side = input.nextInt();
                area = side * side;
                System.out.println("The area of this square is " + area);
                break;
            }
            else if (option == 2) {

            }
            else if (option == 3) {

            }
            else{
                break;
            }

        } while (option != 4);
        input.close();
    }
}
