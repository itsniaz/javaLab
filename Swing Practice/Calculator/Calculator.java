


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class Calculator extends JFrame
{
    public JButton btn[] = new JButton[18];
    public JTextField field;
	Font fieldFont = new Font("SansSerif", Font.BOLD, 20);
	Font btnFont =  new Font("Comic Sans MS",Font.PLAIN, 12);
    public Calculator()
    {

        super("Calculator");
		
		try 
    { 
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
    } 
    catch(Exception e){ 
    }
        JOptionPane.showMessageDialog(null, "Ai Calulator ti behbohar kore \n Porikkhay Golla paile Niaz Ahmed Dayi noy", "Sotorko Barta", JOptionPane.ERROR_MESSAGE);
    

	 //Layout of JFrame
        
        setLayout(new BorderLayout());

      
        //Initializations of JButton
        for(int i = 0 ; i<btn.length;i++)
        {
            btn[i] = new JButton();
            btn[i].setSize(new Dimension(15,2));
			btn[i].setFont(btnFont);
        }

        //Creating Panel for NumberPad

        GridLayout p1Layout = new GridLayout(5,3,2,2);
        JPanel panel1 = new JPanel();
        panel1.setLayout(p1Layout);
        
        //Arranging the NumberPad
        for(int i = 1; i<=9; i++)
        {   
            btn[i].setText(""+i);
            panel1.add(btn[i]);
        }

        btn[0].setText("0");
        panel1.add(btn[0]);
        
        btn[10].setText(".");
        panel1.add(btn[10]);
       

        btn[11].setText("=");
        panel1.add(btn[11]);
      /* for(int i = 1 ; i<=3 ; i++)
        {
            panel1.add(new JLabel());
        }*/
        


        btn[12].setText("Clear");
        btn[13].setText("+");
        btn[14].setText("-");
        btn[15].setText("*");
        btn[16].setText("/");
        btn[17].setText("<---");

       

        JPanel panel2 = new JPanel(new GridLayout(1,2,2,2));
        panel2.add(btn[12]);
        panel2.add(panel1);

        JPanel panel3 = new JPanel(new GridLayout(1,5));
        panel3.add(btn[13]);
        panel3.add(btn[14]);
        panel3.add(btn[15]);
        panel3.add(btn[16]);
        panel3.add(btn[17]);

        JPanel panel4 = new JPanel(new FlowLayout());
        panel3.setSize(new Dimension(4,4));
        panel2.setSize(new Dimension(4,4));
        panel4.add(panel3);
        panel4.add(panel2);

        JPanel panel5 = new JPanel(new GridLayout(2,1));
       field = new JTextField(50);
	   field.setFont(fieldFont);
	   field.setEditable(false);
        panel5.add(field);
        panel5.add(panel4);
       // panel5.add(new JLabel());


        for(int i = 0 ; i<btn.length;i++)
           {
                btn[i].addActionListener(new l());
           }

        add(panel5,BorderLayout.CENTER);
		//add(new JLabel("      "),BorderLayout.SOUTH);
        

        //add(panel1,BorderLayout.SOUTH);
       //add(btn[12],BorderLayout.WEST);
       // add(panel2,BorderLayout.WEST);
	  
	  //Necessary Initializations
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(275,400);
		setResizable(false);
		setVisible(true);
    }

    public class l implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            for(int i=0;i<18 ;i++)
           {
                if(i==11|i==12|i==17)
                {
                    if(e.getSource()==btn[11])
                    {
                       // result
                      // System.out.println(field.getText()+" = "+EvaluateString.evaluate(field.getText()));
                       String result = ""+EvaluateString.evaluate(field.getText());
                       field.setText(result);

                       break;
                    }
                    else if(e.getSource()==btn[12])
                    {
						if(field.getText().equals(""))
						{
							break;
						}
                        field.setText("");
                        break;
                    }
                    else if(e.getSource()==btn[17])
                    {
                       
						if(field.getText().equals(""))
						{
							break;
						}
                        String text = field.getText();
                        field.setText(text.substring(0,text.length()-1));
                        break;
                    }
                
                }
                else if(e.getSource()==btn[i])
                    {
						if(e.getSource() == btn[13] || e.getSource() == btn[14] || e.getSource() == btn[15] || e.getSource() == btn[16])
						{	
							field.setText(field.getText()+" "+btn[i].getText()+" ");
							break;
						}
						else
						{
							field.setText(field.getText()+btn[i].getText());
							break;
						}

                    }
        
           }
        }
    }

}