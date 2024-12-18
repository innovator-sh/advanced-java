import java.awt.*;
import java.applet.*;

public class flow_layout extends Applet {
    public void init() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        /* Constructors:
         * FlowLayout()
         * FlowLayout(int alignment) 
         * FlowLayout(int alignment, int horz, int vert)
        */

        Button b1 = new Button("Login");
        Label l1 = new Label("Enter username: ");
        Label l2 = new Label("Enter password: ");
        TextField t1 = new TextField(20);
        TextField t2 = new TextField(15);
        t2.setEchoChar('*');
        
        add(l1); add(t1);
        add(l2); add(t2);
        add(b1);

    }
}

/* 
    <applet code="flow_layout.class" width=300 height=300>
    </applet>
*/