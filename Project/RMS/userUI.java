import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.BorderFactory;

import com.sun.java.swing.plaf.motif.MotifBorders.BevelBorder;





public class userUI extends JFrame  implements ActionListener
{
    private JPanel menuPanel = new JPanel(null);
    private JPanel displayPanel = new JPanel(null);
    private JPanel profilePanel = new JPanel(null);
    private JLabel menu      = new JLabel("Menu");
    private JButton btnProfile  = new JButton("Profile");
    private JButton btnCoach    = new JButton("Coach");
    private JButton btnTicket    = new JButton("Ticket");
    private JButton btnLogout    = new JButton("Logout");

    //For profile panel;
    private JLabel nameLabel = new JLabel("Name : ");
    private JLabel mnoLabel = new JLabel("Mobile no : ");
    private JLabel userNameLabel = new JLabel("Username : ");
    private JLabel passwordLabel = new JLabel("Password :");
    
    private JTextField nameField = new JTextField("Niaz");
    private JTextField mNoField = new JTextField();
    private JTextField usernameField = new JTextField();
    private JTextField passwordField = new JTextField();
    private JTextField pelements[] = {nameField,mNoField,usernameField,passwordField};
    private JLabel  pLelements [] = {nameLabel,mnoLabel,userNameLabel,passwordLabel};
    Font pLabelFont = new Font("sansserif",Font.BOLD,15);

   
     public userUI()
    {

         try
      {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
      }
      catch(Exception exception)
      {
        System.out.println("NF");
      }
    }

    public void build()
    {
        setLayout(null);
        //Setting locations of Menu Panel

        menuPanel.setBounds(15, 50, 145, 475);
       setBackground(new Color(100,100,100));
       displayPanel.setBounds(170, 0, 690, 570);
       displayPanel.setBackground(new Color(160,205,50));
        //menu.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));


        menuPanel.add(btnProfile);
        menuPanel.add(btnCoach);
        menuPanel.add(btnTicket);
        menuPanel.add(btnLogout);
        //Settings of JButton
      
      
         btnProfile.setBounds(25, 25, 90, 45);
        btnCoach.setBounds (25, 95, 90, 45);
        btnTicket.setBounds(25, 160, 90, 45);
        btnLogout.setBounds(30, 410, 90, 45);

        //Profile panel elements
        profilePanel.setBounds(165, 0, 685, 560);

        nameLabel.setBounds(90, 205 , 105, 25 );
        mnoLabel.setBounds(90, 270 , 105, 25);
        userNameLabel.setBounds(90, 330 , 105, 25);
        passwordLabel.setBounds(90, 395 , 105, 25);


        nameField.setBounds(225, 205 ,300, 25);
        mNoField.setBounds(225, 270 ,300, 25);
        usernameField.setBounds(225, 330 ,300, 25);
        passwordField.setBounds(225, 395 ,300, 25);

        //a lil shortcut

       for(int i = 0 ; i<pelements.length; i++)
       {
         pelements[i].setEditable(false);
         pLelements[i].setFont(pLabelFont);
       }

        profilePanel.add(nameLabel);
        profilePanel.add(nameField);
        profilePanel.add(mnoLabel);
        profilePanel.add(mNoField);
        profilePanel.add(userNameLabel);
        profilePanel.add(usernameField);
        profilePanel.add(passwordLabel);
        profilePanel.add(passwordField);
        




        add(profilePanel);

        add(menuPanel);
      //  add(displayPanel);
        setSize(875,605);
        SwingUtilities.updateComponentTreeUI(getRootPane());
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
    public static void main(String[] args)
    {
        userUI ui = new userUI();
        ui.build();
       // ui.setVisible(true);
    }
}