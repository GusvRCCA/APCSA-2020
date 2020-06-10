package ewDefense;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;
import java.awt.Component;
import java.io.IOException;

public class ewDefense extends JFrame
{
	private static final int WIDTH = 600;
	private static final int HEIGHT = 800;

	public ewDefense() throws IOException
	{
		super("Essential Worker Defense");
		setSize(WIDTH,HEIGHT);

		Pandemic theGame = new Pandemic();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
	}

	public static void main( String args[] ) throws IOException
	{
		ewDefense run = new ewDefense();
	}
}