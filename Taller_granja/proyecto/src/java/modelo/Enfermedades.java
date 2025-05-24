package modelo;


public class Enfermedades {
    private String codigo_enfermedad;
    private String corral;
    private String Fecha_registro;
    private String Humedad_del_terreno;
    private String Nombre_enfermedad;
    private String Tratamiento_aplicado;
    private String observaciones;
    
    public Enfermedades() {
        
    }

    public String getCodigo_enfermedad() {
        return codigo_enfermedad;
    }

    public void setCodigo_enfermedad(String codigo_enfermedad) {
        this.codigo_enfermedad = codigo_enfermedad;
    }

    public String getCorral() {
        return corral;
    }

    public void setCorral(String corral) {
        this.corral = corral;
    }

    public String getFecha_registro() {
        return Fecha_registro;
    }

    public void setFecha_registro(String Fecha_registro) {
        this.Fecha_registro = Fecha_registro;
    }

    public String getHumedad_del_terreno() {
        return Humedad_del_terreno;
    }

    public void setHumedad_del_terreno(String Humedad_del_terreno) {
        this.Humedad_del_terreno = Humedad_del_terreno;
    }

    public String getNombre_enfermedad() {
        return Nombre_enfermedad;
    }

    public void setNombre_enfermedad(String Nombre_enfermedad) {
        this.Nombre_enfermedad = Nombre_enfermedad;
    }

    public String getTratamiento_aplicado() {
        return Tratamiento_aplicado;
    }

    public void setTratamiento_aplicado(String Tratamiento_aplicado) {
        this.Tratamiento_aplicado = Tratamiento_aplicado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
