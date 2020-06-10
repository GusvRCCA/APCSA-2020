package ewDefense;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VirusCluster
{
	private List<Virus> viruses;
	Random rand = new Random();
	
	public VirusCluster(int size, int s){
		viruses = new ArrayList<Virus>();
		int y = 0;
		for(int i = 0; i<size-1; i++){
			int dim = rand.nextInt(76)+40;
			int x = rand.nextInt(600-dim);
				if(i!=0 && (x<viruses.get(i-1).getX()-30-dim && x>viruses.get(i-1).getX()+viruses.get(i-1).getWidth()+30))
					do{
						x = rand.nextInt(600-dim);
					}while(!(x<viruses.get(i-1).getX()-30-dim && x>viruses.get(i-1).getX()+viruses.get(i-1).getWidth()+30));
			int ySpace = 0;
			if(i!=0){
				ySpace = rand.nextInt(256)+200;
				if(rand.nextInt(2)==1)
					ySpace = -ySpace;
			}
			add(new Virus(x, y-ySpace, dim, dim, s));
			y-=ySpace;
		}
	}

	public void add(Virus vi)
	{
		viruses.add(vi);
	}
	
	public void addNew(int s){
			int dim = rand.nextInt(76)+40;
			int x = rand.nextInt(600-dim);
				if(x<viruses.get(viruses.size()-1).getX()-30-dim && x>viruses.get(viruses.size()-1).getX()+viruses.get(viruses.size()-1).getWidth()+30)
					do{
						x = rand.nextInt(600-dim);
					}while(!(x<viruses.get(viruses.size()-1).getX()-30-dim && x>viruses.get(viruses.size()-1).getX()+viruses.get(viruses.size()-1).getWidth()+30));
			int ySpace = rand.nextInt(26);
			if(rand.nextInt(2)==1)
				ySpace = -ySpace;
			add(new Virus(x, -dim-ySpace-200, dim, dim, s));
	}
	
	public int arraySize(){
		return viruses.size();
	}

	public void drawEmAll( Graphics window )
	{
		for (Virus vi:viruses)
			vi.draw(window);
	}

	public void moveEmAll()
	{
		for(Virus vi:viruses){
			vi.move("");
		}
	}

	public void removeDefeated()
	{
		for(int i = 0; i<viruses.size(); i++){
			if(viruses.get(i).getDead()==true)
				viruses.remove(i);
		}
	}
	
	public void stop()
	{
		for (Virus vi : viruses)
		{
			vi.setSpeed(0);
		}
	}

	public List<Virus> getList()
	{
		return viruses;
	}
	
}
