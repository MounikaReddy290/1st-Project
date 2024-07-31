package apjfsa;

import java.util.Scanner;//importing Scanner
//declaring a class

public class Profit_Loss {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float sp, cp;// declaring variables
		System.out.println("Enter selling price and cost price:");
		sp = sc.nextFloat();// permitting user to enter selling price
		cp = sc.nextFloat();// permitting user to enter cost price
		if (sp > cp)// check if selling price is greater
			System.out.println("profit is" + (sp - cp));// printing the profit value
		else
			System.out.println("loss is" + (cp - sp));// printing the loss value
	}

}
