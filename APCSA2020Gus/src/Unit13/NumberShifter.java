package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter{

static int[] arr;

public NumberShifter(int size){
	arr = makeLucky7Array(size);
}
	
	public static int[] makeLucky7Array(int s)
	{
		Random rand = new Random();
		int[] nums = new int[s];
		for(int i = 0; i<s; i++)
			nums[i] = rand.nextInt(10)+1;
		return nums;
	}
	
	public static void shiftEm()
{
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 7) {

				for(int j = i; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = 7;
			}
		}
	}
	
	public String toString(){
		return Arrays.toString(arr);
	}
}