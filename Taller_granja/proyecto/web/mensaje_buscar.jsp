<%-- 
    Document   : mensaje_buscar
    Created on : 13/06/2025, 7:29:45 a. m.
    Author     : DIEGO
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>informacion</title>
    </head>
    <body>
        <h1>informacion</h1>
        <ol>
            <%
              session = request.getSession(false);
              ArrayList<String> productos = (ArrayList<String>) session.getAttribute("datos_cosas");
              for (int i = 0; i < productos.size(); i++) {
              %>
              <li><%= productos.get(i) %></li>
              <%}%>
        </ol>
    </body>
</html>
