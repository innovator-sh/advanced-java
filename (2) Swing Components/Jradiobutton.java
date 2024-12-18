import javax.swing.*;
import java.awt.*;

public class Jradiobutton extends JApplet {
    public void init() {

        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Select language: ");

        ImageIcon i1 = new ImageIcon("assets/rust.png");
        ImageIcon i2 = new ImageIcon("assets/py.png");

        JRadioButton rb1, rb2, rb3, rb4;

        rb1 = new JRadioButton("Java", true);
        rb2 = new JRadioButton("Rust", i1);
        rb3 = new JRadioButton("C++");
        rb4 = new JRadioButton(i2);

        /* Constructors:
         * JRadioButton(String s)
         * JRadioButton(String s, boolean state)
         * JRadioButton(Icon i)
         * JRadioButton(Icon i, boolean state)
         * JRadioButton(String s, Icon i)
         * JRadiobutton(Strign s, Icon i, boolean state)
        */

        co.add(l1);
        co.add(rb1); co.add(rb2); co.add(rb3); co.add(rb4);
        
    }
}

/* 
 * <applet code="Jradiobutton.class" width=300 height=300>
 * </applet>
*/