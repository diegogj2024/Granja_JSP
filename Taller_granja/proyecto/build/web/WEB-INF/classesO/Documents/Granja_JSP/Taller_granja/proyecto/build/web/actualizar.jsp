<%-- 
    Document   : actualizar
    Created on : 15/06/2025, 3:28:29 p. m.
    Author     : DIEGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>
        <h1>acutalizar</h1>
        <form method="POST";>
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
            <% 
               String dato = request.getParameter("dato"); 
               if ("corrales".equals(dato)) {%>
               <label type="text"> que dato desea cambiar</label><br>
               <select name="columna">
                  <option disabled selected hidden>Seleccione una opcion</option>
                  <option value="produccion">produccion del huerto</option>
                  <option value="ubicacion_del_huerto">ubicacion del huerto</option>
               </select><br>
               
                       
               <%}else if("cultivos".equals(dato)){%>
                  <label type="text"> que dato desea cambiar</label><br>
               <select name="columna">
                  <option disabled selected hidden>Seleccione una opcion</option>
                  <option value="Tipo_Cultivo"> Tipo Cultivo</option>
                  <option value="Metodo_Produccion">Metodo Produccion</option>
                  <option value="Frecuencia_Produccion">Frecuencia Produccion</option>
               </select><br>
                  
                <%}else if("enfermedades".equals(dato)){%>
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
               
                 <%}%>
                 <label type="text">ingrese el nuevo valor</label><br>
                 <input type="text" name="nuevo_valor" placeholder="nuevo dato"><br>
                 <label type="text">ingrese el id de la fila</label><br>
                 <input type="text" name="id" placeholder="id"><br>
        </form>
                     <form action="Servlet4" method="POST">
                        <%                         
                         String id=request.getParameter("id");
                         String columna=request.getParameter("columna");
                         String nuevo_valor=request.getParameter("nuevo_valor");
                         HttpSession sessions = request.getSession();
                         session.setAttribute("dato",dato);
                         session.setAttribute("id",id);
                         session.setAttribute("columna",columna);
                         session.setAttribute("nuevo_valor",nuevo_valor);
                        %>
                        <div>
                           <br><input id="boton" type="submit" value="actualizar">
                        </div>
                     </form>
    </body>
</html>
