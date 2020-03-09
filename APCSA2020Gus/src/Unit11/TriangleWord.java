package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
	public static void printTriangle(String word)
	{
		int n;
		for(int i = 0; i<=word.length(); i++){
			n = i;
			while(n>0){
				out.print(word.substring(0, i));
				n--;
			}
			out.println();
		}
	}
}