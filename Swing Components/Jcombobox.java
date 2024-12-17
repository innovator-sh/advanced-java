import javax.swing.*;
import java.awt.*;

public class Jcombobox extends JApplet {

    public void init() {

        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        Object obj[] = {"USA", "Russia", "India", "China", "Japan", "Germany", "UK", "Australia"};

        JComboBox cb1 = new JComboBox(obj);

        JComboBox cb2 = new JComboBox();
        cb2.addItem("New York");
        cb2.addItem("Moscow");
        cb2.addItem("Mumbai");
        cb2.addItem("Shangai");
        cb2.addItem("Tokyo");
        cb2.addItem("Berlin");
        cb2.addItem("London");
        cb2.addItem("Canberra");

        /* Constructor:
         * JComboBox()
         * JComboBox(Vector v)
         * JComboBox(Object obj[])
        */

        co.add(cb1);
        co.add(cb2);

    }
}

/* 
 * <applet code="Jcombobox.class" width=300 height=300>
 * </applet>
*/