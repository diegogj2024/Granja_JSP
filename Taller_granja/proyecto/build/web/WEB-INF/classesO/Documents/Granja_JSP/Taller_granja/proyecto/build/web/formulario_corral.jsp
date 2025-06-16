<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos2.css" type="text/css">
        <title>Huertos y Corrales</title>
    </head>
    <body>
        <h1>Registro de huertos y corrales</h1>
        <form action="Servlet" method="POST">
            <label for="id_corral">Ingrese el id del corral:</label><br>
            <input type="number" name="id_corral" placeholder="ID corral" required><br><br>
            
            <label for="produccion">Ingrese la produccion del huerto:</label><br>
            <input type="text" name="produccion" placeholder="Produccion del huerto" required><br><br>
            
            <label for="ubicacion_huerto">Ingrese la ubicacion de huerto:</label><br>
            <input type="text" name="ubicacion_huerto" placeholder="Ubicacion de huerto" required><br><br>
            </select><br>
            <div>
                    <br><button id="botones" name="dato" type="submit" value="huertos">Registrar</button>
               </div>
        </form>
    </body>
</html>
