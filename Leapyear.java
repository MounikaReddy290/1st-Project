package apjfsa;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner s = new Scanner(System.in);

		// Prompt the user to enter a year
		System.out.println("Enter the year:");

		// Read the input year from the console
		int year = s.nextInt();

		// Check if the year is a leap year using the leap year rules
		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("Given year is a Leap Year"); // Output if the year is a leap year
		} else {
			System.out.println("Not a Leap Year"); // Output if the year is not a leap year
		}

		// Close the Scanner object to release resources
		s.close();
	}

}
