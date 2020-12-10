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
         <form method="POST" action="RegisterServlet">   
            <table class="table-bordered">
                <thead>
                    <tr>
                        <th colspan="2">Enter your details</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Name: </td>
                        <td><input type="text" name="fname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Username: </td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password: </td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    </tbody>
                  </table>
             <br>
                       <input type="submit" class="btn btn-success" value="Register" />  
                    <p>Already registered? <a href="login.jsp">Login Here</a><p/>   
            </center>
     <br>
               <jsp:include page="foot.jsp"/>
        </form>
 

        </body>
</html>
