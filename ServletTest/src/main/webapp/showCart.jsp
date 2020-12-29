<%@ page import="com.natali.servlet.logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: 38093
  Date: 29.12.2020
  Time: 0:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
      <% Cart cart = (Cart)session.getAttribute("cart"); %>

      <p> Name: <%= cart.getName()%> </p>
      <p> Quantity: <%= cart.getQuantity()%> </p>


</body>
</html>
