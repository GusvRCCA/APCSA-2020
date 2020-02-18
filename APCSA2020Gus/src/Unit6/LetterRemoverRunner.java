package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
LetterRemover s = new LetterRemover();
System.out.println(s);
		
		//add test cases		
					
LetterRemover s1 = new LetterRemover("ssssssssxssssesssssesss", 's');
System.out.println(s1);

LetterRemover s2 = new LetterRemover("qwertyqwertyqwerty", 'a');
System.out.println(s2);

LetterRemover s3 = new LetterRemover("abababababa", 'b');
System.out.println(s3);

LetterRemover s4 = new LetterRemover("abaababababa", 'x');
System.out.println(s4);

	}
}