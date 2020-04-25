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
public class Industria extends Empresa{
    public int cantMaquinas;

    public Industria(String nombre, String tipo, String direccion, int cantMaquinas) {
        super(nombre, tipo, direccion);
        this.cantMaquinas = cantMaquinas;
    }
    
    public String iniciando(){
        return "Encendiendo maquinaria";
    }
}
