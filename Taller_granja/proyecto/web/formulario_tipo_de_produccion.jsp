<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de tipo de produccion</title>
        <link rel="stylesheet" href="css/estilos.css" type="text/css">
    </head>
    <body>
        <h1>Registrar el tipo de produccion</h1>
        
        <form action="registipo" method="post">
            <label for="tipocultivo">Tipo de cultivo o producto:</label><br>
                <input type="text" name="tipocultivo" id="tipocultivo" required><br><br>
            
                <label for="metodoproduccion" method="post">Metodo de produccion:</label><br>
                <input type="text" name="metodoproduccion" id="metodoproduccion"><br><br>
            
                <label for="frecuenciaprodu" method="post">Frecuencia:</label><br>
                <select id="frecuenciaprodu" name="frecuenciaprodu">
                    <option value="Anual">Anual</option>
                    <option value="Semestral">Semestral</option>
                    <option value="Continua">Continua</option>
                </select><br>
                
                <br><input type="submit" value="Registrar">
        </form>
    </body>
</html>