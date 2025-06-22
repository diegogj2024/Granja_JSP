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
        <link rel="stylesheet" href="css/estilos2.css" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <form action="Servlet4" method="POST">
            <label type="text">Que dato quiere cambiar?</label><br>
               <select name="columna">
                  <option disabled selected hidden>Seleccione una opcion</option>
                  <option value="produccion">Produccion del huerto</option>
                  <option value="ubicacion_del_huerto">Ubicacion del huerto</option>
               </select><br>
               
                <label type="text">Ingrese el nuevo valor</label><br>
                <input type="text" name="nuevo_valor" placeholder="Nuevo dato"><br>
                <label type="text">Ingrese el id de la fila</label><br>
                <input type="text" name="id" placeholder="Id"><br>
               <div>
                    <br><button name="dato" type="submit" value="corrales">Actualizar</button>
               </div>
        </form>
        
    </body>
</html>
