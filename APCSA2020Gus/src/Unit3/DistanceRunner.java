package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Distance test = new Distance();
		test.calcDistance();
		System.out.println(test);
		//add test cases	
		int x1, y1, x2, y2;
		System.out.println("\n\nEnter coordinates:");
		System.out.print("X1: ");
		x1 = keyboard.nextInt();
		System.out.print("Y1: ");
		y1 = keyboard.nextInt();
		System.out.print("X2: ");
		x2 = keyboard.nextInt();
		System.out.print("X2: ");
		y2 = keyboard.nextInt();
		Distance d2 = new Distance(x1, y1, x2, y2);
		d2.calcDistance();
		System.out.println("Distance == "+d2.getDistance());
		
		//third distance
		
		System.out.println("\n\nEnter coordinates:");
		System.out.print("X1: ");
		x1 = keyboard.nextInt();
		System.out.print("Y1: ");
		y1 = keyboard.nextInt();
		System.out.print("X2: ");
		x2 = keyboard.nextInt();
		System.out.print("X2: ");
		y2 = keyboard.nextInt();
		Distance d3 = new Distance(x1, y1, x2, y2);
		d3.calcDistance();
		System.out.println("Distance == "+d3.getDistance());
		
	}
}