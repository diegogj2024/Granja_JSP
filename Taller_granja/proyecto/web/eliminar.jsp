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
        <title>Eliminar</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <form action="Servlet3"method="POST">
            <label>que deseas borrar</label>
            <select name="dato">
                <option disabled selected hidden>Seleccione una opcion</option>
                <option value="cultivos">Produccion</option>
                <option value="enfermedades">Enfermedades</option>
                <option value="corrales">Huertos</option>
            </select>
            <label>ingrese el id de lo que desea borrar</label>
            <input type="text" name="id" placeholder="id a borrar" required><br>
            <div>
                    <br><input type="submit" value="eliminar">
            </div>
        </form>
    </body>
</html>
