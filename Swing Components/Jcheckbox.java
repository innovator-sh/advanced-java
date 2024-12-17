import javax.swing.*;
import java.awt.*;

public class Jcheckbox extends JApplet {
    public void init() {

        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        ImageIcon i1 = new ImageIcon("assets/red.png");
        ImageIcon i2 = new ImageIcon("assets/yell.png");

        JLabel l1 = new JLabel("Select color: ");
        JCheckBox cb1 = new JCheckBox("Blue");
        JCheckBox cb2 = new JCheckBox("Orange", true);
        JCheckBox cb3 = new JCheckBox("Red", i1);
        JCheckBox cb4 = new JCheckBox(i2);

        /* Constructors:
         * JCheckBox(String s)
         * JCheckBox(String s, boolean state)
         * JCheckBox(Icon i)
         * JCheckBox(Icon i, boolean state)
         * JCheckBox(String s, Icon i)
         * JCheckBox(String s, Icon i, boolean state)
        */

        co.add(l1);
        co.add(cb1); co.add(cb2); co.add(cb3); co.add(cb4);

    }
}

/* 
 * <applet code="Jcheckbox.class" width=300 height=300>
 * </applet>
*/