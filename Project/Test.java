import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame
{

    public Test()
    {
        setLayout(null);
        JPanel panel1 = new JPanel(null);
        panel1.setBounds(0, 0, 335, 450);
        panel1.setBackground(new Color(247, 148, 30));

        add(panel1);

        JPanel panel2 = new JPanel(null);
        panel2.setBounds(335,0,350,450);
        panel2.setBackground(new Color(100, 100, 100));

        JLabel username = new JLabel("Username");
        Font font = new Font("sansserif", Font.BOLD, 17);
        username.setFont(font);
        username.setForeground(new Color(255, 255, 255));
        username.setBounds(25, 195, 90, 15);

        JSeparator sp = new JSeparator();
        sp.setBounds(125, 205, 180, 1);
    
        sp.setForeground(Color.WHITE);
        sp.setBackground(Color.WHITE);
        sp.setOrientation(JSeparator.HORIZONTAL);
        panel2.add(sp);
        panel2.add(username);
        add(panel2);

        setSize(701, 489);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public static void main(String[] args)
    {
        new Test();
    }
}