package apjfsa;
import java.util.*;

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee1 extends Person {
    int empid;

    Employee1(String name, int age, int empid) {
        super(name, age);
        this.empid = empid;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("------employee-----");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("employee ID: " + empid);
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loop to take input for three employees
        for (int i = 0; i < 3; i++) {
            System.out.println("ENTER THE NAME OF EMPLOYEE " + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("ENTER THE AGE OF EMPLOYEE " + (i + 1) + ":");
            int age = sc.nextInt();

            System.out.println("ENTER THE ID OF EMPLOYEE " + (i + 1) + ":");
            int id = sc.nextInt();
            
            // Clear the newline character left in the buffer after nextInt()
            sc.nextLine();

            // Create an instance of Employee1 and display details
            Employee1 employee = new Employee1(name, age, id);
            employee.displayDetails();
        }

        // Close the scanner
        sc.close();
    }
}
