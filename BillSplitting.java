package apjfsa;

import java.util.Scanner;

public class BillSplitting {
    // Method for calculating bill for each person
    public void splitting(float totalBill, int persons) {
        if (persons <= 0) {
            System.out.println("Number of persons must be greater than zero.");
            return;
        }
        float billPerPerson = totalBill / persons;
        System.out.printf("Bill for each person is: %.2f%n", billPerPerson);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Asking user to enter total bill
            System.out.println("Enter total bill:");
            float totalBill = sc.nextFloat();
            if (totalBill < 0) {
                System.out.println("Total bill cannot be negative.");
                return;
            }

            // Asking user to enter number of persons
            System.out.println("Enter number of persons:");
            int persons = sc.nextInt();

            // Creating an object for BillSplitting class
            BillSplitting obj = new BillSplitting();
            // Calling splitting method using an object
            obj.splitting(totalBill, persons);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            sc.close();
        }
    }
}
