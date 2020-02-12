package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5)+"\n");
		Scanner keyb = new Scanner(System.in);
		
	    int num;
	    int n = 0;
	    while(n<4) {
	    System.out.print("Enter an integer : : ");
	    num =keyb.nextInt();
		System.out.println(num+" is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num+" is even :: " + NumberVerify.isEven(num)+"\n");
		n++;
	    }
		//add in more test cases
	}
}