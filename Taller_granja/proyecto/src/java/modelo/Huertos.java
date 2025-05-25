package modelo;

import java.sql.SQLException;

public class Huertos {
    private int id_corral;
    private String produccion;
    private String ubicacion_huerto;
    
    public Huertos() {
        
    }

    public int getId_corral() {
        return id_corral;
    }

    public void setId_corral(int id_corral) {
        this.id_corral = id_corral;
    }

    public String getProduccion() {
        return produccion;
    }

    public void setProduccion(String produccion) {
        this.produccion = produccion;
    }

    public String getUbicacion_huerto() {
        return ubicacion_huerto;
    }

    public void setUbicacion_huerto(String ubicacion_huerto) {
        this.ubicacion_huerto = ubicacion_huerto;
    }
    
    public void conexionBd() throws SQLException{
        conexion objconexion=new conexion();
        objconexion.recibirHuertos(this.id_corral,this.produccion,this.ubicacion_huerto);
        
    }
    
}
