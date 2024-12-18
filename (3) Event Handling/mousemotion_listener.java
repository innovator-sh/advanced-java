import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class mousemotion_listener extends Applet implements MouseMotionListener {

    String msg="";

    public void init() {
        addMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent me) {
        msg = "Mouse Moved";
        showStatus("Mouse Moving at position ("+me.getX()+", "+me.getY()+")");

        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        msg = "Mouse Dragged";
        showStatus("Mouse Dragging at position ("+me.getX()+", "+me.getY()+")");

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 30);
    }

}

/* 
 * <applet code="mousemotion_listener.class" width=300 height=300>
 * </applet>
*/