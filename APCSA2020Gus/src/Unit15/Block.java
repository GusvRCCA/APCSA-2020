package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setPos(100, 150);
		setWidth(10);
		setHeight(10);
		setColor(Color.black);
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y){
		setPos(x,y);
		setWidth(30);
		setHeight(30);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, int w, int h){
		setPos(x,y);
		setWidth(w);
		setHeight(h);
		setColor(Color.BLACK);
	}
	
	public Block(int x, int y, Color c){
		setPos(x,y);
		setWidth(10);
		setHeight(10);
		setColor(c);
	}
	
	public Block(int x, int y, int w, int h, Color c){
		setPos(x,y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;
   }
	
	public void setX(int x){
		xPos = x;
	}
	
	public void setY(int y){
		yPos = y;
	}
	
	public void setPos(int x, int y){
		setX(x);
		setY(y);
	}
	
	public void setWidth(int w){
		width = w;
	}
	
	public void setHeight(int h){
		height = h;
	}

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block temp = (Block) obj;
		if(xPos == temp.getX() && yPos == temp.getY() && width == temp.getWidth() && height == temp.getHeight() && color.getRGB() == temp.getColor().getRGB())
			return true;
		return false;
	}   

   //add the other get methods
	
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}   
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Color getColor() {
		return color;
	}


   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return xPos + "," + yPos + "," + width + "," + height + "," + color.toString();
	}

}