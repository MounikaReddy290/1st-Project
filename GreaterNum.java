package apjfsa;

import java.util.Scanner;

public class GreaterNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter numbers:");
	    int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		if((a>=b) && (a>=c) && (a>=d) && (a>=e))
			System.out.println("The Greatest number is"+a);
		else if((b>=c) && (b>=d) && (b>=e))
			System.out.println("The greatesr number is:"+b);
		else if((c>=d) && (c>=e))
		    System.out.println("The greatest number is:"+c);
		else if(d>=e)
		    System.out.println("The greatest number is:"+d);
		else
			System.out.println("the greatest number is:"+e);
		// TODO Auto-generated method stub

	}

}
