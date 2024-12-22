import java.applet.*;
import java.awt.event.*;

public class mouse_adapter extends Applet {
    public void init() {
        addMouseListener(new adapterClass(this));
    }
}

class adapterClass extends MouseAdapter {

    mouse_adapter obj;

    public adapterClass(mouse_adapter obj) {
        this.obj = obj;
    }

    public void mouseClicked(MouseEvent me) {
        obj.showStatus("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent me) {
        obj.showStatus("Mouse Entered");
    }

    public void mouseExited(MouseEvent me) {
        obj.showStatus("Mouse Exited");
    }

}

/*
 * <applet code="mouse_adapter.class" width=300 height=300>
 * </applet>
 */