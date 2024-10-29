package apjfsa;

import java.util.Scanner;

public class Eligibility {
	public static void main(String args[]) {
		// Create a Scanner object for input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for their age
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		// Check voting eligibility
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}

		// Close the scanner
		scanner.close();
	}
}
