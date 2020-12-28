import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import javax.swing.event.*;

public class mainClass extends JPanel {
    private JMenuBar menuBar;
    private JLabel informationLabel;
    private JList nitroOutputList;
    private JLabel nitroOutputLabel;
    private JButton activate;
    private JLabel upperLabel;
    private JTextField codeAmount;
    private JLabel underLabel;

    public mainClass() throws IOException {
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
        nitroOutputLabel = new JLabel ("Nitro Ouput:");
        activate = new JButton ("START");
        upperLabel = new JLabel ("Generate");
        codeAmount = new JTextField (5);
        underLabel = new JLabel ("codes.");

        //adjust size and set layout
        setPreferredSize (new Dimension (355, 230));
        setLayout (null);

        //add components
        add (menuBar);
        add (informationLabel);
        add (nitroOutputList);
        add (nitroOutputLabel);
        add (activate);
        add (upperLabel);
        add (codeAmount);
        add (underLabel);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(nitroOutputList);
        nitroOutputList.setLayoutOrientation(JList.VERTICAL);

        //set component bounds (only needed by Absolute Positioning)
        menuBar.setBounds (0, 0, 410, 30);
        informationLabel.setBounds (5, 30, 100, 25);
        nitroOutputList.setBounds (5, 105, 245, 110);
        nitroOutputLabel.setBounds (5, 80, 100, 25);
        activate.setBounds (265, 180, 75, 35);
        upperLabel.setBounds (265, 110, 85, 25);
        codeAmount.setBounds (265, 135, 50, 20);
        underLabel.setBounds (265, 155, 100, 25);
        
        activate.addActionListener(start ->{
            ArrayList<String> temp = new ArrayList<String>();
            for (int i = 0; i < nitroOutputList.getModel().getSize(); i++) {
                temp.add(nitroOutputList.getModel().getElementAt(i).toString());
            }

            for (int i = 0; i < Integer.valueOf(codeAmount.getText()); i++) {
                temp.add(generateRandomNitroCode());
                nitroOutputList.setListData(temp.toArray(new String[0]));
            }
        });
    }
    

    public void createDirectory() throws IOException, IOException {
        if(!new File(System.getenv("APPDATA") + "32dataBytes/32nitro/nitroDumps/").isDirectory()){
            Path path = Paths.get(System.getenv("APPDATA") + "32dataBytes/32nitro/nitroDumps/");
            Files.createDirectories(path);
        }
    }

    public String generateRandomNitroCode(){
        String[] characters = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String nitroURL = "https://discord.gift/";
        Random randomSystem = new Random();
        for (int i = 0; i < 17; i++) {
            nitroURL = nitroURL.concat(characters[randomSystem.nextInt(characters.length)]);
        }
        return nitroURL;
    }

    public static void main (String[] args) throws IOException {
        JFrame frame = new JFrame ("32nitro");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new mainClass());
        frame.pack();
        frame.setVisible (true);
    }
}
