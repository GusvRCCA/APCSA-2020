package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter shift = new NumberShifter(20);
		System.out.println(shift);
		shift.shiftEm();
		System.out.println(shift+"\n");
		
		NumberShifter shift2 = new NumberShifter(20);
		System.out.println(shift2);
		shift2.shiftEm();
		System.out.println(shift2+"\n");
		
		NumberShifter shift3 = new NumberShifter(20);
		System.out.println(shift3);
		shift3.shiftEm();
		System.out.println(shift3+"\n");

	}
}



