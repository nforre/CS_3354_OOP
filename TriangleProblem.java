// Journey Forrest, CS 3354, Fall 2026 

import java.util.Scanner;

public class TriangleProblem {
    public static void main(String[] args) {
        final int GAP_SIZE = 2;
		Scanner keyboard = new Scanner(System.in);
		int size;

		System.out.println("Enter the size of the triangle [3-5]: "); // read size
		size = keyboard.nextInt();

		// draw top triangles
		for (int row = 0; row < size; row++) {
			//// white spaces
			for (int column = 0; column < size - row - 1; column++) {
				System.out.print(" ");
			}
			//// draw first triangle stars
			for (int column = 0; column < row + 1; column++) {
				System.out.print("*");
			}
			//// draw vertical gap
			for (int column = 0; column < GAP_SIZE; column++) {
				System.out.print(" ");
			}
			//// draw second triangle stars
			for (int column = 0; column < row + 1; column++) {
				System.out.print("*");
			}
			// move to next line
			System.out.println();
		}

		// horizontal gap
		for (int column = 0; column < GAP_SIZE / 2; column++) {
			System.out.println();
		}
		
		//  bottom triangles
		for (int row = 0; row < size; row++) {
			////  white spaces
			for (int column = 0; column < row; column++) {
				System.out.print(" ");
			}
			//// draw third triangle stars
			for (int column = size; column > row; column--) {
				System.out.print("*");
			}
			//// draw vertical gap
			for (int column = 0; column < GAP_SIZE; column++) {
				System.out.print(" ");
			}
			//// draw fourth triangle stars
			for (int column = size; column > row; column--) {
				System.out.print("*");
			}
        }    
    }
}
