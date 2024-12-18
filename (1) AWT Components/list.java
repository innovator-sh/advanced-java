import java.awt.*;
import java.applet.*;

public class list extends Applet {
	
	List l1, l2, l3;
	
	public void init() {
		
		l1 = new List();
		l2 = new List(3); // 3 is the number of rows visible
		l3 = new List(4, true); // 4 is the number of rows visible; true is whether multiple selection is allowed or not
		
		l1.add("Male");
		l1.add("Female");
		l1.add("Other");
		
		l2.add("Australia");
		l2.add("Asia", 0); // Inserting item at index 0
		l2.add("Africa", 1);
		l2.add("Antarctica");
		l2.add("Europe");
		l2.add("North America");
		l2.add("South America");
		
		l3.add("Pizza");
		l3.add("Biryani", 2);
		l3.add("Sushi");
		l3.add("Ramen");
		l3.add("Tacos");
		l3.add("Burger");
		
		l2.select(0); // by default, selecting "Asia" i.e. index 0
		
		add(l1);
		add(l2);
		add(l3);
		
	}
	
	public void paint(Graphics g){
		g.drawString("[l1] Items count "+l1.getItemCount(), 50, 170);
		g.drawString("[l2] Selected item name is "+l2.getSelectedItem(), 50, 195);
		g.drawString("[l2] Selected item index is "+l2.getSelectedIndex(), 50, 210);
		g.drawString("[l3] 4th Item is "+l3.getItem(3), 50, 235);
	}
	
}

/*
	<applet code="list.class" width=300 height=300>
	</applet>
*/