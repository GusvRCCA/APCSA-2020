package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> nums)
	{
		if(nums.size()<2)
			return false;
		for(int i = 1; i<nums.size(); i++)
			if(nums.get(i)>=nums.get(i-1))
				return false;
		return true;
	}	
}