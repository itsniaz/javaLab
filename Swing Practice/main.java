import javax.swing.*;
import java.awt.*;

public class main extends JFrame
{
	main()
	{
		super("Test");
		setVisible(true);
		setLayout(new FlowLayout());
		add(new JButton("Click me"));
	}
	
	public static void main(String[] args)
	{
		main m1 = new main();
	}
	
}