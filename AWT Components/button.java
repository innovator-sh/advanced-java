import java.awt.*;
import java.applet.*;

public class button extends Applet {
	
	Button b1;
	
	public void init(){
		b1 = new Button("Okay");
		Button b2 = new Button();
		
		b2.setLabel("Ok"); 
		
		add(b1);
		add(b2);
	}
	
	public void paint(Graphics g){
		g.drawString(b1.getLabel(), 50, 60);
	}
}

/*
	<applet code="button.class" width=300 height=300>
	</applet>
*/