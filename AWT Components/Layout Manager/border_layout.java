import java.awt.*;
import java.applet.*;

public class border_layout extends Applet {    
    public void init() {
        setLayout(new BorderLayout(10, 20));

        /* Constructors:
         * BorderLayout()
         * BorderLayout(int horz, int vert)
        */

        Button b1, b2, b3, b4, b5;

        b1 = new Button("CENTER");
        b2 = new Button("EAST");
        b3 = new Button("WEST");
        b4 = new Button("SOUTH");
        b5 = new Button("NORTH");

        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.WEST);
        add(b4, BorderLayout.SOUTH);
        add(b5, BorderLayout.NORTH);

    }
}

/*
 * <applet code=border_layout.class width=300 height=300>
 * </applet>
*/