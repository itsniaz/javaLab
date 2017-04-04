import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calc extends JFrame implements ActionListener
{

	public JTextField text1 = new JTextField(6);
	public JTextField text2 = new JTextField(6);
	public JLabel result = new JLabel("Result : ");
	public JButton btnAddThem = new JButton("Add Them");
	public JButton btnSubtract = new JButton("Subtract");
	public JButton btnMultiply = new JButton("Multiply");



	public Calc()
	{
		super("Title");
		setLayout(new BorderLayout());

		JPanel textPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,50,100));
		textPanel.add(text1);
		textPanel.add(text2);
		textPanel.add(result);
		JPanel textPanel2 = new JPanel(new FowLayout(FlowLayout.CENTER,50,100));
		textPanel2.add(btnAddThem);
		textPanel2.add(btnSubtract);
		textPanel2.add(btnMultiply);

		btnAddThem.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);

		add(textPanel,BorderLayout.NORTH);
		add(textPanel2,BorderLayout.SOUTH);

		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int num1=0,num2=0;;
		if(text1.getText().equals("") || text2.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Text Field Empty");
		}
		else
		{
		 num1 = Integer.parseInt(text1.getText());
		 num2 = Integer.parseInt(text2.getText());
	    }
		if(e.getSource() ==  btnAddThem)
		{
			result.setText("Result : "+(num1+num2));
		}
		else if(e.getSource() ==  btnSubtract)
		{
			result.setText("Result : "+(num1-num2));
		}
		else if(e.getSource() ==  btnMultiply)
		{
			result.setText("Result : "+(num1*num2));
		}
	}

	public static void main(String[] args)
	{
		new Calc();
	}
}