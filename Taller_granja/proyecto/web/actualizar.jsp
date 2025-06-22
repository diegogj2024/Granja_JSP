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
        <link rel="stylesheet" href="css/estilos2.css" type="text/css">
        <title>Bienvenido</title>
    </head>
    <body>
        <div id="cont">
        <h1>Acutalizar datos</h1>
        </div>
        <form action="Servlet5" method="POST";>
            <label type="text"> Elija lo que quiera actualizar</label><br>
            <select name="dato">
                <option disabled selected hidden>Seleccione una opcion</option>
                <option value="cultivos">Produccion</option>
                <option value="enfermedades">Enfermedades</option>
                <option value="corrales">Huertos</option>
                </div>
            </select><br>
            <div>
                    <br><input type="submit" value="Ir">
            </div>
            
          </form>
    </body>
</html>
