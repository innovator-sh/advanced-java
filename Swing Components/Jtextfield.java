import javax.swing.*;
import java.awt.*;

public class Jtextfield extends JApplet {
    public void init() {

        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Enter username: ");
        JTextField t1 = new JTextField(15);

        /* Constructor:
         * JTextField()
         * JTextField(String str)
         * JTextField(int numCol)
         * JTextField(String str, int numCol)
        */

        co.add(l1); co.add(t1);


    }
}

/* 
 * <applet code="Jtextfield.class" width=300 height=300>
 * </applet>
*/