import java.awt.*;

public class frame extends Frame {
    frame() {
        
        setLayout(new FlowLayout());

        Button b1 = new Button("Yes");
        Button b2 = new Button("No");

        add(b1);
        add(b2);

    }

    public static void main(String args[]) {
        frame t = new frame();

        t.setVisible(true);
        t.setSize(200, 300);
        t.setTitle("Testing Frame");
    }
}