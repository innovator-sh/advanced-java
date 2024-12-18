import javax.swing.*;
import java.awt.*;

public class Jtable extends JApplet {
    public void init() {

        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        Object colHead[] = {"ID", "Name", "Age"};

        Object data[][] = {
            { "1", "Elon", "53" },
            { "2", "Jeff", "60" },
            { "3", "Mark", "40" },
            { "4", "Bernard", "75" }
        };

        /* Constructors:
         * JTable(Object data[][], Object colHead[])
         * JTable(int numRows, int numColm)
         * JTable(Vector rowData, Vector colData)
        */

        JTable jt = new JTable(data, colHead);

        int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

        JScrollPane sp = new JScrollPane(jt, vsb, hsb);

        co.add(sp);

    }
}

/* 
 * <applet code="Jtable.class" width=300 height=300>
 * </applet>
*/