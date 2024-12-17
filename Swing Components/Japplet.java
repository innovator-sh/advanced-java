import javax.swing.*;
import java.awt.*;

public class japplet extends JApplet {
    public void init() {

        Container co = getContentPane();
        co.setLayout(new FlowLayout();

        JLabel l1 = new JLabel("Enter your name: ");
        JTextField b1 = new JTextField("innovator.sh", 10);

        co.add(l1);
        co.add(b1);

    }
}

/* 
 * <applet code="japplet.class" width=300 height=300>
 * </applet>
*/