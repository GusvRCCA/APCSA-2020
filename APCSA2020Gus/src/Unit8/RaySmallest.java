package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
		int small = ray[0];
		for(int i = 1; i<ray.length; i++)
			if(ray[i]<small)
				small = ray[i];
		return small;
	}
}