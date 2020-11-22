/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


import model.Customer;
import model.Login;

/**
 *
 * @author Fabrice
 */
public class LoginServlet extends HttpServlet {

     private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		try{
			String username=request.getParameter("uname");
			String password =request.getParameter("pass");                                         //getting userid and password from user 
			
			
			Customer c = new Customer();
		
			c.setUsername(username);  //setting them to setters and getters
			c.setPassowrd(password);
			List<Customer>list = new ArrayList<>(); //take a list
			

			  list =Login.getCustomer(username, password); //send the values id and password to vadlidate class of getCustomer method and storing the resultset in list
			 if(!(list.isEmpty())){
				 //if list has some values then you are logged in
                         request.getRequestDispatcher("index.jsp").include(request, response);
                         //HttpSession session = request.getSession();
			 //session.setAttribute("customer_id", c.getUsername());
                         for(Customer i:list)
			 out.print("<h4 align='left'>Welcome "+ i.getName()+ "</h4>");
                         
			 }else{
		     //if no values are found then the User does not exist
		            request.getRequestDispatcher("login.jsp").include(request, response);
		            out.print("<p align='center'>Wrong Username/Password. Please try again");
			         
			 }
		}catch(Exception e){
            request.getRequestDispatcher("login.jsp").include(request, response);
            out.print("<p>Please Enter Valid Details To Login</p>");
//executes when user enters invalid details
			
		}
	}

}
