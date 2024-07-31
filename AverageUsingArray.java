package apjfsa;
import java.util.*;

public class AverageUsingArray {
public static void main(String args[])
{
	int i;
	//creating an array
	int[] numbers=new int[15];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers");
    for(i=0;i<numbers.length-1;i++)
    {
    	numbers[i]=sc.nextInt();
    }
    System.out.println("===================");
    //displaying elements
    for(i=0;i<numbers.length-1;i++)
     System.out.println(numbers[i]+" ");
	//displaying the average of numbers
	int sum=0,j;
	for(j=0;j<numbers.length;j++) 
	 sum+=numbers[j];
	float avg = sum/numbers.length;
	System.out.println("Average is:");
	System.out.println(avg);
}
}