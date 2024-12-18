import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class card_layout extends Applet implements ActionListener {
    Checkbox ch1, ch2, ch3, ch4;
    Panel pn;
    CardLayout cl;
    Button b1, b2;

    public void init() {
        b1 = new Button("Colors");
        b2 = new Button("Flavors");

        add(b1);
        add(b2);

        cl = new CardLayout();
        pn = new Panel();
        pn.setLayout(cl);

        ch1 = new Checkbox("Blue");
        ch2 = new Checkbox("Red");
        ch3 = new Checkbox("Vanilla");
        ch4 = new Checkbox("Strawberry");

        Panel pn2 = new Panel();
        pn2.add(ch1);
        pn2.add(ch2);

        Panel pn3 = new Panel();
        pn3.add(ch3);
        pn3.add(ch4);

        pn.add(pn2, "Colors");
        pn.add(pn3, "Flavors");

        add(pn);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1) {
            cl.show(pn, "Colors");
        } else {
            cl.show(pn, "Flavors");
        }
    }

}

/* 
 <applet code="card_layout.class" width=300 height=300>
 </applet>
*/