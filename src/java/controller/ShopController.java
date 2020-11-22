/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import model.Cart;

public class ShopController extends HttpServlet {


  public void init(ServletConfig config)
    throws ServletException {

    super.init(config);
  }

  //Process the HTTP Post request
  public void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    
//    String command = request.getParameter("Submit");
//    HttpSession session = request.getSession();
//    //session.setAttribute("cart", cart);
//    Cart cart = (Cart)session.getAttribute("cart");
      
    HttpSession session = request.getSession();
    String command = request.getParameter("submit");
   
//    Cart cart = null;
  //Cart cart = new Cart();
 //  session.setAttribute("cart", cart);
//    
 //   session.getAttribute("cart");
Cart cart = (Cart)session.getAttribute("cart");
    // Determine which command to perform
    if ( command.equals("Add to Basket") ) {

      // Get the item from the request
      String id = request.getParameter("pId");
      
//      if ( id != null ) {

        String desc = request.getParameter("description");
        String price =  request.getParameter("price");

        // Add the selected item to the cart
        cart.addItem(id, desc, price, 1);
        
        System.out.println(id);
                    
        System.out.println(desc);
                      
        System.out.println(price);
                         
      System.out.println("I'm in Product servlet");
      System.out.println(cart);
     // }
    }
    
    
                        
    // Redirect the response
    // after adding an item to the cart.
    response.sendRedirect("index.jsp");
  }

  //Get Servlet information
  public String getServletInfo() {

    return "ShopController Information";
  }
}
