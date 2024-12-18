import java.awt.*;
import java.applet.*;

public class choice extends Applet {

	Choice c;
	
	public void init() {
		
		c = new Choice();
		
		c.add("USA");
		c.add("China");
		c.add("Germany");
		c.add("Japan");
		c.add("India");
		c.add("United Kingdom");
		
		c.select(4);
		
		add(c);
		
	}
	
	public void paint(Graphics g){
		g.drawString("Selected item name is "+c.getSelectedItem(), 50, 60);
		g.drawString("Selected item index is "+c.getSelectedIndex(), 50, 75);
		g.drawString("Total item count is "+c.getItemCount(), 50, 100);
		g.drawString("3rd Item is "+c.getItem(2), 50, 125);
	}
	
}

/*
	<applet code="choice.class" width=300 height=300>
	</applet>
*/