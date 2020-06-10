package ewDefense;

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Player extends MovingObject
{
	private int speed;
	private Image image;
	private boolean facingRight;

	public Player(){
		this(15,700,50,97,7,true);
	}

	public Player(int x, int y){
	   this(x, y, 50, 97, 7, true);
	}

	public Player(int x, int y, int s){
	   this(x, y, 50, 97, s, true);
	}

	public Player(int x, int y, int w, int h, int s){
		this(x, y, w, h, s, true);
	}
	
	public Player(int x, int y, int w, int h, int s, boolean f){
		super(x, y, w, h);
		speed=s;
		facingRight = f;
		try{
			URL url = getClass().getResource("/ewDefense/nurseRight.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e){
			System.out.print("No player image found");
		}
	}
	
	public void setImage(String im){
		try{
			URL url = getClass().getResource(im);
			image = ImageIO.read(url);
		}
		catch(Exception e){
			System.out.print("No player image found");
		}
	}

	public void setSpeed(int s){
	   speed=s;
	}

	public int getSpeed(){
	   return speed;
	}
	
	public void setFacingRight(boolean f){
		facingRight = f;
	}
	
	public boolean getFacingRight(){
		return facingRight;
	}

	public void move(String direction){
		if (direction.equals("LEFT")) setX(getX()-getSpeed());
		else if (direction.equals("RIGHT")) setX(getX()+getSpeed());
	}

	public void draw( Graphics window ){
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

}
