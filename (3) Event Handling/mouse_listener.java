import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class mouse_listener extends Applet implements MouseListener {
    
    Label l;

    public void init() {

        setLayout(null);

        l = new Label();
        l.setBounds(20, 30, 400, 400);
        add(l);

        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        l.setText("Mouse Clicked (#"+me.getClickCount()+") No. of times.");
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        l.setText("Mouse Pressed at position ("+me.getX()+", "+me.getY()+")");
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        l.setText("Mouse Released");
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        l.setText("Mouse Entered");
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        l.setText("Mouse Exited");
        repaint();
    }

}

/* 
 * <applet code="mouse_listener.class" width=300 height=300> </applet>
*/