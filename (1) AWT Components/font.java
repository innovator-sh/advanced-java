import java.awt.*;
import java.applet.*;

public class font extends Applet {

    public void paint(Graphics g) {
        Font f1 = new Font("TimesRoman", Font.BOLD, 20);
        g.setFont(f1);
        g.drawString("Never gonna give you up", 20, 30);

        Font f2 = new Font("Arial", Font.ITALIC, 20);
        g.setFont(f2);
        g.drawString("Skibidi toilet", 20, 60);

        Font f3 = new Font("Courier", Font.PLAIN, 20);
        g.setFont(f3);
        g.drawString("i don't even know what to type here", 20, 90);

    }
}

/* 
 <applet code="font.class" width=300 height=300>
 </applet>
*/