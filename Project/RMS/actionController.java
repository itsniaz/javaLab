import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JOptionPane;

class actionController implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ev)
    {
       if(ev.getActionCommand().equals("Login"))
       {
           char [] pass = loginUI.password.getPassword();
          // System.out.println("Successfully done");
           //System.out.println(pass);
       }
       else
       {
          
       }
    }
}    