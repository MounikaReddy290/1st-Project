package apjfsa;
import java.util.Scanner;
import java.util.Vector;

public class GreatestNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a Vector to hold the numbers
        Vector<Integer> numbers = new Vector<>();

        // Prompt user to enter 15 numbers
        System.out.println("Enter 15 numbers:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        // Initialize greatest number to the first element
        int greatest = numbers.get(0);

        // Find the greatest number
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > greatest) {
                greatest = numbers.get(i);
            }
        }

        // Output the greatest number
        System.out.println("The greatest number is: " + greatest);

        // Close the scanner
        scanner.close();
    }
}
