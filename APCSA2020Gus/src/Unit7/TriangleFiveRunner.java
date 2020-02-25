package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive test = new TriangleFive();
	   System.out.println(test);
	   
	   TriangleFive t1 = new TriangleFive('A', 5);
	   System.out.println(t1);
	   
	   TriangleFive t2 = new TriangleFive('B', 7);
	   System.out.println(t2);
	   
	   TriangleFive t3 = new TriangleFive('X', 6);
	   System.out.println(t3);
	   
	   TriangleFive t4 = new TriangleFive('Z', 8);
	   System.out.println(t4);
	}
}