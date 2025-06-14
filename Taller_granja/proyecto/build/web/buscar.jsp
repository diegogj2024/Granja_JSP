<%-- 
    Document   : buscar
    Created on : 13/06/2025, 8:06:40 a. m.
    Author     : DIEGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar</title>
    </head>
    <body>
        <h1>bienvenido</h1>
        <form action="Servlet2" method="POST">
            <select name="dato">
                <option disabled selected hidden>Seleccione una opcion</option>
                <option value="Produccion">Produccion</option>
                <option value="Enfermedades">Enfermedades</option>
                <option value="Huertos">Huertos</option>
            </select>
            <div>
                    <br><input type="submit" value="Registrar">
            </div>
        </form>
    </body>
</html>
