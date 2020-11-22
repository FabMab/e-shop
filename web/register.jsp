<%-- 
    Document   : register
    Created on : Apr 1, 2019, 10:51:08 PM
    Author     : Fabrice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <center>
        <h3>Register</h3>
    <p>Already registered? <a href="login.jsp">Login Here</a><p/>
    
    
         <form method="POST" action="RegisterServlet">  
            
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Enter your details</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Full Name</td>
                        <td><input type="text" name="fname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    </tbody>
                  </table>
                       <input type="submit" value="Submit" />
                        
                    </tr>
                
            </center>
               <jsp:include page="foot.jsp"/>
        </form>
 

        </body>
</html>
