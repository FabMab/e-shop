<%-- 
    Document   : login
    Created on : Apr 1, 2019, 10:26:22 PM
    Author     : Fabrice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <center>
      <h3>Login</h3>
        <form method="post" action="LoginServlet">
            
            <table class="table-bordered">
                <thead>
                    <tr>
                        <th colspan="2">Login</th>
                    </tr>
                </thead>
                <tbody>
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
            <br>
               <input type="submit" class="btn btn-primary" value="Login" />
                        <p> Not Registered? <a href="register.jsp">Register Here</a></p>
                 </center>
                    <br>
                  <jsp:include page="foot.jsp"/>
        </form>
    </body>
</html>
