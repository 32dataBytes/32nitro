import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*;

public class mainClass extends JPanel {
    private JMenuBar menuBar;
    private JLabel informationLabel;
    private JList nitroOutputList;
    private JLabel NitroOutputLabel;
    private JToggleButton startstop;

    public mainClass() throws IOException {
        FlatLightLaf.install();
        createDirectory();

        //construct preComponents
        JMenu fileMenu = new JMenu ("File");
        JMenuItem save_file_as___Item = new JMenuItem ("Save File As...");
        fileMenu.add (save_file_as___Item);
        JMenuItem save_fileItem = new JMenuItem ("Save File");
        fileMenu.add (save_fileItem);
        JMenu infoMenu = new JMenu ("Info");
        JMenuItem discordItem = new JMenuItem ("Discord");
        infoMenu.add (discordItem);
        JMenuItem creditsItem = new JMenuItem ("Credits");
        infoMenu.add (creditsItem);
        JMenuItem aboutItem = new JMenuItem ("About");
        infoMenu.add (aboutItem);
        String[] nitroOutputListItems = {};

        //construct components
        menuBar = new JMenuBar();
        menuBar.add (fileMenu);
        menuBar.add (infoMenu);
        informationLabel = new JLabel ("32nitro");
        nitroOutputList = new JList (nitroOutputListItems);
        NitroOutputLabel = new JLabel ("Nitro Ouput:");
        startstop = new JToggleButton ("OFF", false);

        //adjust size and set layout
        setPreferredSize (new Dimension (335, 358));
        setLayout (null);

        //add components
        add (menuBar);
        add (informationLabel);
        add (nitroOutputList);
        add (NitroOutputLabel);
        add (startstop);

        //set component bounds (only needed by Absolute Positioning)
        menuBar.setBounds (0, 0, 335, 30);
        informationLabel.setBounds (5, 30, 100, 25);
        nitroOutputList.setBounds (5, 105, 250, 250);
        NitroOutputLabel.setBounds (5, 80, 100, 25);
        startstop.setBounds (255, 105, 75, 250);
    }

    public void createDirectory() throws IOException {
        if(!new File(System.getenv("APPDATA") + "32dataBytes/32nitro/nitroDumps/").isDirectory()){
            Path path = Paths.get(System.getenv("APPDATA") + "32dataBytes/32nitro/nitroDumps/");
            Files.createDirectories(path);
        }
    }

    public static void main (String[] args) throws IOException {
        JFrame frame = new JFrame ("32nitro");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new mainClass());
        frame.pack();
        frame.setVisible (true);
    }
}
