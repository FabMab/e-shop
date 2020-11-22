/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Brice
 */
import java.sql.DriverManager;
import java.sql.Connection ;
import java.sql.SQLException;

public class ConnectionController {
    
    
 public static Connection getConnection() throws SQLException{ //making a static connection,shares to all classes
		Connection con=null; // creating connection
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			con=DriverManager.getConnection("jdbc:derby://localhost:1527/Shop","fabrice","123");
						
		} catch (Exception e) {
			con.close();
			//throws an error if at all its unable to create an connection
			System.out.println(e);
		}	
		return con; // returns the connection.
	}		
  }
    

