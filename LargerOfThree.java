package apjfsa;

import java.util.Scanner;

public class LargerOfThree {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Enter 3 numbers:");
        int a, b, c;

        // Read the three integers from the user
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // Compare the three numbers to find the largest
        if (a > b && a > c) {
            // If 'a' is greater than both 'b' and 'c'
            System.out.println("The greatest number is: " + a);
        } else if (b > c) {
            // If 'b' is greater than 'c' and 'a' is not greater than 'b'
            System.out.println("The greatest number is: " + b);
        } else {
            // If 'c' is greater than both 'a' and 'b', or if 'a' and 'b' are not greater than 'c'
            System.out.println("The greatest number is: " + c);
        }

        // Close the Scanner object
        sc.close();
    }
}
