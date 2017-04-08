import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame
{
	
	public static void main(String[] args)
	{
		new Login();
	}

     JTextField username = new JTextField(15);
     JPasswordField password = new JPasswordField(15); 
     JButton btnLogin = new JButton("Login");

    public Login()
    {
        super("Login");
        setLayout(new BorderLayout());
		
		

        //Setting Look and Feel

       try{
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch(Exception exception)
        {
			JOptionPane.showMessageDialog(null,exception.toString());
        }
       
       
        //To Check the Appropirate Size
      /* getContentPane().addComponentListener(new ComponentAdapter(){
        
            public void componentResized(ComponentEvent e)
            {
                Component c = (Component)e.getSource();
                
                 setTitle("W : "+c.getWidth()+"H : "+c.getHeight());
            }
        });*/

        JLabel label = new JLabel("<html><br>&nbsp&nbsp  Railway Management<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp System<br>&nbsp<br></html>",SwingConstants.CENTER);
        label.setFont(new Font("Calibri", Font.BOLD,30));



        getContentPane().add(label,BorderLayout.PAGE_START);



        JPanel uname = new JPanel(new FlowLayout(FlowLayout.CENTER,20,50));
        uname.add(new JLabel("Username : "));
        uname.add(username);

        JPanel passwordpanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        passwordpanel.add(new JLabel("Password : "));
        passwordpanel.add(password);

        JPanel last = new JPanel(new FlowLayout());
        last.add(uname);
        last.add(passwordpanel);
       // last.add(new JButton("Login"));

       JPanel last2 = new JPanel(new FlowLayout());

     //  btnLogin.setPreferredSize(new Dimension(30,30));
       btnLogin.addActionListener(new ActionListener()
       {
           //@Override
           public void actionPerformed(ActionEvent e)
           {
              if(username.getText().equals("") || password.getPassword().equals(""))
               {
                    JOptionPane.showMessageDialog(null, "Usename or Password field is empty !!", "Login Failed", JOptionPane.ERROR_MESSAGE);
               }
               
               else
               {
                   JOptionPane.showMessageDialog(null, "<html>Backend Database Under Construction.<br>&nbsp&nbsp&nbsp Please wait....</html>","Under Construction",JOptionPane.INFORMATION_MESSAGE);
               }
           }
       });
       last2.add(last);
       last2.add(btnLogin);


        add(last2);

        setSize(631,363);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}