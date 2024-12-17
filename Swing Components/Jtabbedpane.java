import javax.swing.*;
import java.awt.*;

/* 
 * <applet code="Jtabbedpane.class" width=300 height=300>
 * </applet>
*/

public class Jtabbedpane extends JApplet {
    public void init() {
        Container co = getContentPane();
        
        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Login", new auth());
        tp.addTab("Language", new lang());
        tp.addTab("Location", new location());
        
        co.add(tp);
    }
}

class auth extends JPanel {
    public auth() {
        setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Enter username: ");
        JTextField t1 = new JTextField(15);
        JLabel l2 = new JLabel("Enter password: ");
        JPasswordField pf = new JPasswordField(15);
        pf.setEchoChar('*');

        add(l1); add(t1); add(l2); add(pf);
    }
}

class lang extends JPanel {
    public lang() {
        JLabel l1 = new JLabel("Select Language: ");
        JRadioButton rb1 = new JRadioButton("English");
        JRadioButton rb2 = new JRadioButton("Hindi");
        JRadioButton rb3 = new JRadioButton("French");
        JRadioButton rb4 = new JRadioButton("Spanish");
        JRadioButton rb5 = new JRadioButton("Japanese");
        add(l1); add(rb1); add(rb2); add(rb3); add(rb4); add(rb5);
    }
}

class location extends JPanel {
    public location() {
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Enter address: ");
        JTextArea t1 = new JTextArea(10,30);

        add(l1); add(t1);
    }
}
