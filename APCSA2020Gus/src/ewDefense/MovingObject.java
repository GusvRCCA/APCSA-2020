package ewDefense;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingObject implements Moving
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	public MovingObject()
	{
		setPos(10,10);
		width = 10;
		height = 10;
	}

	public MovingObject(int x, int y)
	{
		setPos(x,y);
		width = 10;
		height = 10;
	}

	public MovingObject(int x, int y, int w, int h)
	{
		setPos(x,y);
		width=w;
		height=h;
	}

	public void setPos( int x, int y)
	{
		setX(x);
		setY(y);
	}

	public void setX(int x)
	{
		xPos=x;
	}

	public void setY(int y)
	{
		yPos=y;
	}

	public int getX()
	{
		return xPos;
	}

	public int getY()
	{
		return yPos;
	}

	public void setWidth(int w)
	{
		width=w;
	}

	public void setHeight(int h)
	{
		height=h;
	}

	public int getWidth()
	{
		return width;  
	}

	public int getHeight()
	{
		return height; 
	}
	
	public boolean collide(MovingObject obj){
		int x = obj.getX();
		int y = obj.getY();
		int x2 = x+obj.getWidth();
		int y2 = y+obj.getHeight();
		boolean xCol = false;
		boolean yCol = false;
		xCol = !(xPos>x2 || xPos+width<x);
		yCol = !(yPos>y2 || yPos+height<y);
		return (xCol&&yCol);
	}

	public abstract void move(String direction);
	public abstract void draw(Graphics window);

	}