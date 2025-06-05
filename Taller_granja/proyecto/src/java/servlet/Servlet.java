/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Enfermedades;
import modelo.Huertos;
import modelo.Producto;
import modelo.conexion;

/**
 *
 * @author DIEGO
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dato = request.getParameter("dato");
        if ("produccion".equals(dato)){
            String codigo_cultivo=request.getParameter("codigo_cultivo");
            String tipo_cultivo=request.getParameter("tipocultivo");
            String metodo_produccion=request.getParameter("metodoproduccion");
            String frecuencia_produccion=request.getParameter("frecuenciaprodu");
            Producto objProducto=new Producto();
            objProducto.setCodigo_cultivo(codigo_cultivo);
            objProducto.setTipo_cultivo(tipo_cultivo);
            objProducto.setMetodo_produccion(metodo_produccion);
            objProducto.setFrecuencia_produccion(frecuencia_produccion);
            conexion objconexion=new conexion();
            try {
                objconexion.recibirProductos(codigo_cultivo, tipo_cultivo, metodo_produccion, frecuencia_produccion);               System.out.println("pene");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }else if("huertos".equals(dato)){
            int id_corral=Integer.parseInt(request.getParameter("id_corral"));
            String produccion=request.getParameter("produccion");
            String ubicacion_huerto=request.getParameter("ubicacion_huerto");
            Huertos objHuertos=new Huertos();
            objHuertos.setId_corral(id_corral);
            objHuertos.setProduccion(produccion);
            objHuertos.setUbicacion_huerto(ubicacion_huerto);
            conexion objconexion=new conexion();
            try {
                objconexion.recibirHuertos(id_corral,produccion,ubicacion_huerto);
            } catch (SQLException ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if("enfermedades".equals(dato)){
            System.out.println("ala");
            String codigo_enfermedad=request.getParameter("codigo_enfermedad");
            String corral=request.getParameter("corral");
            String Fecha_registro=request.getParameter("Fecha_registro");
            String Humedad_del_terreno=request.getParameter("Humedad_del_terreno");
            String Nombre_enfermedad=request.getParameter("Nombre_enfermedad");
            String Tratamiento_aplicado=request.getParameter("Tratamiento_aplicado");
            String observaciones=request.getParameter("observaciones");
            Enfermedades objEnfermedades=new Enfermedades();
            objEnfermedades.setCodigo_enfermedad(codigo_enfermedad);
            objEnfermedades.setCorral(corral);
            objEnfermedades.setFecha_registro(Fecha_registro);
            objEnfermedades.setHumedad_del_terreno(Humedad_del_terreno);
            objEnfermedades.setNombre_enfermedad(Nombre_enfermedad);
            objEnfermedades.setTratamiento_aplicado(Tratamiento_aplicado);
            objEnfermedades.setObservaciones(observaciones);
            conexion objconexion=new conexion();
            try {
                objconexion.recibirEnfermedades(codigo_enfermedad,corral,Fecha_registro,Humedad_del_terreno,Nombre_enfermedad,Tratamiento_aplicado,observaciones);
            } catch (SQLException ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
