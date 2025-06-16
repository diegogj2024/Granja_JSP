<%-- 
    Document   : actualizar_Corral
    Created on : 16/06/2025, 8:07:26 a. m.
    Author     : DIEGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <form action="Servlet4" method="POST">
            <label type="text"> que dato desea cambiar</label><br>
               <select name="columna">
                  <option disabled selected hidden>Seleccione una opcion</option>
                  <option value="produccion">produccion del huerto</option>
                  <option value="ubicacion_del_huerto">ubicacion del huerto</option>
               </select><br>
               
                <label type="text">ingrese el nuevo valor</label><br>
                <input type="text" name="nuevo_valor" placeholder="nuevo dato"><br>
                <label type="text">ingrese el id de la fila</label><br>
                <input type="text" name="id" placeholder="id"><br>
               <div>
                    <br><button name="dato" type="submit" value="corrales">actualizar</button>
               </div>
        </form>
        
    </body>
</html>
