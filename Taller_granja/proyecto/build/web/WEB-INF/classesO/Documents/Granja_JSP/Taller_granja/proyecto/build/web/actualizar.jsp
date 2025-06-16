<%-- 
    Document   : actualizar
    Created on : 15/06/2025, 3:28:29 p. m.
    Author     : DIEGO
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>
        <h1>acutalizar</h1>
        <form action="Servlet5" method="POST";>
            <label type="text"> cual desea cambiar?</label><br>
            <select name="dato">
                <option disabled selected hidden>Seleccione una opcion</option>
                <option value="cultivos">Produccion</option>
                <option value="enfermedades">Enfermedades</option>
                <option value="corrales">Huertos</option>
            </select><br>
            <div>
                    <br><input type="submit" value="cargar">
            </div>
            
          </form>
    </body>
</html>
