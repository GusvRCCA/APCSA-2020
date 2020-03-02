package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		if(ray.size()<2)
			return -1;
		int first = ray.get(0);
		boolean nums = false;
		int sum = 0;
		for(int num:ray)
			if(num>first){
				sum+=num;
				nums = true;
			}
		if(nums)
			return sum;
		return -1;
	}
}