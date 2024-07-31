package apjfsa;

public class Patterns {
    public static void main(String[] args) {
        // Outer loop to handle the number of rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop to handle the number of columns
            // It will print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                // Print the current number with a space
                System.out.print(j + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
