package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality s= new StringEquality();
		System.out.println(s);
		//add test cases
		StringEquality s1= new StringEquality("one", "two");
		System.out.println(s1);
		
		StringEquality s2= new StringEquality("three", "four");
		System.out.println(s2);
		
		StringEquality s3= new StringEquality("TCEA", "UIL");
		System.out.println(s3);
		
		StringEquality s4= new StringEquality("State", "Champions");
		System.out.println(s4);
		
		StringEquality s5= new StringEquality("ABC", "ABC");
		System.out.println(s5);
		
		StringEquality s6= new StringEquality("ABC", "CBA");
		System.out.println(s6);
		
		StringEquality s7= new StringEquality("Same", "Same");
		System.out.println(s7);
		
		StringEquality s8= new StringEquality("Same", "same");
		System.out.println(s8);
	}
}