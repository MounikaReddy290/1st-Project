package apjfsa;
import java.util.Scanner;

public class DivideTwoNumbers {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//entering 1st number
	System.out.println("Enter first number:");
	double num1 = sc.nextDouble();
	//entering 2nd number
	System.out.println("Enter second number:");
	double num2= sc.nextDouble();
	//checking the condition if denominator is zero 
	if (num2 != 0) {
        double result = num1 / num2;
        System.out.println("The result of " + num1 + " divided by " + num2 + " is: " + result);
    } else {
        System.out.println("Error: Cannot divide by zero.");
    }

    // Close the scanner
    sc.close();
	

	}

}
