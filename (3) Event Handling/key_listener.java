import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class key_listener extends Applet implements KeyListener {

    String msg = "";

    public void init() {
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("Key Pressed");
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("Key Released");
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 10, 20);
    }
    
}

/* 
 * <applet code = "key_listener.java" width=300 height=300>
 * </applet>
*/