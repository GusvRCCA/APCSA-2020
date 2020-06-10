package ewDefense;

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Virus extends MovingObject
{
	private int speed;
	private Image image;
	private boolean dead;

	public Virus(){
		this(0,0,40,40, 3, false);
	}

	public Virus(int x, int y){
		this(x, y, 40, 40, 3, false);
	}

	public Virus(int x, int y, int s){
		this(x, y, 40, 40, s, false);
	}
	
	public Virus(int x, int y, int w, int h, int s){
		this(x, y, w, h, s, false);
	}

	public Virus(int x, int y, int w, int h, int s, boolean d){
		super(x, y, w,h);
		speed=s;
		dead = d;
		try{
			URL url = getClass().getResource("/ewDefense/virus.jpeg");
			image = ImageIO.read(url);
		}
		catch(Exception e){
			System.out.print("No virus image found.");
		}
	}

	public void setSpeed(int s){
		speed=s;
	}

	public int getSpeed(){
	   return speed;
	}

	public void setDead(boolean d){
		dead = d;
	}
	
	public boolean getDead(){
		return dead;
	}
	
	public void move(String none){
		setY(getY()+getSpeed());
	}

	public void draw( Graphics window ){
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

}
