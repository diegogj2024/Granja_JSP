package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;

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
    this.usuario="root";
    this.url="jdbc:mysql://localhost:3306/granja?zeroDateTimeBehavior=CONVERT_TO_NULL";
    this.clave="";
    this.conex=null;
    }
    
    public void conexionBd (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conex=DriverManager.getConnection(this.url,this.usuario,this.clave);
            System.out.println("conexion exitosa:  "+this.conex.toString());
        }catch(Exception e){
            System.out.println("e");
        }
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
            if("Produccion".equals(tabla)){
                String sql = "INSERT INTO cultivos (Codigo_cultivo,Tipo_Cultivo,Metodo_Produccion,Frecuencia_Produccion) VALUES (?, ?, ?,?)";
                PreparedStatement stmt = this.conex.prepareStatement(sql);
                stmt.setString(1,this.codigo_cultivo);
                stmt.setString(2,this.tipo_cultivo);
                stmt.setString(3,this.metodo_produccion);
                stmt.setString(4,this.frecuencia_produccion);
                int filas = stmt.executeUpdate();
            }else if("Huertos".equals(tabla)){
                String sql = "INSERT INTO corrales (id_corral,produccion,ubicacion_del_huerto) VALUES (?, ?,?)";
                PreparedStatement stmt = this.conex.prepareStatement(sql);
                stmt.setInt(1,this.id_corral);
                stmt.setString(2,this.produccion);
                stmt.setString(3,ubicacion_huerto);
                int filas = stmt.executeUpdate();
            }else if("Enfermedades".equals(tabla)){
                String sql = "INSERT INTO enfermedades (codigo_enfermedad, corral, fecha_registro, humedad_terreno, nombre_enfermedad, tratamiento_aplicado, observaciones) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = this.conex.prepareStatement(sql);
                stmt.setString(1, this.codigo_enfermedad);
                stmt.setString(2, this.corral);
                stmt.setString(3, this.Fecha_registro);
                stmt.setString(4, this.Humedad_del_terreno);
                stmt.setString(5, this.Nombre_enfermedad);
                stmt.setString(6, this.Tratamiento_aplicado);
                stmt.setString(7, this.observaciones);
                stmt.executeUpdate();
            }
               
        } catch (SQLException e) {
            System.out.println("Error:asdasd  "+e);
        }
    }
    
    public void buscarDatos(String dato1, ArrayList cosas ) throws SQLException{
        try {
            if("Enfermedades".equals(dato1)){
                cosas.clear();
                String sql = "SELECT codigo_enfermedad, corral,fecha_registro,humedad_terreno,nombre_enfermedad,tratamiento_aplicado,observaciones FROM enfermedades "; 
                PreparedStatement stmt = conex.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()){
                 cosas.add(rs.getString("codigo_enfermedad"));
                 cosas.add(rs.getString("corral"));
                 cosas.add(rs.getString("fecha_registro"));
                 cosas.add(rs.getString("humedad_terreno"));
                 cosas.add(rs.getString("nombre_enfermedad"));
                 cosas.add(rs.getString("tratamiento_aplicado"));
                 cosas.add(rs.getString("observaciones"));
                } 
            }else if("Produccion".equals(dato1)) {
                cosas.clear();
                String sql = "SELECT Codigo_cultivo,Tipo_Cultivo,Metodo_Produccion,Frecuencia_Produccion FROM cultivos "; 
                PreparedStatement stmt = conex.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()){
                 cosas.add(rs.getString("Codigo_cultivo"));
                 cosas.add(rs.getString("Tipo_Cultivo"));
                 cosas.add(rs.getString("Metodo_Produccion"));
                 cosas.add(rs.getString("Frecuencia_Produccion"));
                }
            }else if("Huertos".equals(dato1)){
                cosas.clear();
                String sql = "SELECT id_corral,produccion,ubicacion_del_huerto FROM corrales "; 
                PreparedStatement stmt = conex.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()){
                 cosas.add(rs.getString("id_corral"));
                 cosas.add(rs.getString("produccion"));
                 cosas.add(rs.getString("ubicacion_del_huerto"));
                }
            }       
        } catch (Exception e) {
            System.out.println("e");
        }
        
    }
    public boolean Eliminar (String dato,String id){
        PreparedStatement pstmt = null;
        try {
            if(("corrales").equals(dato)){
             String sql = "DELETE FROM corrales  WHERE id_corral= ?";
             pstmt = this.conex.prepareStatement(sql);
             pstmt.setInt(1,Integer.parseInt(id)); 
            }else if(("cultivos").equals(dato)){
                String sql = "DELETE FROM cultivos  WHERE Codigo_cultivo= ?";
                pstmt = this.conex.prepareStatement(sql);
                pstmt.setString(1,id);
            }else{
                String sql = "DELETE FROM enfermedades WHERE codigo_enfermedad= ?";
                pstmt = this.conex.prepareStatement(sql);
                pstmt.setString(1,id);
            }
            int filasAfectadas = pstmt.executeUpdate(); // <- esto devuelve las filas borradas

            return filasAfectadas > 0;
        } catch (SQLException e) {
            System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            return false;
        }     
    }
    
    public void Actualizar (String nombre_Tabla,String id,String columna,String nuevo_valor ){
        System.out.println("hola");
        try{
            if ("corrales".equals(nombre_Tabla)) {
                int id_int=(Integer.parseInt(id));
                String sql = "UPDATE corrales SET "+columna+"=? WHERE id_corral=?";
                PreparedStatement stmt=this.conex.prepareStatement(sql);
                stmt.setString(1,nuevo_valor);
                stmt.setInt(2, id_int); 
                int filas = stmt.executeUpdate();
            }else if("cultivos".equals(nombre_Tabla)) {
                System.out.println(columna);
                System.out.println(id);
                System.out.println(nuevo_valor);
                String sql = "UPDATE cultivos SET "+columna+"=? WHERE Codigo_cultivo=?";
                PreparedStatement stmt=this.conex.prepareStatement(sql);
                stmt.setString(1,nuevo_valor);
                stmt.setString(2,id); 
                int filas = stmt.executeUpdate();
            }else if("enfermedades".equals(nombre_Tabla)){
                System.out.println(columna);
                System.out.println(id);
                System.out.println(nuevo_valor);
                String sql = "UPDATE enfermedades SET "+columna+"=? WHERE codigo_enfermedad=?";
                PreparedStatement stmt=this.conex.prepareStatement(sql);
                stmt.setString(1,nuevo_valor);
                stmt.setString(2,id);
                int filas = stmt.executeUpdate();
            }      
        }catch(Exception e){
            System.out.println("holaaaaaaaaaaaaaaaaaaaaaaaaa");
        }
    }
}
