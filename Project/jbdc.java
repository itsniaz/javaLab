import java.sql.*;

public class jbdc
{

 static final String DB_URL = "jdbc:mysql://johnny.heliohost.org/trialnly_rms";
              static final String USER = "trialnly";
             static final String PASS = "Trialnly_1234";
            
    public static void main(String[] args) 
    {
        
        try
        {
             Class.forName("com.mysql.jdbc.Driver"); 
             System.out.println("Driver Loaded");
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Succesful");

            String sql = "SELECT * FROM `TABLE 1` WHERE 1";

            Statement stmt = conn.createStatement();

             ResultSet rs = stmt.executeQuery(sql);

             while(rs.next()){
         //Retrieve by column name
         String name  = rs.getString("Name");
         int  id = rs.getInt("ID");
         String role = rs.getString("Role");
         String status = rs.getString("Status");

         //Display values
         System.out.print("Name : " + name);
         System.out.print(", ID : " + id);
         System.out.print(", Role : " + role);
         System.out.println(", Status : " + status);
      }


        
        }
        catch(Exception e)
        {
           // System.out.println("I came here babe");
        }

    }

}