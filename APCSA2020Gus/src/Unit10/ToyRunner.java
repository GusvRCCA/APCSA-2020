package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy ball = new Toy();
		ball.setCount(2);
		System.out.println(ball);
		
		Toy sorry = new Toy("sorry");
		sorry.setCount(1);
		System.out.println(sorry);

		Toy gj = new Toy("gi joe");
		gj.setCount(5);
		System.out.println(gj);
	}
}