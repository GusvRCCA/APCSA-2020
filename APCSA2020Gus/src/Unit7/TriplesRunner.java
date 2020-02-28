package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;
import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Scanner keyb = new Scanner(in);
	   out.print("Enter a number :: ");
	   int n = keyb.nextInt();
	   
	   Triples nums = new Triples(n);
	   out.print(nums);
	}
}