import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class mysqlConn
{

 //static final String DB_URL = "jdbc:mysql://johnny.heliohost.org/trialnly_rms";
	static final String DB_URL = "jdbc:mysql://alpha.hostmydreams.net/trialnly_rms";
 
              static final String USER = "trialnly";
             //static final String PASS = "Trialnly_1234";
			 static final String PASS = "Wuff_1234";

        Connection conn;
        Statement stmt;
        String sql;
        ResultSet rs;

       public mysqlConn()
       {
           try
           {
              Class.forName("com.mysql.jdbc.Driver"); 
          //  System.out.println("Driver Loaded");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
           // System.out.println("Succesful"); 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Can't connect to the internet");
        }
       }
    public boolean validate (String tempUsername, String tempPass) 
    {
        ;
        if(tempUsername.equals(""))
        {
            return false;
        }
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); 
          //  System.out.println("Driver Loaded");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
           // System.out.println("Succesful");
           
            sql = "SELECT password FROM user where username = "  + "'"+ tempUsername+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);


           String result="";

            while(rs.next()){
                
                result = rs.getString("password");
             }
             

            // System.out.println(tempPass);
            // System.out.println(result);
      
            if(result.equals(tempPass))
            {
                return true;
            }
            

            return false;

    
        
        }
        catch(Exception e)
        {
           // System.out.println("I came here babe");
           return false;
        }

    }

    public boolean signUp(String name,String mNo,String userName,String password )
    {
         try{
            name = "'" + name + "'";
            mNo = "'" + mNo + "'";
            userName = "'" + userName + "'";
            password = "'" + password + "'";
            
            sql = "insert into user values("+name+","+mNo+","+userName+","+password+")";
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);

             return true;
         }

         catch (Exception e)
         {
             System.out.println(e);
             return false;
         }

            
    }

}