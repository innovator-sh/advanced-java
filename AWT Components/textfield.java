import java.awt.*;
import java.applet.*;

public class textfield extends Applet {
	
	 TextField t2, t3;
	
	public void init() {

		Label l1 = new Label("ID: ");
		TextField t1 = new TextField();
		Label l2 = new Label("Username: ");
		t2 = new TextField(10);
		Label l3 = new Label("Password: ");
		t3 = new TextField(12);
		
		t3.setEchoChar('*'); // Dislays * instead of the actual characters when they're entered
		
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		
	}
	
	public void paint(Graphics g) {
		g.drawString("Username is: "+t2.getText(), 50, 90);
		g.drawString(""+t3.echoCharIsSet(), 50, 115);
		g.drawString("Echo character is: "+t3.getEchoChar(), 50, 150);
	}
	
}

/*
	<applet code="textfield.class" width=300 height=300>
	</applet>
*/