import java.awt.*;
import java.applet.*;

public class radiobutton extends Applet {

	CheckboxGroup cbg;
	
	public void init() {
		
		cbg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("Male", true, cbg); // passing the CheckboxGroup object as parameter for creating Radiobutton
		Checkbox c2 = new Checkbox("Female", false, cbg);
		Checkbox c3 = new Checkbox("Other", false, cbg);
		
		add(c1); add(c2); add(c3);
		
	}
	
	public void paint(Graphics g){
		g.drawString(""+cbg.getSelectedCheckbox(), 50, 60);
	}

}

/*
	<applet code="radiobutton.class" width=300 height=300>
	</applet>
*/