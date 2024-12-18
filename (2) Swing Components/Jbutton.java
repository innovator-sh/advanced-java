import javax.swing.*;
import java.awt.*;

public class Jbutton extends JApplet {
    public void init(){
        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        JButton b1 = new JButton("Test!");

        ImageIcon i = new ImageIcon("assets/yap.png");
        JButton b2 = new JButton("Yapping", i);

        ImageIcon i2 = new ImageIcon("assets/click.png");
        JButton b3 = new JButton(i2);

        /* Constructors:
         * JButton(String str)
         * JButton(Icon i)
         * JButton(String str, Icon i)
        */

        co.add(b1);
        co.add(b2);
        co.add(b3);

    }
}

/* 
 * <applet code="Jbutton.class" width=300 height=300>
 * </applet>
*/
