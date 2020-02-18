package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word w = new Word();
		System.out.println(w);
		//add test cases
		w.setString("World");
		System.out.println(w);
		
		w.setString("JukeBox");
		System.out.println(w);
		
		w.setString("TCEA");
		System.out.println(w);
		
		w.setString("UIL");
		System.out.println(w);
	}
}