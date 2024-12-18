import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class anonymous_inner_class extends Applet {
    public void init() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                showStatus("Mouse Pressed");
            }
        });
    }
}

/*
 * <applet code="anonymous_inner_class.class" width=300 height=300>
 * </applet>
 */