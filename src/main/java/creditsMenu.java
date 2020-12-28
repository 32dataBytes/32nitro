import com.formdev.flatlaf.FlatLightLaf;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import javax.swing.*;
import javax.swing.event.*;

public class creditsMenu extends JPanel {
    private JLabel nameLabel;
    private JLabel discordLabel;
    private JButton githubButton;

    public creditsMenu() {
        FlatLightLaf.install();
        //construct components
        nameLabel = new JLabel ("32dataBytes");
        discordLabel = new JLabel ("32dataBytes#8475");
        githubButton = new JButton ("Github");

        //adjust size and set layout
        setPreferredSize (new Dimension (150, 85));
        setLayout (null);

        //add components
        add (nameLabel);
        add (discordLabel);
        add (githubButton);

        //set component bounds (only needed by Absolute Positioning)
        nameLabel.setBounds (5, 5, 100, 25);
        discordLabel.setBounds (5, 30, 110, 25);
        githubButton.setBounds (5, 55, 100, 25);

        githubButton.addActionListener(openGithub ->{
            try {
                Desktop.getDesktop().browse(URI.create("https://github.com/32dataBytes"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }


    public static void main () {
        JFrame frame = new JFrame ("Credits");
        frame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add (new creditsMenu());
        frame.pack();
        frame.setVisible (true);
    }
}
