package apjfsa;
import java.util.*;

public class EvenUsingArray {
    public static void main(String args[]) {
        //creating an array of 10 numbers
        int[] numbers = new int[10];
        //creating a variable for index
        int index;
        Scanner sc = new Scanner(System.in);
        //input of data through keyboard
        System.out.println("Enter 10 numbers:");
        for(index = 0; index < 10; index++)
            numbers[index] = sc.nextInt();

        //Displaying elements
        System.out.print("numbers are:");
        for(index = 0; index < numbers.length; index++)
            System.out.print(numbers[index] + ",");
        System.out.println("\n==============");
        
        // displaying even numbers
        System.out.print("even numbers:");
        for(index = 0; index < numbers.length; index++) {
            if(numbers[index] % 2 == 0) {
                System.out.print(numbers[index] + ",");
            }
        }
    }
}
