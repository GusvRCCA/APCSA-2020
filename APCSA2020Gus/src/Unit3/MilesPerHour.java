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

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(45,0,32);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
		mph=0.0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		mph = 0.0;
	}

	public void calcMPH()
	{
		double h = hours + minutes/60.0;
		mph = Math.round(distance/h*10)/10.0;
	}

	public void print()
	{
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return distance+" miles in "+hours+ " hour(s) and " +minutes+ " = " +mph+ " MPH";
	}
}