package Winter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
      window.fillOval(getXPos(), getYPos(), getWidth(), getHeight());
      window.fillOval((int)(getXPos()+ getWidth()*0.25), (int)(getYPos()- getHeight()*0.5+15), (int)(getWidth()*0.5), (int)(getHeight()*0.5));
      window.fillOval((int)(getXPos()+ getWidth()*0.375), (int)(getYPos()- getHeight()*0.75+21), (int)(getWidth()*0.25), (int)(getHeight()*0.25));
      window.setColor(Color.BLACK);
      window.fillOval(getXPos()+getWidth()/2, (int)(getYPos()+getHeight()*0.25), 8, 8);
      window.fillOval(getXPos()+getWidth()/2, getYPos()+getHeight()/2, 8, 8);
      window.fillOval(getXPos()+getWidth()/2, (int)(getYPos()+getHeight()*0.75), 8, 8);

   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}