import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class file_dialog extends Frame implements ActionListener {

    FileDialog fd1;
    Button openBut;
    Label l1;
    TextArea ta1;

    public file_dialog() {

        fd1 = new FileDialog(this, "Select File to Open");

        openBut = new Button("Open File");
        openBut.setBackground(Color.PINK);
        l1 = new Label("Complete path of the selected file");
        ta1 = new TextArea(40, 20);

        add(openBut, "South");
        add(ta1, "Center");
        add(l1, "North");
        openBut.addActionListener(this);

        setTitle("FileDialog Practice");
        setSize(525, 325);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fd1.setVisible(true);
        l1.setText("Directory: " + fd1.getDirectory());
        display(fd1.getDirectory() + fd1.getFile());
    }

    public void display(String fname) {

        try {

            FileInputStream fis1 = new FileInputStream(fname);
            int fileSize = fis1.available();
            byte buf1[] = new byte[fileSize];
            fis1.read(buf1);
            String str1 = new String(buf1);
            ta1.setText(str1);

            fis1.close();

        } catch (IOException e) {
            System.exit(0);
        }
    }

    public static void main(String arg[]) {
        new file_dialog();
    }

}