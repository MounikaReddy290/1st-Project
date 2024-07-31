package apjfsa;

import java.util.Scanner;

public class AreaAndPerimeter {
    // Method to calculate and print the area of a rectangle
    public static void area(float l, float b) {
        float area = l * b;
        System.out.println("Area of rectangle is: " + area);
    }

    // Method to calculate and print the perimeter of a rectangle
    public static void perimeter(float l, float b) {
        float perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }

    // Main method to take user input and call the above methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Enter length of rectangle:"); // Prompt user to enter the length of the rectangle
        float l = sc.nextFloat(); // Read the length
        if (l > 0) { // Check if length is positive
            System.out.println("Enter breadth of rectangle:"); // Prompt user to enter the breadth of the rectangle
            float b = sc.nextFloat(); // Read the breadth
            if (b > 0) { // Check if breadth is positive
                area(l, b); // Call the area method
                perimeter(l, b); // Call the perimeter method
            } else {
                System.out.println("Area and perimeter cannot be calculated with negative values"); // Print error message if breadth is negative
            }
        } else {
            System.out.println("Area and perimeter cannot be calculated with negative values"); // Print error message if length is negative
        }
        sc.close(); // Close the Scanner to prevent resource leak
    }
}

