package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		System.out.println( "\ntest_cases: "+CountPairs.pairCounter("test_cases") );
		System.out.println( "\nddogccatppig: "+CountPairs.pairCounter("ddogccatppig") );
		System.out.println( "\ndogcatpig: "+CountPairs.pairCounter("dogcatpig") );
		System.out.println( "\nxxyyzz: "+CountPairs.pairCounter("xxyyzz") );
		System.out.println( "\na: "+CountPairs.pairCounter("a") );
		System.out.println( "\nabc: "+CountPairs.pairCounter("abc") );
		System.out.println( "\naabb: "+CountPairs.pairCounter("aabb") );
		System.out.println( "\ndogcatpigaabbcc: "+CountPairs.pairCounter("dogcatpigaabbcc") );
		System.out.println( "\naabbccdogcatpig: "+CountPairs.pairCounter("aabbccdogcatpig") );
		System.out.println( "\ndogabbcccatpig: "+CountPairs.pairCounter("dogabbcccatpig") );
		System.out.println( "\naaaa: "+CountPairs.pairCounter("aaaa") );
		System.out.println( "\nAAAAAAAAA: "+CountPairs.pairCounter("AAAAAAAAA") );
		//add in all of the provided test cases from the lab handout	
	}
}