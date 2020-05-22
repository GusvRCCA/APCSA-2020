package StarFighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		final int perRow = 10;
		final int spacing = 65;
		for (int i=0; i<size; i++){
			int col = i%perRow;
			int row = i/perRow;
			add(new Alien((col)*spacing+ row*spacing/2, (row)*spacing));
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien al:aliens)
			al.draw(window);
	}

	public void moveEmAll()
	{
		for(Alien al:aliens){
			if(al.getX()+al.getWidth()>=750 && al.getSpeed()>0
				|| al.getX()<=50 && al.getSpeed()<0) {
				al.setSpeed(-al.getSpeed());
				al.setY(al.getY()+al.getHeight());
			}
			al.setX(al.getX()+al.getSpeed());
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i =0; i<shots.size(); i++)
		{
			Ammo shot = shots.get(i);
			for (int j=0; j<aliens.size(); j++)
			{
				Alien alien = aliens.get(j);
				if(shot.collide(alien))
				{
					aliens.remove(j);
					shots.remove(i);
					j--;
					i--;
				}
			}
		}
	}
	
	public void stopHorde()
	{
		for (Alien alien : aliens)
		{
			alien.setSpeed(0);
		}
	}

	public List<Alien> getList()
	{
		return aliens;
	}
	
	public String toString()
	{
		return "";
	}
}
