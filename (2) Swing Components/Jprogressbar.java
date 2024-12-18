import javax.swing.*;
import java.awt.*;

public class Jprogressbar extends JFrame {
    Jprogressbar() {
        Container co = getContentPane();
        co.setLayout(new FlowLayout());

        setVisible(true);
        setSize(400, 400);
        setTitle("JProgressBar Testing");

        JProgressBar pb1 = new JProgressBar();
        JProgressBar pb2 = new JProgressBar(0, 100);
        JProgressBar pb3 = new JProgressBar(SwingConstants.VERTICAL, 0, 100);
        pb1.setStringPainted(true);
        pb2.setStringPainted(true);
        pb2.setString("hello");

        /* Constructors:
         * JProgressBar()
         * JProgressBar(int orientation)
         * JProgressBar(int min, int max)
         * JProgressBar(int orientation, int min, int max)
        */

        co.add(pb1); co.add(pb2); co.add(pb3);

        int i=0; 
        while(i<=100) {
            pb1.setValue(i);
            pb2.setValue(i);
            pb3.setValue(i);
            
            i+=20;

            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
        

    }

    public static void main(String args[]) {
        Jprogressbar t = new Jprogressbar();
    }

}