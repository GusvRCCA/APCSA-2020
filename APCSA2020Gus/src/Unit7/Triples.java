package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
setNum(num);

	}

	public void setNum(int num)
	{
number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for(int i = 1; i<a; i+=1)
			if((a % i == 0) && (b % i == 0) && (c % i == 0))
				max=i;
		
		return max;

	}

	public String toString()
	{
		String output="";
		for(int i = 1; i<=number; i++)
			for(int j = 1; j<=number; j++)
				for(int k = 1; k<=number; k++)
					if((i*i) + (j*j) ==k*k)
						if((i%2 == 0 && j%2 == 1 || i%2 == 1 && i%2 == 0) && k%2 == 1)
							if(greatestCommonFactor(i,j,k) <= 1)
								output+=i +" "+ j +" "+ k +" "+ "\n";






		return output+"\n";
	}
}