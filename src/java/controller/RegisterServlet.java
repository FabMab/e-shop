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
import model.Customer;
import model.AddCustomer;


/**
 *
 * @author Fabrice
 */
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("uname");
        String pwd = request.getParameter("pass");
        String fname = request.getParameter("fname");

        Customer c = new Customer();
        AddCustomer cd = new AddCustomer();

        c.setUsername(user);
        c.setName(fname);
        c.setPassowrd(pwd);

        int status = cd.insertCustomer(c);

        if (status > 0) {
            //executes if the details are added to database

            out.print("<center><h3>Registration Successful.</h3>" + "<p><a href='login.jsp'> Login</a></p></center>"); // if successfully executes save method

        } else {
            request.getRequestDispatcher("register.jsp").include(request, response);
            out.print("<center><p>Please Enter Valid Details to Register</p></center>");

            //this executes when fields are left blank
        }

    }
}
   
    

    