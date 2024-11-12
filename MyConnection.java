package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
      static Connection connection;
      
      public static Connection getMyConnection() throws ClassNotFoundException ,SQLException {
    	  if (connection == null) {
			//register driver
    		  Class.forName("com.mysql.cj.jdbc.Driver");
    		
    		//establish connection
    		  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch12709","root","root@19");
		} 
    	else
    	{
    		return connection;
		}
		return connection;
      }
}
