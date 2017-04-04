import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class main extends JFrame

{

	public int click;
	public main()
	{
		super("Test");
		click = 0;
		setLayout(new FlowLayout(FlowLayout.CENTER,50,100));

		JLabel jl = new JLabel("Click Count : ");
		JButton jb = new JButton("Click Me");
		jb.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event)
			{
				click+=1;
				jl.setText("Click Count "+click);
			}
		});
		add(jb);
		add(jl);
		setSize(50,50);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		new main();
	}
}