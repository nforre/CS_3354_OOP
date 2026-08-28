import java.util.Scanner;

public class TemperatureProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        int temp = input.nextInt();

        if (temp <= 32) 
            System.out.println("Freezing");
        else if (temp <= 50)
            System.out.println("Cold");
        else if (temp <= 85)
            System.out.println("Warm");
        else
            System.out.println("Hot");

        input.close(); // Followed from Dr.Hernandez' Solution (prevents memory leak)
    }
}
