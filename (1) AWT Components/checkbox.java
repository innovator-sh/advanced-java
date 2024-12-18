import java.awt.*;
import java.applet.*;

public class checkbox extends Applet {
	
	Checkbox c1,c3;
	
	public void init() {
		
		Label l1 = new Label("Select language: ");
		c1 = new Checkbox();
		Checkbox c2 = new Checkbox("Cpp");
		c3 = new Checkbox("Rust", true);
		Checkbox c4 = new Checkbox("Golang");
		
		c1.setLabel("Python");
		c4.setState(true);
		
		add(l1);
		add(c1); add(c2); add(c3); add(c4);
		
	}
	
	public void paint(Graphics g){
		g.drawString(c1.getLabel(), 50, 60);
		g.drawString(""+c3.getState(), 50, 80);
	}
    
}

/*
	<applet code="checkbox.class" width=300 height=300>
	</applet>
*/