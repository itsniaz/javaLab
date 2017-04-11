import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
class MyFrame extends JFrame{
	  DimensionInterface r[];
	  ArrayList list;
	public MyFrame(){
		super("Java First Window");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
	}
	public void setShapes(ArrayList list){
		this.list = list;
	}
	public void paint(Graphics g){
		  for(int i = 0; i<list.size();i++)
		  {
			  Rectangle r = (Rectangle)list.get(i);
			 
		  g.drawRect(r.getX(),r.getY(),r.getWidth(),r.getHeight());
			  //System.out.println(r[i].toString());
		  }
	}
}
public class SimpleDraw{
    public static void main(String str[]){
		MyFrame mf=new MyFrame();
        mf.setVisible(true);
		
		DimensionInterface [] obj = new DimensionInterface[5];
 
		ArrayList <DimensionInterface> list =  new ArrayList <DimensionInterface>();
		list.add(new Rectangle(0,0,200,100));
	    list.add(new Rectangle(50,50,90,100));
		list.add(new Rectangle(40,50,50,100));
		list.add(new Rectangle(50,50,50,100));
		list.add(new Rectangle(50,50,50,100));
		
		
		
		mf.setShapes(list);
    }
}