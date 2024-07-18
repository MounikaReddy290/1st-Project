package apjfsa;

import java.util.Scanner;

public class Simple {
	public static void main(String args[]) {
		// Create a Scanner object to read input from the console
		Scanner s = new Scanner(System.in);

		// Prompt the user to enter values
		System.out.println("Enter values:");

		// Declare variables to store principal, time, rate, and simple interest
		int si; // Simple interest
		int p = s.nextInt(); // Read principal amount from console input
		int t = s.nextInt(); // Read time period from console input (in years)
		int r = s.nextInt(); // Read rate of interest from console input (in percentage)

		// Calculate simple interest using the formula: SI = (P * T * R) / 100
		si = p * t * r / 100;

		// Output the calculated simple interest
		System.out.println("Simple interest is " + si);

		// Close the Scanner object to release resources
		s.close();
	}
}
