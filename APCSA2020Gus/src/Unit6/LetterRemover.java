package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("I am Sam I am", 'a');
		//call set
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = sentence.replace(lookFor, Character.MIN_VALUE);
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor+"\n" + removeLetters() + "\n";
	}
}