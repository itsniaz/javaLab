import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class hello extends JFrame implements ActionListener
{
	public JButton hello;
	public JButton bye;
	public hello()
	{
		super("hello bye");
		setLayout(new FlowLayout(FlowLayout.CENTER,50,100));

		hello = new JButton("Hello");
		 bye = new JButton("Bye");


		hello.addActionListener(this);
		bye.addActionListener(this);


		add(hello);
		add(bye);

		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == hello)
		{
			JOptionPane.showMessageDialog(null,"Hellooo !!");
		}
		else if(e.getSource() == bye)
		{
			JOptionPane.showMessageDialog(null,"Byeee !!!");
		}
	}

	public static void main(String[] args)
	{
		new hello();
	}
}