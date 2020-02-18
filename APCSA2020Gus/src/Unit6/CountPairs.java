package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = -1;
		char prev = str.charAt(0);
		char[] chars = str.toCharArray();
		for(char c:chars) {
			if(c==prev)
				count++;
			prev = c;
		}
		return count;
	}
}