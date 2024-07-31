package apjfsa;

import java.util.Scanner;

public class sumPositive {
    // Method to calculate the sum of two integers and print it
    public static int sum(int a, int b) {
        int add = a + b;
        System.out.println("Sum of two numbers is " + add);
        return add; // Return the sum to be used in another method
    }

    // Method to check if the sum is positive or negative and print the result
    public static void positive(int add) {
        if (add > 0)
            System.out.println("Sum of given numbers is positive");
        else
            System.out.println("Sum of given numbers is negative");
    }

    // Main method to take user input and call the above methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Enter two numbers:"); // Prompt user to enter two numbers
        int a = sc.nextInt(); // Read first number
        int b = sc.nextInt(); // Read second number
        int add = sum(a, b); // Call sum method and store the result in 'add'
        positive(add); // Call positive method with the result 'add'
        sc.close(); // Close the Scanner to prevent resource leak
    }
}
