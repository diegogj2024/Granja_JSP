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
        <link rel="stylesheet" href="css/estilos2.css" type="text/css">
        <title>Buscar</title>
    </head>
    <body>
        <div id="cont">
        <h1>Busqueda</h1>
        </div>
        <form action="Servlet2" method="POST">
            <label>Elija lo que quiere buscar</label>
            <select name="dato">
                <option disabled selected hidden>Seleccione una opcion</option>
                <option value="Produccion">Produccion</option>
                <option value="Enfermedades">Enfermedades</option>
                <option value="Huertos">Huertos</option>
                </div>
            </select>
            <div>
                    <br><input type="submit" value="Buscar">
            </div>
        </form>
    </body>
</html>
