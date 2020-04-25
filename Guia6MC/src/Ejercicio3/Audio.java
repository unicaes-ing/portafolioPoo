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
public class Audio extends Multimedia{
    private String nombre;
    private String duracion;

    public Audio(String nombre, String duracion, String formato, String fechaCreacion) {
        super(formato, fechaCreacion);
        this.nombre = nombre;
        this.duracion = duracion;
    }

    @Override
    public String reproducir() {
        return "El archivo " + this.nombre+ " está sonando";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
}
