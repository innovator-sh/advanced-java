import java.awt.*;
import java.applet.*;

public class label extends Applet {
	
	Label l2, l3;
	
	public void init(){
		
		Label l1 = new Label();
		l2 = new Label("there");
		l3 = new Label("testing", 0);
		
		l1.setText("Hello");
		l3.setAlignment(2);
		/*
		 * LABEL.CENTER - 0
		 * LABEL.RIGHT - 1
		 * LABEL.LEFT - 2
		*/
		
		add(l1);
		add(l2);
		add(l3);
		
	}
	
	public void paint(Graphics g){
		g.drawString(l2.getText(), 50, 60);
		g.drawString(""+l3.getAlignment(), 50, 80);
	}

}

/*
	<applet code="label.class" width=300 height=300>
	</applet>
*/