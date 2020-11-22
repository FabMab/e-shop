<%-- 
    Document   : registration
    Created on : Apr 2, 2019, 12:03:37 AM
    Author     : Fabrice
--%>

<%@ page import ="java.sql.*" %>

<%
    String user = request.getParameter("uname");    
    String pwd = request.getParameter("pass");
    String fname = request.getParameter("fname");
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Shop",
            "fabrice", "123");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into \"customer\"(\"customerId\",\"firstName\",\"password\") values ('" + user + "','" + fname + "','" + pwd + "')");
    if (i > 0){
    
       // response.sendRedirect("welcome.jsp");
        out.print("<center><h3>Registration Successful.</h3>"+"<p><a href='login.jsp'> Login</a>/</p></center>");
    } else {
        response.sendRedirect("index.html");
    }
%>