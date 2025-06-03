<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos.css" type="text/css">
        <title>Enfermedades</title>
    </head>
    <body>
        <h1>Registro de enfermedades</h1>
        <form action="Servlet" method="POST">
            <label for="codigo_enfermedad">Ingrese el codigo:</label><br>
            <input type="number" name="codigo_enfermedad" placeholder="Codigo" required><br><br>
            
            <label for="corral">Ingrese corral:</label><br>
            <input type="text" name="corral" placeholder="Corral" required><br><br>
            
            <label for="Fecha_registro">Ingrese la fecha de registro:</label><br>
            <input type="text" name="Fecha_registro" placeholder="Fecha de registro" required><br><br>
            
            <label for="Humedad_del_terreno">Ingrese humedad del terreno:</label><br>
            <input type="text" name="Humedad_del_terreno" placeholder="Humedad" required><br><br>
            
            <label for="Nombre_enfermedad">Ingrese nombre de la enfermedad:</label><br>
            <input type="text" name="Nombre_enfermedad" placeholder="Nombre de enfermedad" required><br><br>
            
            <label for="Tratamiento_aplicado">Ingrese tratamiento aplicado</label><br>
            <input type="text" name="Tratamineto_enfermedad" placeholder="Tratamiento aplicado" required><br><br>
            
            <label for="observaciones">Ingrese observarciones:</label><br>
            <input type="text" name="observaciones" placeholder="Observaciones" required><br><br>
            
            <input type="submit" name="dato" value="Registrar">
        </form>
    </body>
</html>
