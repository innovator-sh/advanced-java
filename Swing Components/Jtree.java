import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;

public class Jtree extends JApplet {
    public void init() {
        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("Shape");
        DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("Font");
        top.add(a1); top.add(a2); top.add(a3);

        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode b4 = new DefaultMutableTreeNode("Yellow");
        a1.add(b1); a1.add(b2); a1.add(b3); a1.add(b4);

        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("Circle");
        DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("Square");
        a2.add(c1); a2.add(c2);

        JTree t = new JTree(top);

        int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;

        JScrollPane sp = new JScrollPane(t, vsb, hsb);
        
        co.add(sp);
    }
}

/* 
 * <applet code="Jtree.class" width=300 height=300>
 * </applet>
*/