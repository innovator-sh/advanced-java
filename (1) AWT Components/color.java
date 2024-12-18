import java.awt.*;
import java.applet.*;

public class color extends Applet {
    public void paint(Graphics g) {
        Color c1 = new Color(233, 122, 122);

        g.setColor(c1);
        g.drawOval(10, 10, 50, 50);

    }
}

/*
 * <applet code="color.java" width=300 height=300> </applet>
*/