package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare s = new WordsCompare();
	   s.compare();
	   System.out.println(s);
		//add test cases
	   WordsCompare s1 = new WordsCompare("giraffe", "gorilla");
	   s1.compare();
	   System.out.println(s1);
	   
	   WordsCompare s2 = new WordsCompare("one", "two");
	   s2.compare();
	   System.out.println(s2);
	   
	   WordsCompare s3 = new WordsCompare("fun", "funny");
	   s3.compare();
	   System.out.println(s3);
	   
	   WordsCompare s4 = new WordsCompare("123", "19");
	   s4.compare();
	   System.out.println(s4);
	   
	   WordsCompare s5 = new WordsCompare("193", "1910");
	   s5.compare();
	   System.out.println(s5);
	   
	   WordsCompare s6 = new WordsCompare("goofy", "grandfather");
	   s6.compare();
	   System.out.println(s6);
	   
	   WordsCompare s7 = new WordsCompare("funnel", "fun");
	   s7.compare();
	   System.out.println(s7);
	   
	   WordsCompare s8 = new WordsCompare("g", "G");
	   s8.compare();
	   System.out.println(s8);
	   
	   WordsCompare s9 = new WordsCompare("G", "g");
	   s9.compare();
	   System.out.println(s9);
	}
}