package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne w = new TriangleOne();
		w.print();
		//add test cases
		w.setWord("abcd");
		w.print();
		
		w.setWord("it");
		w.print();
		
		w.setWord("a");
		w.print();
		
		w.setWord("chicken");
		w.print();
	}
}