import java.awt.*;
import java.awt.event.*;

public class gridbag_layout extends Frame {
    gridbag_layout() {
        
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        Label l1 = new Label("Name: ");
        TextField t1 = new TextField(15);
        Label l2 = new Label("Comments: ");
        TextArea ta = new TextArea(3, 20);
        
        Button b1 = new Button("Submit");

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(l1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(t1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(l2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(ta, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(b1, gbc);

    }

    public static void main(String args[]) {
        gridbag_layout t = new gridbag_layout();
        t.setSize(300, 300);
        t.setVisible(true);
        t.setTitle("GridBagLayout Testing");
    }
}
