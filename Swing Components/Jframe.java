import javax.swing.*;
import java.awt.*;

public class Jframe extends JFrame {
    Jframe() {

        Container co = getContentPane();
        co.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel l1 = new JLabel("Enter your name: ");
        JTextField t1 = new JTextField("innovator.sh", 10);
        JLabel l2 = new JLabel("Enter password: ");
        JPasswordField p1 = new JPasswordField(10);
        p1.setEchoChar('*');
        Button b1 = new Button("Submit");

        co.add(l1); co.add(t1);
        co.add(l2); co.add(p1);
        co.add(b1);

    }

    public static void main(String args[]) {
        Jframe j = new Jframe();
        j.setSize(200, 300);
        j.setVisible(true);
        j.setTitle("Testing JFrame");
    }

}