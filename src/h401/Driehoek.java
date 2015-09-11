package h401;

import java.applet.Applet;
/*
 * Made by
 * Sergio Dasai
 */
import java.awt.Graphics;
@SuppressWarnings("serial")
public class Driehoek extends Applet {

	public void init() {
		setSize(400, 400);
		
	}
	public void paint(Graphics g) {
		g.drawLine(50, 120, 270, 120);
		g.drawLine(180, 0, 270, 120);
		g.drawLine(50, 120, 180, 0);
	}

}
