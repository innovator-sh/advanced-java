import java.applet.*;
import java.awt.event.*;

public class inner_class extends Applet {
    public void init() {
        addMouseListener(new mouseAdapter());
    }

    class mouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent me) {
            showStatus("Mouse Pressed");
        }
    }
}

/*
 * <applet code="inner_class.class" width=300 height=300>
 * </applet>
 */