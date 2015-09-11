package h403;

import java.applet.Applet;
import java.awt.Color;
/*
 * Made by
 * Sergio Dasai
 */
import java.awt.Graphics;
@SuppressWarnings("serial")
public class Vlagnl extends Applet {

	public void init() {
		setSize(600, 400);	
		
	}
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(40, 0, 400, 70);
		g.setColor(Color.white);
		g.fillRect(40, 50, 400, 70);
		g.setColor(Color.blue);
		g.fillRect(40, 100, 400, 70);
		g.setColor(Color.black);
		g.drawLine(40, 40, 40, 300);
//g.drawLine(x1, y1, x2, y2);
		
		
	}

}
