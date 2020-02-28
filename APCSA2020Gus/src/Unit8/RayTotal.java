package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayTotal
{
	public static int go(int[] ray)
	{
		int sum = ray[0];
		for(int i = 1; i<ray.length; i++)
			sum+=ray[i];
		return sum;
	}
}