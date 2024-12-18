import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* 
 * Performing Addition of two numbers
*/

public class action_listener extends Applet implements ActionListener {

    TextField t1, t2, t3;
    Button b1;

    public void init() {

        setLayout(new GridLayout(4, 2));

        Label l1 = new Label("Enter number1: ");
        t1 = new TextField(5);
        Label l2 = new Label("Enter number2: ");
        t2 = new TextField(5);
        Label l3 = new Label("Sum: ");
        t3 = new TextField(7);

        b1 = new Button("Add");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);

        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int s = n1 + n2;

            t3.setText(Integer.toString(s));

        }
    }

}

/*
 * <applet code="action_listener.class" width=300 height=300>
 * </applet>
 */