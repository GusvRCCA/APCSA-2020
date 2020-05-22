package Winter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape {
	public FancySnowFlake(int x, int y, int w, int h) {
		super(x, y, w, h, Color.WHITE, 0, 2);
	}

	public void draw(Graphics window) {
		window.setColor(getColor());
		int x = getXPos();
		int y  = getYPos();
		int w = getWidth();
		int h = getHeight();
		int xh = x+h;
		int yh = y+h;
		int xw = x+w;
		int yw = y+w;
		int hx = x-h;
		int hy = y-h;
		int wx = x-w;
		int wy = y-w;
		int[] xPoints = {hx-h, hx, x, hx, hx-w, hx-w/2, hx, x, wx, x, xw, x, xh, xh+w, xh+w/2, xh, x, xh, xh+h, xh, x, xh, xh+w, xh+w/2, xh, x, xw, x, wx, x, hx, hx-w, hx-w/2, hx, x, hx};
		int[] yPoints = {y, yw, y, yh, yh, yh+w, yh, y, yh, yh+h, yh, y, yh, yh, yh+w, yh, y, yw, y, wy, y, hy, hy, hy-w, hy, y, hy, hy-h, hy, y, hy, hy, hy-w, hy, y, wy};
		
		
		window.drawPolygon(xPoints, yPoints, xPoints.length);
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		int x = getXPos();
		int y  = getYPos();
		int w = getWidth();
		int h = getHeight();
		int xh = x+h;
		int yh = y+h;
		int xw = x+w;
		int yw = y+w;
		int hx = x-h;
		int hy = y-h;
		int wx = x-w;
		int wy = y-w;
		int[] xPoints = {hx-h, hx, x, hx, hx-w, hx-w/2, hx, x, wx, x, xw, x, xh, xh+w, xh+w/2, xh, x, xh, xh+h, xh, x, xh, xh+w, xh+w/2, xh, x, xw, x, wx, x, hx, hx-w, hx-w/2, hx, x, hx};
		int[] yPoints = {y, yw, y, yh, yh, yh+w, yh, y, yh, yh+h, yh, y, yh, yh, yh+w, yh, y, yw, y, wy, y, hy, hy, hy-w, hy, y, hy, hy-h, hy, y, hy, hy, hy-w, hy, y, wy};
		
		
		window.drawPolygon(xPoints, yPoints, xPoints.length);
	}


	
	public void moveAndDraw(Graphics window) {
		draw(window, Color.BLUE);
		setYPos(getYPos() + getYSpeed());
		int r = (int)(Math.random());
		int x = (int)(Math.random());
		if(r==1)
			x=-x;
		setXPos(getXPos()+x);
		draw(window);
		
	}
	
	
}
