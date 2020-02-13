package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a ) {
   char c1 = a.charAt(0);
   char c2 = a.charAt(a.length()-1);
	{if((c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'||c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U')
			||(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u'||c2=='A'||c2=='E'||c2=='I'||c2=='O'||c2=='U'))
		return "yes";
	else
		return "no";
	
	}
}
}