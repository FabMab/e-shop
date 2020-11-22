/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fabrice
 * 
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import controller.ConnectionController;

public class Login {
    
    public static List<Customer> getCustomer(String username,String password){		
		List<Customer>list = new ArrayList<>();
		//take a list to store the values which are in db
		 try{  
			Connection con=ConnectionController.getConnection();  
			PreparedStatement ps=con.prepareStatement("select * from \"customer\" where \"username\"=? and \"password\"=?");  
			ps.setString(1,username);  
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();  
			if(rs.next()){  				
				Customer user =new Customer();
                                user.setUsername(rs.getString(1));
				user.setName(rs.getString(2));  
			                                         //if the values exist in db then											
				user.setPassowrd(rs.getString(3));     // set them to setters and getters and them to list and return the list finally
				
				list.add(user);
			}  
			con.close();  
		}catch(Exception ex){ex.printStackTrace();}  		  
		return list;  //returns the list		
	}
    
}
