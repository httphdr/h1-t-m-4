package h06;

import java.awt.*;
import java.applet.*;


public class Reken2 extends Applet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double a, b, c, uur, dag, jaar;
	
	
    public void init() {
        a = 1;
        b = 24;
        c = 8760;
        
        uur = a * 3600;
        dag = b * 3600;
        jaar = c * 3600;
    
    
    }

    public void paint(Graphics g) {
        g.drawString("seconden in een uur: " + uur, 20, 20);
        g.drawString("seconden in een dag: " + dag, 20, 40);
        g.drawString("seconden in een jaar: " + jaar, 20, 60 );
        
        
    }
}