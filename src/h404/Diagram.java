package h404;

import java.applet.Applet;
import java.awt.Color;
/*
 * Made by
 * Sergio Dasai
 */
import java.awt.Graphics;
@SuppressWarnings("serial")
public class Diagram extends Applet {

	public void init() {
		setSize(600, 400);
		
	}
	public void paint(Graphics g) {
		setBackground(Color.gray);
		g.setColor(Color.red);
		g.fillRect(0, 60, 100, 190);
		g.setColor(Color.white);
		g.fillRect(70, 0, 100, 250);
		g.setColor(Color.blue);
		g.fillRect(170, 20, 100, 230);
		g.setColor(Color.black);
		g.drawLine(20, 250, 400, 250);
		g.drawString("Hans", 200, 300);
		g.drawString("Jeroen", 100, 300);
		g.drawString("Valerie", 10, 300);
//g.drawLine(x1, y1, x2, y2);
		
		
	}

}
