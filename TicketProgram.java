// Journey Forrest, CS 3354, Fall 2026 
import java.util.Scanner;

public class TicketProgram {
    public static void main(String[] args) {
        final int ticketPrice = 15; // fixed ticket price
        int numOfTickets;
        double totalCost;
        Scanner input = new Scanner(System.in); // gets user input

        System.out.print("Enter amount of tickets to purchase: ");
        numOfTickets = input.nextInt();
        totalCost = numOfTickets * ticketPrice;
        System.out.println("Total cost of tickets: $" + totalCost);

        input.close(); // Followed from Dr.Hernandez' Solutions (prevents memory leak)
    }
}
