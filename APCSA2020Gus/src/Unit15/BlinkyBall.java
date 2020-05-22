package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{
	Random rand = new Random();
	private int xSpeed;
	private int ySpeed;
   //constructors
   public BlinkyBall()
   {
	   super(200,200);
		xSpeed = 1;
		ySpeed = 1;
   }

   public BlinkyBall(int x, int y)
   {
	   super(x,y);
		xSpeed = 1;
		ySpeed = 1;

   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
	   super(x,y,wid,ht);
	   xSpeed = 1;
	   ySpeed = 1;
   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,xSpd,ySpd);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,col,xSpd,ySpd);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }
   
   public int getXSpeed() {
		return xSpeed;
   }
   public int getYSpeed() {
		return ySpeed;
   }
   public void setXSpeed(int x) {
	   xSpeed = x;
   }
   public void setYSpeed(int y) {
	   ySpeed = y;
   }

   public Color randomColor()
   {
   		int r = rand.nextInt(255);		//use Math.random()
 		int g = rand.nextInt(255);
 		int b = rand.nextInt(255);
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {
	   draw(window,Color.white);
       setX(getX()+xSpeed);
       setY(getY()+ySpeed);
       draw(window,randomColor());
   }
   public void speedUp() {
		  int spd =getXSpeed();
		  if((spd < 2 && spd > 0) || spd > -2 && spd < 0) {
			   if(spd < 0)
				   setXSpeed(getXSpeed()-1);
				   
			   if(spd > 0)
				   setXSpeed(getXSpeed()+1);
				   
		 }
	  }

}