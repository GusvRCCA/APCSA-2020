package ewDefense;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Pandemic extends Canvas implements KeyListener, Runnable
{
	private Player player;
	private VirusCluster viruses;
	private Sanitizer san;
	private int sanSpeed;
	private int antibodies;
	private int vSpeed=4;
	private int score;
	private int started;
	private boolean[] keys;
	private highscore hScore;
	private BufferedImage back;

	public Pandemic() throws IOException
	{
		setBackground(Color.black);

		keys = new boolean[3];
	  	player = new Player(300,525,50,97,5);
		viruses = new VirusCluster(5, vSpeed);
		san = new Sanitizer(-100,575,50,50,sanSpeed);
		hScore = new highscore();
		hScore.obtain();
		this.addKeyListener(this);
		new Thread(this).start();
		sanSpeed = 10;
		antibodies = 3;
		score = 0;
		started = 0;
		
		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		Graphics2D twoDGraph = (Graphics2D)window;
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.white);
		graphToBack.fillRect(0,0,600,800);
		if(started==0){
		graphToBack.setColor(Color.blue);
		graphToBack.drawString("Defend the Masks from Covid! ", 200, 350 );
		}
		graphToBack.setColor(Color.black);
		graphToBack.drawLine(0, 624, 600, 624);
		for(int i = 1; i<antibodies+1; i++){
			try {
				graphToBack.drawImage(ImageIO.read(getClass().getResource("/ewDefense/antibody.png")), 600-(35*i), 5, 25, 25, null, null);
			} catch (IOException e) {
				System.out.print("No antibody image found");
			}
		}
		for(int i = 0; i<8; i++){
			try {
				graphToBack.drawImage(ImageIO.read(getClass().getResource("/ewDefense/mask.jpeg")), i*75, 625, 75, 50, null, null);
			} catch (IOException e) {
				System.out.print("No mask image found");
			}
		}
		player.draw(graphToBack);
		viruses.drawEmAll(graphToBack);
		san.move("");
		san.draw(graphToBack);
		viruses.moveEmAll();
		viruses.removeDefeated();
		vSpeed = 4 + score/10;
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("Score: "+score, 533, 52);
		graphToBack.drawString("Highscore: "+hScore.get(), 503, 67);
		
		
		if (antibodies<=0) 
		{
			viruses.stop();
			if(score>hScore.get()){
				graphToBack.setColor(Color.BLUE);
				graphToBack.drawString("Highscore Beaten!", 232, 375);
				try {
					hScore.input(score);
				} catch (IOException e) {
					System.out.println("highscore.txt cannot be written to");
					e.printStackTrace();
				}
			}
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("GAME OVER", 250, 350);
		}
		
		if(started>0){
			graphToBack.setColor(Color.white);
			graphToBack.drawString("Defend the Masks from Covid! ", 200, 350 );
			started=-1;
		}
		
		
		if(keys[0] == true && player.getX()>player.getSpeed())
		{
			player.move("LEFT");
			player.setFacingRight(false);
			player.setImage("/ewDefense/nurseLeft.jpeg");
			if(started==0)
				started++;
		}
		if (keys[1] == true && player.getX()<(600-player.getSpeed()-player.getWidth()))
		{
			player.move("RIGHT");
			player.setFacingRight(true);
			player.setImage("/ewDefense/nurseRight.jpg");
			if(started==0)
				started++;
		}
		if (keys[2] == true){
			if(player.getFacingRight()){
				san.setSpeed(sanSpeed);
				san.setX(player.getX()+player.getWidth());
			}
			else{
				san.setSpeed(-sanSpeed);
				san.setX(player.getX()-san.getWidth());
			}
			keys[2]=false;
		}
		
		
		
		for (Virus vi : viruses.getList())
		{
			if (player.collide(vi) || san.collide(vi)){
				vi.setDead(true);
				score++;
				viruses.addNew(vSpeed);
			}
			if(vi.getY()+vi.getHeight()>=625){
				vi.setDead(true);
				antibodies--;
				viruses.addNew(vSpeed);
			}
			viruses.removeDefeated();
		}
		
		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[2] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[2] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e){}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

