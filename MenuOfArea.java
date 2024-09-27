package apjfsa;

import java.util.*;

public class MenuOfArea {
	// Method to calculate the area of a circle
	public static double calculateArea(double radius) {
		return 3.14 * radius * radius;
	}

	// Method to calculate the area of a square
	public static double calculateArea(double sideLength, String shape) {

			return sideLength * sideLength;
	}

	// Method to calculate the area of a rectangle
	public static double calculateArea(double length, double width) {
			return length * width;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to menu of area: ");
		System.out.println("1.circle");
		System.out.println("2.Square");
		System.out.println("3.Rectangle");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Enter the radius of the circle: ");
			double radius = sc.nextDouble();
			System.out.println("Area of the circle: " + calculateArea(radius));
			break;
		case 2:
			System.out.print("Enter the length of side of the square: ");
			double sideLength = sc.nextDouble();
			System.out.println("Area of the square: " + calculateArea(sideLength));
			break;
		case 3:
			System.out.print("Enter the length of the rectangle: ");
			double length = sc.nextDouble();
			System.out.print("Enter the width of the rectangle: ");
			double width = sc.nextDouble();
			System.out.println("Area of the rectangle: " + calculateArea(length, width));
			break;
		default:
			System.out.println("Invalid choice. Please select 1, 2, or 3.");
		}

		sc.close();
	}
}
