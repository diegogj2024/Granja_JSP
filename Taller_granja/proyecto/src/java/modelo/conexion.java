package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    public String usuario;
    public String url;
    public String clave;
    public Connection conex;
    public conexion() {
    usuario="root";
    url="jdbc:mysql://localhost:3306/granja";
    clave="";
    conex=null;
    }
    
    public void hacerConexion() throws SQLException{
        try {
            conex=DriverManager.getConnection(url,usuario,clave);
            System.out.println("dato conexion:  "+conex.toString());
            
        } catch (SQLException e) {
            System.out.println("Error:  "+e);
        }
    }
}
