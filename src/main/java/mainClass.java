import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class mainClass extends JPanel {
    private JMenuBar menuBar;
    private JLabel informationLabel;
    private JList nitroOutputList;
    private JLabel jcomp4;
    private JButton activate;
    private JLabel upperLabel;
    private JTextField codeAmount;
    private JLabel underLabel;

    public mainClass() {
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
        jcomp4 = new JLabel ("Nitro Ouput:");
        activate = new JButton ("START");
        upperLabel = new JLabel ("Generate");
        codeAmount = new JTextField (5);
        underLabel = new JLabel ("codes.");

        //adjust size and set layout
        setPreferredSize (new Dimension (348, 223));
        setLayout (null);

        //add components
        add (menuBar);
        add (informationLabel);
        add (nitroOutputList);
        add (jcomp4);
        add (activate);
        add (upperLabel);
        add (codeAmount);
        add (underLabel);

        //set component bounds (only needed by Absolute Positioning)
        menuBar.setBounds (0, 0, 410, 30);
        informationLabel.setBounds (5, 30, 100, 25);
        nitroOutputList.setBounds (5, 105, 245, 110);
        jcomp4.setBounds (5, 80, 100, 25);
        activate.setBounds (265, 180, 75, 35);
        upperLabel.setBounds (265, 110, 85, 25);
        codeAmount.setBounds (265, 135, 50, 20);
        underLabel.setBounds (265, 155, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("32nitro");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new mainClass());
        frame.pack();
        frame.setVisible (true);
    }
}
