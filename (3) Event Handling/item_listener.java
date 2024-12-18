import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class item_listener extends Applet implements ItemListener {

    List l;
    TextField t1;

    public void init() {

        setLayout(new FlowLayout());

        Label l1 = new Label("Select choice: ");
        l = new List(5);
        l.add("Blue");
        l.add("Red");
        l.add("Yellow");
        l.add("Pink");
        l.add("Orange");
        l.add("Brown");
        l.add("Green");
        l.add("White");
        l.add("Black");
        l.add("Mint");

        t1 = new TextField(20);

        add(l1); add(l); add(t1);

        l.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        t1.setText("You've selected: "+ l.getSelectedItem());
    }

}

/* 
 * <applet code="item_listener.class" width=300 height=300>
 * </applet>
*/