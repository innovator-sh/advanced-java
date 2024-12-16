import java.awt.*;
import java.applet.*;

public class grid_layout extends Applet {
    public void init() {
        setLayout(new GridLayout(3,3));

        for(int i=0; i<=9; i++) {
            Button b = new Button(""+i);
            add(b);
        }
    }
}

/* 
 <applet code="grid_layout.class" width=300 height=300>
 </applet>
*/