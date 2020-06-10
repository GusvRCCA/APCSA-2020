package ewDefense;

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Sanitizer extends MovingObject
{
	private int speed;
	private Image image;

	public Sanitizer(){
		this(-100,575,50,50,12);
	}

	public Sanitizer(int x, int y){
		this(x, y, 50, 50, 10);
	}

	public Sanitizer(int x, int y, int s){
		this(x, y, 50, 50, s);
	}

	public Sanitizer(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try{
			URL url = getClass().getResource("/ewDefense/sanitizer.jpeg");
			image = ImageIO.read(url);
		}
		catch(Exception e){
			System.out.print("No sanitizer image found.");
		}
	}

	public void setSpeed(int s){
		speed=s;
	}

	public int getSpeed(){
	   return speed;
	}

	
	public void move(String none){
		if(getX() > -getWidth()-5 && getX()<605)
			setX(getX()+speed);
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
}
