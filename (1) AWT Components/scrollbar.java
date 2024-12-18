import java.awt.*;
import java.applet.*;

public class scrollbar extends Applet {
	
	Scrollbar sb1, sb2, sb3;
	
	public void init() {
		
		sb1 = new Scrollbar();
		sb2 = new Scrollbar(Scrollbar.HORIZONTAL);
		sb3 = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 100); 
		//Scrollbar(int style, int iValue, int tSize, int min, int max);
		
		add(sb1);
		add(sb2);
		add(sb3);
		
	}
	
	public void paint(Graphics g){
		g.drawString(""+sb1.getMinimum(), 50, 60);
		g.drawString(""+sb1.getMaximum(), 50, 75);
		g.drawString(""+sb3.getValue(), 50, 90);
	}
	
}

/*
	<applet code="scrollbar.class" width=300 height=300>
	</applet>
*/