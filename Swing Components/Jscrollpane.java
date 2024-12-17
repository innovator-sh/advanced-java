import javax.swing.*;
import java.awt.*;

public class Jscrollpane extends JApplet {
    public void init() {

        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(5, 2));

        for(int i=0; i<=9; i++) {
            JButton b = new JButton("Button "+i);
            jp.add(b);
        }

        int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

        JScrollPane sp = new JScrollPane(jp, vsb, hsb);

        /* Constructors:
         * JScrollPane()
         * JScrollPane(Component comp)
         * JScrollPane(int vsb, int hsb)
         * JScrollPane(Component comp, int vsb, int hsb)
        */

        co.add(sp);

    }
}

/* 
 * <applet code="Jscrollpane.class" width=300 height=300>
 * </applet>
*/