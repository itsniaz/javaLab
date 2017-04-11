import java.sql.*;

public class database
{

 static final String DB_URL = "jdbc:mysql://localhost/demo";
             
            
    public static void main(String[] args) 
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

             while(rs.next()){
         //Retrieve by column name
         int  x = rs.getInt("x");
          int  y = rs.getInt("y");
		   int  w = rs.getInt("w");
		    int  h = rs.getInt("h");

         //Display values
         System.out.println("X : " + h);
         System.out.println("y : " + y);
         System.out.println("w : " + w);
         System.out.println("h: " + h+"\n\n");
		 
      }


        
        }
        catch(Exception e)
        {
           // System.out.println("I came here babe");
        }

    }

}