package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect n = new Perfect();
		System.out.println(n);
		//add test cases
		Perfect n1 = new Perfect(496);
		System.out.println(n1);
		
		Perfect n2 = new Perfect(45);
		System.out.println(n2);
		
		Perfect n3 = new Perfect(14);
		System.out.println(n3);

		
		Perfect n4 = new Perfect(8128);
		System.out.println(n4);

		
		Perfect n5 = new Perfect(1245);
		System.out.println(n5);

		
		Perfect n6 = new Perfect(33);
		System.out.println(n6);

		
		Perfect n7 = new Perfect(28);
		System.out.println(n7);
		
		Perfect n8 = new Perfect(27);
		System.out.println(n8);

		Perfect n9 = new Perfect(33550336);
		System.out.println(n9);



	}
}