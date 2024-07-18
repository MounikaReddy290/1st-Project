package apjfsa;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner s = new Scanner(System.in);
        
        // Prompt the user to enter 3 angles of a triangle
        System.out.println("Enter 3 angles:");
        
        // Declare variables to store the angles and their sum
        int a = s.nextInt(); // First angle
        int b = s.nextInt(); // Second angle
        int c = s.nextInt(); // Third angle
        int sum; // Variable to store the sum of angles
        
        // Calculate the sum of the three angles
        sum = a + b + c;
        
        // Check if the sum equals 180 degrees to determine if it forms a triangle
        if (sum == 180) {
            System.out.println("Can form a triangle"); // Output if angles can form a triangle
        } else {
            System.out.println("Cannot form a triangle"); // Output if angles cannot form a triangle
        }
        
        // Close the Scanner object to release resources
        s.close();
    }

}
