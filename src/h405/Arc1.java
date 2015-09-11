package h405;

import java.applet.Applet;
import java.awt.Color;
/*
 * Made by
 * Sergio Dasai
 */
import java.awt.Graphics;
@SuppressWarnings("serial")
public class Arc1 extends Applet {

	public void init() {
		setSize(300, 200);
		
	}
	public void paint(Graphics g) {
		setBackground(Color.blue);
		g.setColor(Color.yellow);
		g.fillArc(28, 40, 200, 100, 90, 360);
	
//g.drawLine(x1, y1, x2, y2);
		
		
	}

}
