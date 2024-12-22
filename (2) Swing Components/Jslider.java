import javax.swing.*;
import java.awt.*;

public class Jslider extends JFrame {
    Jslider() {

        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        JSlider js = new JSlider(JSlider.HORIZONTAL, 0, 50, 10);

        JPanel panel = new JPanel();
        panel.add(js);

        co.add(panel);

    }
    public static void main(String[] args) {
        Jslider t = new Jslider();
        t.setSize(400, 400);
        t.setVisible(true);
        t.setTitle("JSlider Program");
    }
    
}
