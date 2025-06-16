<%-- 
    Document   : actualizar_enfermedades
    Created on : 16/06/2025, 8:07:53 a. m.
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
                  <option value="corral"> corral</option>
                  <option value="fecha_registro">fecha registro</option>
                  <option value="humedad_terreno">humedad terreno</option>
                  <option value="nombre_enfermedad">nombre enfermedad</option>
                  <option value="tratamiento_aplicado">tratamiento aplicado</option>
                  <option value="observaciones">observaciones</option>
               </select><br>
               <label type="text">ingrese el nuevo valor</label><br>
                <input type="text" name="nuevo_valor" placeholder="nuevo dato"><br>
                <label type="text">ingrese el id de la fila</label><br>
                <input type="text" name="id" placeholder="id"><br>
                <div>
                    <br><input id="boton" name="dato" type="submit" value="enfermedades">
                </div>
        </form>
    </body>
</html>
