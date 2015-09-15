package h06;

	import java.awt.*;
	import java.applet.*;


	public class Reken extends Applet {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		double a, b, c, d, e, uitkomst;
		
		
	    public void init() {
	        a = 113;
	        b = 4;
	        c = 4;
	        d = 4;
	        e = 4;
	        
	        uitkomst = a / c;
	    }

	    public void paint(Graphics g) {
	        g.drawString("Jan heeft " + uitkomst, 20, 20);
	        g.drawString("Ali heeft " + uitkomst, 20, 40);
	        g.drawString("Jeannette heeft " + uitkomst, 20, 60);
	        g.drawString("Haris heeft " + uitkomst, 20, 80);
	    }
	}