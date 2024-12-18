import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class text_listener extends Applet implements TextListener {
    
    TextField t1, t2;

    public void init() {
        t1 = new TextField(15);
        t2 = new TextField(15);

        t2.setEditable(false);

        add(t1); add(t2);

        t1.addTextListener(this);
    }

    public void textValueChanged(TextEvent te) {
        t2.setText(t1.getText());
    }

}

/*
 * <applet code="text_listener.class"  width=300 height=300>
 * </applet>
*/