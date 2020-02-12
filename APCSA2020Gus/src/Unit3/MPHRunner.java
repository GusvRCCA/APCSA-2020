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

public class MPHRunner
{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(in);
	MilesPerHour test = new MilesPerHour();
	test.calcMPH();
	System.out.println(test);

		out.print("\n\nEnter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();
		System.out.println();

		MilesPerHour trip1 = new MilesPerHour(dist, hrs, mins);
		trip1.calcMPH();
		System.out.println(trip1);
		 
		
		//add more test cases
		out.print("\n\nEnter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();
		System.out.println();

		MilesPerHour trip2 = new MilesPerHour(dist, hrs, mins);
		trip2.calcMPH();
		System.out.println(trip2);
		
		out.print("\n\nEnter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();
		System.out.println();

		MilesPerHour trip3 = new MilesPerHour(dist, hrs, mins);
		trip3.calcMPH();
		System.out.println(trip3);
		
	}
}