package Winter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class WinterScenePanel extends JPanel implements Runnable
{
	private static final Graphics window = null;
	private List<AbstractShape> shapes;
	private AbstractShape sMan;
	private FancySnowFlake flake;
	Random rand = new Random();
	
	public WinterScenePanel()
	{
		setVisible(true);
		//refer shapes to a new ArrayList of AbstractShape
		shapes = new ArrayList<AbstractShape>();
		//populate the list with 50 unique snowflakes
		for (int i = 0; i < 50; i++){
			int w = rand.nextInt(3)*2;
			int h = rand.nextInt(15)*2;
			int y = rand.nextInt(500);
			shapes.add(new FancySnowFlake(i*16+1, y, w, h));
		}

		//instantiate a snowman

		sMan = new SnowMan(550,375,200,170);
		
		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("MAKE A WINTER SCENE!",40,40);

		//make the snowman appear
		sMan.draw(window);
		//make the snowflakes appear and move down the screen
		
		//check to see if any of the snowflakes need to be reset to the top of the screen
		for(AbstractShape s:shapes){
			s.moveAndDraw(window);
			if (s.getYPos() >= getHeight())
				s.setYPos(0);
		}
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}