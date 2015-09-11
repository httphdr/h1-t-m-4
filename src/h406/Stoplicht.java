package h406;

import java.applet.Applet;
import java.awt.Color;
/*
 * Made by
 * Sergio Dasai
 */
import java.awt.Graphics;
@SuppressWarnings("serial")
public class Stoplicht extends Applet {

	public void init() {
		setSize(600, 400);
		
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(20, 20, 150, 300);
		g.setColor(Color.red);
		g.fillOval(70, 50, 50, 50);
		g.setColor(Color.orange);
		g.fillOval(70, 135, 50, 50);
		g.setColor(Color.green);
		g.fillOval(70, 220, 50, 50);
		
//g.drawLine(x1, y1, x2, y2);
		
		
	}

}
