import javax.swing.*;
import java.awt.*;

public class Jframe extends JFrame {
    Jframe() {

        Container co = getContentPane();
        co.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel l1 = new JLabel("Enter your name: ");
        JTextField b1 = new JTextField("innovator.sh", 20);

        co.add(l1);
        co.add(b1);

    }

    public static void main(String args[]) {
        Jframe j = new Jframe();
        j.setSize(200, 300);
        j.setVisible(true);
        j.setTitle("Testing JFrame");
    }

}