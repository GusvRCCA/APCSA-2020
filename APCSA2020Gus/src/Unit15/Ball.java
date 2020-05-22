package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200,10,10,Color.BLACK);
		xSpeed = 2;
		ySpeed = 1;
	}
	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x,y,10,10,Color.black);
		xSpeed = 2;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height) {
		super(x,y,width,height,Color.black);
		xSpeed = 2;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, int xSpeed) {
		super(x,y,width,height, null);
		setXSpeed(xSpeed);
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, int xSpeed, int ySpeed) {
		super(x,y,width,height, null);
		setXSpeed(xSpeed);
		setYSpeed(ySpeed);
	}
	
	public Ball(int x, int y, int width, int height, Color color) {
		super(x,y,width,height,color);
		xSpeed = 2;
		ySpeed = 1;
	}	
	
	public Ball(int x, int y, int width, int height, Color color, int xSpeed) {
		super(x,y,width,height,color);
		setXSpeed(xSpeed);
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, Color color, int xSpeed, int ySpeed) {
		super(x,y,width,height,color);
		setXSpeed(xSpeed);
		setYSpeed(ySpeed);
	}
	
   //add the set methods
   public void setXSpeed(int x) {
	   xSpeed = x;
   }
   public void setYSpeed(int y) {
	   ySpeed = y;
   }
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window,Color.white);
	       setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
   }
	public boolean equals(Object obj)
	{
		Ball temp = (Ball) obj;
		if(getX() == temp.getX() && getY() == temp.getY() && 
				getWidth() == temp.getWidth() && 
				getHeight() == temp.getHeight() && 
				getColor().getRGB() == temp.getColor().getRGB() && 
				xSpeed == temp.getXSpeed() && ySpeed == temp.getYSpeed())
			return true;
		return false;
	}   
   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
   //add a toString() method
	public String toString() {
		return getX() + "," + getY() + "," + getWidth() + "," + getHeight() + "," + getColor().toString() + "," + xSpeed + "," + ySpeed;
	}
	@Override
	public boolean didCollideLeft(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean didCollideRight(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean didCollideTop(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean didCollideBottom(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}