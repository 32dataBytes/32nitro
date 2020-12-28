import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class creditsMenu extends JPanel {
    private JLabel nameLabel;
    private JLabel discordLabel;
    private JButton githubButton;

    public creditsMenu() {
        //construct components
        nameLabel = new JLabel ("32dataBytes");
        discordLabel = new JLabel ("32dataBytes#8475");
        githubButton = new JButton ("Github");

        //adjust size and set layout
        setPreferredSize (new Dimension (158, 87));
        setLayout (null);

        //add components
        add (nameLabel);
        add (discordLabel);
        add (githubButton);

        //set component bounds (only needed by Absolute Positioning)
        nameLabel.setBounds (5, 5, 100, 25);
        discordLabel.setBounds (5, 30, 110, 25);
        githubButton.setBounds (5, 55, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("Credits");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new creditsMenu());
        frame.pack();
        frame.setVisible (true);
    }
}
