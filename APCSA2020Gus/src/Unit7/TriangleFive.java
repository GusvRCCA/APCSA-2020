	package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('C');
		setAmount(4);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt; 
	}

	public String toString()
	{
		String output="";
		int limit = amount;
		while(limit>0){
			for(int i = 0; i<limit; i++){
			output+=letter;
			}
			output+=" ";
			limit--;
			if(letter == 'Z')
				letter = 'A';
			else
				letter++;
		}
		String temp = output;
		limit = 2;
		for (int i = temp.length()-3; i >0; i-=limit){
			output+="\n"+temp.substring(0, i);
			limit++;
		}
		return output + "\n";
	}
}