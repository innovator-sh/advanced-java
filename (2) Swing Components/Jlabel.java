import java.awt.*;
import javax.swing.*;

public class Jlabel extends JApplet {
    public void init() {

        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("hi chat, innovator.sh this side!");

        /* Constructor:
         * JLabel(String str)
         * JLabel(Icon i)
         * JLabel(String str, Icon i, int align)
        */

        co.add(l1);

    }
}

/*
 * <applet code="Jlabel.class" width=300 height=300>
 * </applet>
 */