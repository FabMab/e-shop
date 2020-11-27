<%-- 
    Document   : basket
    Created on : 09-Apr-2019, 02:20:31
    Author     : Fabrice
--%>
<%@page import="model.CartItem"%>
<%@page import="model.Cart"%>
<%@page import="java.util.*"%>
<%@page import="controller.ShopController"%>      
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

  
<jsp:useBean id="cart" scope="session" class="model.Cart" />
<!DOCTYPE html>
        
<!-- Instantiate the ShoppingCart bean with an id of "cart" -->


<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
    <title>Shopping Cart Contents</title>
  </head>
  <body>
    <center>
        
    <table width="300" border="1" cellspacing="0"
      cellpadding="2" border="0">
      <caption><b>Basket</b></caption>
      <tr>
        <th>Description</th>
        <th>Price</th>
        <th>Quantity</th>
      </tr>
     
     <% //Cart cart =new Cart();
     
       Enumeration enume = cart.getEnumeration();
      String[] tmpItem;
      // Iterate over the cart
      while (enume.hasMoreElements()) {
        tmpItem = (String[])enume.nextElement();
        %>
        <tr>
          <td><%=tmpItem[1] %></td>
          <td align="center">£<%=tmpItem[2] %></td>
          <td align="center"><%=tmpItem[3] %></td>
        </tr>
        <%
      }
       %>
      <tr>
          <td align="center"> Total </td>
          <td align="center">£  </td>
            <td align="center">  items</td>
        </tr>
        %<
    %>
    </table>
    </center>
    <a href="index.jsp">Back to Catalog</a>
  </body>
</html>