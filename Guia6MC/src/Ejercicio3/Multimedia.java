/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author carra
 */
public class Multimedia {
    private String formato;
    private String fechaCreacion;

    public Multimedia(String formato, String fechaCreacion) {
        this.formato = formato;
        this.fechaCreacion = fechaCreacion;
    }
    
    public String reproducir(){
        return "El archivo multimedia se está reproduciendo";
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
}
