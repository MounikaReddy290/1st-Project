package apjfsa;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner s = new Scanner(System.in);

		// Prompt the user to enter a value in Fahrenheit
		System.out.println("Enter the value in Fahrenheit:");

		// Declare variables to store Fahrenheit and Celsius temperatures
		double f = s.nextDouble(); // Read Fahrenheit value from console input
		double c; // Celsius variable to store calculated temperature

		// Convert Fahrenheit to Celsius using the formula: C = (F - 32) * 5/9
		c = (f - 32) * 5 / 9;

		// Output the converted temperature in Celsius
		System.out.println("The value in Celsius is " + c);

		// Close the Scanner object to release resources
		s.close();
	}

}
