public class form extends JFrame
{
	private JPanel p1 = new JPanel(new FlowLayout());
	public form()
	{
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		JPanel p3 = new JPanel(new FlowLayout());

		JLabel name = new JLabel("Name");
		JLabel id   = new JLabel("ID");
		JLabel cgpa	= new JLabel("CGPA");

		JTextField tName = new JTextField(15);

		JTextField tID   = new JTextField(12);

		JTextField tcgpa   = new JTextField(4);

		p1.add(name);
		p1.add(tName);

		p2.add(id);
		p2.add(tID);

		p3.add(cgpa);
		p3.add(tcgpa);


		setSize
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}