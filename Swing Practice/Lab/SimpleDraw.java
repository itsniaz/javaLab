import java.awt.*;
class MyFrame extends Frame{
	  DimensionInterface r[];
	public MyFrame(){
		super("Java First Window");
		setSize(600,400);
		setLayout(new FlowLayout());
		
	}
	public void setShapes(DimensionInterface recs[]){
		this.r=recs;
	}
	public void paint(Graphics g){
		  for(int i = 0; i<r.length;i++)
		  {
			  g.drawOval(r[i].getX(),r[i].getY(),r[i].getWidth(),r[i].getHeight());
			  //System.out.println(r[i].toString());
		  }
	}
}
public class SimpleDraw{
    public static void main(String str[]){
		MyFrame mf=new MyFrame();
        mf.setVisible(true);
		
		DimensionInterface [] obj = new DimensionInterface[5];

		obj[0] = new Rectangle(0,0,200,100);
		obj[1] = new Circle(50,50,90,100);
		obj[2] = new Circle(40,50,50,100);
		obj[3] = new Rectangle(50,50,50,100);
		obj[4] = new Rectangle(50,50,50,100);
		
		mf.setShapes(obj);
    }
}