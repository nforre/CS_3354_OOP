// Journey Forrest, CS 3354, Fall 2026 

import java.util.Scanner;

public class TriangleProblem {
    public static void main(String[] args) {
        final int GAP_SIZE = 2;
		Scanner keyboard = new Scanner(System.in);
		int size;

		System.out.print("Enter the size of the triangle [3-5]: "); // read size
		size = keyboard.nextInt();

		for (int row = 0; row < size; row++){
			for (int col = 0; col < size - row - 1; col++)
				System.out.print(" "); // white space
			for (int col = 0; col < row + 1; col++)
				System.out.print("*");

			for (int col = 0; col < GAP_SIZE; col++)
				System.out.print(" ");
			for (int col = 0; col < row + 1; col++)
				System.out.print("*");
			System.out.println();
		}
		
		for (int col = 0; col < GAP_SIZE + 1; col++)
			System.out.print("*");

		for (int row = 0; row < size; row++){
			for (int col = 0; col <row; col++)
				System.out.print(" "); // white space
			for (int col = size; col < row + 1; col++)
				System.out.print("*");

			for (int col = 0; col < GAP_SIZE; col++)
				System.out.print(" ");
			for (int col = 0; col < row + 1; col++)
				System.out.print("*");
			System.out.println();
		}
    }
}
