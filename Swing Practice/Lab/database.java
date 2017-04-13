import java.sql.*;
import java.util.ArrayList;
public class database 
{

	
 static final String DB_URL = "jdbc:mysql://localhost/demo";
             
            
    public void db () 
    {
        
        try
        {
             Class.forName("com.mysql.jdbc.Driver"); 
             System.out.println("Driver Loaded");
            Connection conn = DriverManager.getConnection(DB_URL,"root","");
            System.out.println("Succesful");

            String sql = "SELECT * FROM rect";

            Statement stmt = conn.createStatement();

             ResultSet rs = stmt.executeQuery(sql);

			int x;
			int y;
			int w;
			int h;
			 ArrayList  mylist =  new ArrayList ();
             while(rs.next()){

           x = rs.getInt("x");
           y = rs.getInt("y");
		   w = rs.getInt("w");
		   h = rs.getInt("h");

		  
      
         System.out.println("X : " + h);
         System.out.println("y : " + y);
         System.out.println("w : " + w);
         System.out.println("h: " + h+"\n\n");
		mylist.add(new Rectangle(x,y,w,h));
		
		MyFrame mf = new MyFrame();
		mf.setShapes(mylist);
		mf.setVisible(true);

    }
	
		}
	catch (Exception e)
	{
		
		
	}
		}

	
	public static void main(String[] args)
	{
		database mydb = new database();
		mydb.db();
		
	}

}