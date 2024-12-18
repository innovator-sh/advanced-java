import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class adjustment_listener extends Applet implements AdjustmentListener, MouseMotionListener {
    String msg = "";
    Scrollbar sb1, sb2;

    public void init() {
        int width = Integer.parseInt(getParameter("width"));
        int height = Integer.parseInt(getParameter("height"));

        sb1 = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, height);
        sb2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, width);
        add(sb1);
        add(sb2);

        sb1.addAdjustmentListener(this);
        sb2.addAdjustmentListener(this);
        addMouseMotionListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent ae) {
        repaint();
    }

    // Update Scroll bars to reflect mouse dragging.
    public void mouseDragged(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        sb1.setValue(y);
        sb2.setValue(x);
        repaint();
    }

    public void mouseMoved(MouseEvent me) {}

    // Display current value of Scroll bars
    public void paint(Graphics g) {
        msg = "Vertical: " + sb1.getValue();
        msg += ", Horizontal: " + sb2.getValue();

        g.drawString(msg, 6, 160);

        // To show current mouse drag position
        g.drawString("*", sb2.getValue(), sb1.getValue());
    }
}

/*
 * <applet code="adjustment_listener.class" width=300 height=200>
 * </applet>
 */