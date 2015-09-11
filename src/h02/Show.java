package h02;
import java.applet.*;
import java.awt.*;


public class Show extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		setBackground(Color.blue);
	}

	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.drawString("Haris", 80, 90 );
		
	}





}
