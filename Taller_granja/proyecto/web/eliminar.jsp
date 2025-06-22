<%-- 
    Document   : eliminar
    Created on : 14/06/2025, 4:18:19 p. m.
    Author     : DIEGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos2.css" type="text/css">
        <title>Eliminar</title>
    </head>
    <body>
        <div id="cont">
        <h1>Eliminar datos</h1>
        </div>
        <form action="Servlet3"method="POST">
            <label>Elija lo que quiere eliminar</label>
            <select name="dato">
                <option disabled selected hidden>Seleccione una opcion</option>
                <option value="cultivos">Produccion</option>
                <option value="enfermedades">Enfermedades</option>
                <option value="corrales">Huertos</option>
                </div>
            </select><br>
            <label>Ingrese id a eliminar</label>
            <input type="text" name="id" placeholder="Ingrese id..." required><br>
            <div>
                    <br><input type="submit" value="Eliminar">
            </div>
        </form>
    </body>
</html>
