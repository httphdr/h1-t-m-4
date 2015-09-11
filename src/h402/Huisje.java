package h402;

import java.applet.Applet;
/*
 * Made by
 * Sergio Dasai
 */
import java.awt.Graphics;
@SuppressWarnings("serial")
public class Huisje extends Applet {

	public void init() {
		setSize(400, 400);
		
	}
	public void paint(Graphics g) {
		g.drawRect(40, 120, 200, 200);
		g.drawRect(170, 140, 45, 45);
		g.drawRect(65, 200, 60, 120);
		g.drawLine(40, 120, 150, 50);
		g.drawLine(240, 120, 150, 50);
//g.drawLine(x1, y1, x2, y2);
		
		
	}

}
