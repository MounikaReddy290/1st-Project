package apjfsa;

public class ShapePerimeterCalculator {

    // Method to calculate the perimeter of a circle
    public double calculatePerimeter1(double radius) {
        // Perimeter (circumference) of a circle = 2 * π * radius
        return 2 * Math.PI * radius;
    }

    // Method to calculate the perimeter of a square
    public double calculatePerimeter(double sideLength) {
        // Perimeter of a square = 4 * sideLength
        return 4 * sideLength;
    }

    // Method to calculate the perimeter of a triangle
    public double calculatePerimeter(double side1, double side2, double side3) {
        // Perimeter of a triangle = side1 + side2 + side3
        return side1 + side2 + side3;
    }

    // Method to calculate the perimeter of a rectangle
    public double calculatePerimeter(double length, double width) {
        // Perimeter of a rectangle = 2 * (length + width)
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        ShapePerimeterCalculator calculator = new ShapePerimeterCalculator();
        
        // Calculate perimeter of a circle with radius 5.0
        double circlePerimeter = calculator.calculatePerimeter1(5.0);
        System.out.println("Perimeter of the circle: " + circlePerimeter);
        
        // Calculate perimeter of a square with side length 4.0
        double squarePerimeter = calculator.calculatePerimeter1(4.0);
        System.out.println("Perimeter of the square: " + squarePerimeter);
        
        // Calculate perimeter of a triangle with sides 3.0, 4.0, and 5.0
        double trianglePerimeter = calculator.calculatePerimeter(3.0, 4.0, 5.0);
        System.out.println("Perimeter of the triangle: " + trianglePerimeter);
        
        // Calculate perimeter of a rectangle with length 6.0 and width 3.0
        double rectanglePerimeter = calculator.calculatePerimeter(6.0, 3.0);
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
    }
}
