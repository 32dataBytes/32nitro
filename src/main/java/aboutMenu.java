import com.formdev.flatlaf.FlatLightLaf;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class aboutMenu extends JPanel {
    private JLabel aboutLabel1;
    private JLabel aboutLabel2;
    private JLabel aboutLabel3;
    private JLabel aboutLabel4;
    private JLabel aboutLabel5;
    private JLabel aboutLabel6;

    public aboutMenu() {
        FlatLightLaf.install();
        //construct components
        aboutLabel1 = new JLabel ("32nitro is a generator for random keys for");
        aboutLabel2 = new JLabel ("a premium version of VoIP application ");
        aboutLabel3 = new JLabel ("'Discord', which uses Nitro. Not all keys are");
        aboutLabel4 = new JLabel ("guaranteed to work, and a nitrochecker is");
        aboutLabel5 = new JLabel ("not included whatsoever. Developed by");
        aboutLabel6 = new JLabel ("32dataBytes#8475.");

        //adjust size and set layout
        setPreferredSize (new Dimension (264, 160));
        setLayout (null);

        //add components
        add (aboutLabel1);
        add (aboutLabel2);
        add (aboutLabel3);
        add (aboutLabel4);
        add (aboutLabel5);
        add (aboutLabel6);

        //set component bounds (only needed by Absolute Positioning)
        aboutLabel1.setBounds (5, 5, 250, 25);
        aboutLabel2.setBounds (5, 30, 250, 25);
        aboutLabel3.setBounds (5, 55, 250, 25);
        aboutLabel4.setBounds (5, 80, 250, 25);
        aboutLabel5.setBounds (5, 105, 250, 25);
        aboutLabel6.setBounds (5, 130, 250, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("About");
        frame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add (new aboutMenu());
        frame.pack();
        frame.setVisible (true);
    }
}