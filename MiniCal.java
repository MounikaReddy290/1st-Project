package apjfsa;

import java.util.Scanner;

public class MiniCal {

	public static void main(String[] args) {
		// Declare variables to hold the numbers
		double a, b;

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter two numbers
		System.out.println("Enter numbers:");
		a = sc.nextDouble(); // Read the first number
		b = sc.nextDouble(); // Read the second number

		// Display the list of operations
		System.out.println("Select operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Choose 1/2/3/4:");

		// Read the user's choice of operation
		int choice = sc.nextInt();

		// Use a switch statement to perform the selected operation
		switch (choice) {
		case 1:
			// Addition
			System.out.println("Sum is: " + (a + b));
			break;
		case 2:
			// Subtraction
			System.out.println("Difference is: " + (a - b));
			break;
		case 3:
			// Multiplication
			System.out.println("Product is: " + (a * b));
			break;
		case 4:
			// Division
			if (b != 0) { // Check to prevent division by zero
				System.out.println("Quotient is: " + (a / b));
			} else {
				System.out.println("Error! Division by zero.");
			}
			break;
		default:
			// Handle invalid operation choices
			System.out.println("Invalid choice");
		}
	}
}
