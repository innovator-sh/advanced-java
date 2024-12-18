import java.awt.*;
import java.awt.event.*;

public class menu extends Frame {

    MenuItem mi1, mi2, mi3, mi4, mi5, mi6, mi7, mi8, mi9;
    CheckboxMenuItem cbm;
    MenuShortcut ms1, ms2, ms3;

    menu() {
        setLayout(new FlowLayout());

        MenuBar mb = new MenuBar(); // (1) Creating MenuBar Object

        Menu m1 = new Menu("File"); // (2) Creating Menu object
        Menu m2 = new Menu("Open");
        mi1 = new MenuItem("New");
        mi2 = new MenuItem("innovator.sh");
        mi3 = new MenuItem("Save");
        mi4 = new MenuItem();
        cbm = new CheckboxMenuItem("Auto Save");

        mi4.setLabel("Save As");

        cbm.setState(true);

        m1.add(mi1); m1.add(m2); m1.addSeparator(); m1.add(mi3); m1.add(mi4); m1.add(cbm);  m2.add(mi2); // (3) Adding MenuItem object to Menu

        ms1 = new MenuShortcut(KeyEvent.VK_X);
        ms2 = new MenuShortcut(KeyEvent.VK_C);
        ms3 = new MenuShortcut(KeyEvent.VK_V);

        Menu m3 = new Menu("Edit");
        mi5 = new MenuItem("Undo");
        mi6 = new MenuItem("Redo");
        mi7 = new MenuItem("Cut", ms1);
        mi8 = new MenuItem("Copy", ms2);
        mi9 = new MenuItem("Paste", ms3);

        mi5.setEnabled(false);

        m3.add(mi5); m3.add(mi6); m3.addSeparator(); m3.add(mi7); m3.add(mi8); m3.add(mi9);

        mb.add(m1); mb.add(m3); // (4) Adding Menu to MenuBar 

        setMenuBar(mb); // (5) Setting MenuBar as mb

    }

    public void paint(Graphics g) {
        g.drawString("[mi1] label - "+mi1.getLabel(), 20, 90);
        g.drawString("[cbm] CheckboxMenuItem state - "+cbm.getState(), 20, 115);
        g.drawString("[mi5] enabledFlag - "+mi5.isEnabled(), 20, 140);
    }

    public static void main(String args[]) {
        menu t = new menu();
        t.setVisible(true);
        t.setSize(300, 300);
        t.setTitle("AWT Menu");
    }

}