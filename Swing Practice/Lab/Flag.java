import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Flag extends JFrame{


	public int w;
	public int h;

	public Flag(){		
		super("BD Flag");


		getContentPane().addComponentListener(new ComponentAdapter(){
        
            public void componentResized(ComponentEvent e)
            {
                Component c = (Component)e.getSource();
                w = c.getWidth();
                h = c.getHeight();
            }
        });


		
		
		setBackground(new Color(40,155,130));
		setSize(800,400);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.drawOval(100,40,200,100);
		g.fillOval(100,40,200,100);
	
		
	}

	public static void main(String[] args)
	{
		Flag Mf =  new Flag();
		//Mf.getContentPane().setBackground(Color.YELLOW);
	}
}
