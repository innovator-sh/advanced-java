import javax.swing.*;
import java.awt.*;

public class imageicon extends JApplet {
    public void init() {
        Container co = getContentPane();

        ImageIcon i = new ImageIcon("wave.png"); // Save the png file in the same directory as the class file created by this program.
        
        /* Constructor:
         * ImageIcon(String name)
         * ImageIcon(URL url)
        */

        JLabel l = new JLabel("Wave", i, JLabel.CENTER);

        co.add(l);
    }
}

/*
 * <applet code="imageicon.class" width=300 height=300>
 * </applet>
*/