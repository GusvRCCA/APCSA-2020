package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner kyb = new Scanner(System.in);
		String word;
		String response;
		do{
		out.print("Enter a word :: ");
		word = kyb.nextLine();
		TriangleWord.printTriangle(word);
		out.print("\nDo you want to enter more sample input? :: ");
		response = kyb.nextLine().toLowerCase();
		}while(response.equals("y"));
	}
}