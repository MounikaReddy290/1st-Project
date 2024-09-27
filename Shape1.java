package apjfsa;

import java.util.*;

// Creation of class as Shape
class Shapes {
    String color;
    String filled;

    // Constructor for assigning the values to the instance variables
    Shapes(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }
}

// Creating a subclass shape class
class Circle1 extends Shapes {
    float radius;

    Circle1(String color, String filled, float radius) {
        super(color, filled);
        this.radius = radius;
    }

    // Method to calculate area
    public void getCircleArea() {
        float area = (22 / 7.0f) * (radius * radius); // Use 22/7.0f for float division
        System.out.println("----- Circle -----");
        System.out.println("Color: " + color);
        System.out.println("Is filled: " + filled);
        System.out.println("The area of the circle is: " + area);
    }
}

// Extending from Shapes class
class Rectangle extends Shapes {
    int length; // Corrected spelling from "lenght" to "length"
    int width;  // Fixed variable name from "wedth" to "width"

    Rectangle(String color, String filled, int length, int width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    } 

    // Method for area calculation for rectangle
    public void getRectangleArea() {
        int rarea = length * width; // Corrected variable name to "length"
        System.out.println("---------- Rectangle --------");
        System.out.println("Color: " + color);
        System.out.println("Is filled: " + filled);
        System.out.println("The area of the rectangle is: " + rarea);
    }
}

public class Shape1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Object for Circle class
        System.out.println("ENTER THE COLOR OF THE CIRCLE:");
        String color = sc.nextLine();
        
        System.out.println("ENTER THE RADIUS OF THE CIRCLE:");
        float radius = sc.nextFloat(); // Changed to nextFloat() for float input
        Circle1 cobj = new Circle1(color, "YES", radius); // Method calling
        cobj.getCircleArea();

        // Object for Rectangle class
        System.out.println("ENTER THE COLOR OF THE RECTANGLE:");
        sc.nextLine(); // Clear the buffer
        String color1 = sc.nextLine(); // Corrected to nextLine() for proper input
        System.out.println("ENTER THE LENGTH OF THE RECTANGLE:");
        int length = sc.nextInt(); // Corrected spelling from "lenght" to "length"
        System.out.println("ENTER THE WIDTH OF THE RECTANGLE:");
        int width = sc.nextInt(); // Fixed variable name from "wedth" to "width"
        
        Rectangle robj = new Rectangle(color1, "NO", length, width);
        robj.getRectangleArea(); // Calling area method

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
