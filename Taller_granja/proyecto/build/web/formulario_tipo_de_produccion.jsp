<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos.css" type="text/css">
        <title>Registro de tipo de produccion</title>
    </head>
    <body>
        <h1>Registrar el tipo de produccion</h1>
        <form action="Servlet" method="Post">
            <div class="contenedor">
            <label for="codigo_cultivo">Ingrese codigo de cultivo:</label><br>
            <input type="number" name="codigo_cultivo" placeholder="Codigo" min="1" required><br><br>
            
            <label for="tipo_cultivo">Ingrese el tipo de cultivo o producto:</label><br>
            <input type="text" name="tipo_cultivo" placeholder="Cultivo" required><br><br>
            
            <label for="metodoproduccion" method="post">Ingrese el metodo de produccion:</label><br>
            <input type="text" name="metodoproduccion" placeholder="Metodo de produccion" required><br><br>
            
            <label for="frecuenciaprodu" method="post">Seleccione la frecuencia de produccion:</label><br>
            <select id="frecuenciaprodu" name="frecuenciaprodu">
                <option disabled selected hidden>Seleccione una opcion</option>
                <option value="Anual">Anual</option>
                <option value="Semestral">Semestral</option>
                <option value="Continua">Continua</option>
            </select><br>
            <label for="frecuenciaprodu" method="post">Tipo de formulario</label><br>
            <select id="frecuenciaprodu" name="dato">
                <option disabled selected hidden>Seleccione una opcion</option>
                <option value="produccion">Produccion</option>
            </select><br>
            </div>
            <div id="button">
                <br><input type="submit" value="Registrar">
            </div>
        </form>
    </body>
</html>
