import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class key_adapter extends Applet {
    public void init() {
        addKeyListener(new adapterClass(this));
    }    
}

class adapterClass extends KeyAdapter {

    String msg = "";
    key_adapter obj;

    public adapterClass(key_adapter obj) {
        this.obj = obj;
    }

    public void keyPressed(KeyEvent ke) {
        obj.showStatus("Key Pressed");
    }

    public void keyReleased(KeyEvent ke) {
        obj.showStatus("Key Released");
    }

}

/*
 * <applet code="key_adapter.class" width=300 height=300>
 * </applet>
 */