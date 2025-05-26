package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.sql.PreparedStatement;

public class conexion {
    public String usuario;
    public String url;
    public String clave;
    public Connection conex;
    private String tabla=null;
    /**datos de produccion**/
    private String codigo_cultivo;
    private String tipo_cultivo;
    private String metodo_produccion;
    private String frecuencia_produccion;
    /** datos de huerto**/
    private int id_corral;
    private String produccion;
    private String ubicacion_huerto;
    /** datos de enfermedades**/
    private String codigo_enfermedad;
    private String corral;
    private String Fecha_registro;
    private String Humedad_del_terreno;
    private String Nombre_enfermedad;
    private String Tratamiento_aplicado;
    private String observaciones;
    
    public conexion() {
    usuario="root";
    url="jdbc:mysql://localhost:3306/granja";
    clave="";
    conex=null;
    }
    
    
    public void recibirProductos(String codigo_cultivo,String tipo_cultivo,String metodo_produccion,String frecuencia_produccion) throws SQLException{
        this.codigo_cultivo=codigo_cultivo;
        this.tipo_cultivo=tipo_cultivo;
        this.metodo_produccion=metodo_produccion;
        this.frecuencia_produccion=frecuencia_produccion;
        this.tabla="Produccion";
        guardarDatos(tabla);
    }
    
    public void recibirHuertos(int id_corral,String produccion,String ubicacion_huerto) throws SQLException{
        this.id_corral=id_corral;
        this.produccion=produccion;
        this.ubicacion_huerto=ubicacion_huerto;
        this.tabla="Huertos";
        guardarDatos(tabla);
    }
    
    public void recibirEnfermedades(String codigo_enfermedad,String corral,String Fecha_registro,String Humedad_del_terreno,String Nombre_enfermedad,String Tratamiento_aplicado,String observaciones) throws SQLException{
        this.codigo_enfermedad=codigo_enfermedad;
        this.corral=corral;
        this.Fecha_registro=Fecha_registro;
        this.Humedad_del_terreno=Humedad_del_terreno;
        this.Nombre_enfermedad=Nombre_enfermedad;
        this.Tratamiento_aplicado=Tratamiento_aplicado;
        this.observaciones=observaciones;
        this.tabla="Enfermedades";
        guardarDatos(tabla);
    }
    
    public void guardarDatos(String tabla) throws SQLException{
        try {
            conex=DriverManager.getConnection(url,usuario,clave);
            System.out.println("dato conexion:  "+conex.toString());
            if(tabla=="Produccion"){
                String sql = "INSERT INTO cultivos (Codigo_cultivo,Tipo_Cultivo,Metodo_Produccion,Frecuencia_Produccion) VALUES (?, ?, ?,?)";
                PreparedStatement stmt = this.conex.prepareStatement(sql);
                stmt.setString(1,this.codigo_cultivo);
                stmt.setString(2,this.tipo_cultivo);
                stmt.setString(3,this.metodo_produccion);
                stmt.setString(4,this.frecuencia_produccion);
                int filas = stmt.executeUpdate();
            }else if(tabla=="Huertos"){
                String sql = "INSERT INTO corrales (id_corral,produccion,ubicacion_del_huerto) VALUES (?, ?,?)";
                PreparedStatement stmt = this.conex.prepareStatement(sql);
                stmt.setInt(1,this.id_corral);
                stmt.setString(2,this.produccion);
                stmt.setString(3,ubicacion_huerto);
                int filas = stmt.executeUpdate();
            }else if(tabla=="Enfermedades"){
                String sql = "INSERT INTO enfermedades (codigo_enfermedad,corral,fecha_registro,humedad_terreno,nombre_enfermedad,tratamiento_aplicado,observaciones) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement stmt = this.conex.prepareStatement(sql);
                stmt.setString(1,this.codigo_enfermedad);
                stmt.setString(2, this.corral);
                stmt.setString(3,this.Fecha_registro);
                stmt.setString(4,this.Humedad_del_terreno);
                stmt.setString(5,this.Nombre_enfermedad);
                stmt.setString(6,this.Tratamiento_aplicado);
                stmt.setString(7,this.observaciones);
                int filas = stmt.executeUpdate();
            }
               
        } catch (SQLException e) {
            System.out.println("Error:  "+e);
        }
    }
}
