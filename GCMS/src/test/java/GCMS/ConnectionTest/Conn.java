package GCMS.ConnectionTest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Conn {
	
	
	String userName ="EDRS_RO"; 
	String Password ="YeedReed$";
	String url = "jdbc:oracle:thin://@DOH-WS-ORUAT:1526:EDRSUAT";
	
	
		 @Test
		 public void connection() throws SQLException {
			 
			 
			 
			 
					Connection conn = DriverManager.getConnection(userName, Password, url);
			
		
					
			 	 
			 	
			 	 
		 }

}
