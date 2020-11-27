<%-- 
    Document   : index
    Created on : Apr 2, 2019, 5:39:42 AM
    Author     : Fabrice
--%>
<%@ page import="controller.ProductController"%>
<%@ page import="model.Product"%> 
<%@ page import="java.util.ArrayList"%>
<%@ page import ="model.Cart"%>
<%@ page import ="model.CartItem"%> 
<%@ page import ="model.Customer"%> 
<%@ page import ="controller.ShopController"%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<jsp:useBean id="cart" scope="session" class="model.Cart"/>

<!DOCTYPE html>
<!DOCTYPE html>




 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
    </head>
    <body>
        <%


   ProductController retrieve = new ProductController();
   ArrayList<Product> listing = retrieve.getAllProducts();
   %>
        <jsp:include page="menu.jsp"/>
       
    <center><h3> E-Shop</h3></center>
    
    <p><a href="myorders.jsp">My Orders </a><a href="basket_1.jsp">| Basket: <%= cart.getNumOfItems()%></a> </p>
    <center>    
<table border="1" width="70%" cellpadding="3">
	
  <%
	for(Product prod : listing) {
	%>
		<form action="ShopController" method="post">
                    <td> 
                        <%=prod.getDescription()%><input type="hidden" name="description" value=<%=prod.getDescription()%> ></br>
                        </br> 
                        <input type="hidden" name="pId" value=<%=prod.getId()%>
                        <p><strong><center>£<%=prod.getPrice()%><center></strong><input type="hidden" name="price" value=<%=prod.getPrice()%>></p></br>
                            
                
                        <input type="hidden" name="customerId" value="userId"/>
                    <center><input type="submit" name="submit" class="btn btn-primary" value="Add to Basket"/></center></td>
		</form>
	</td>
	<% } %>
</table> 
</center>
    </body>
</html>
