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
public class Pizzeria extends Empresa{
    public double ganancias;

    public Pizzeria(double ganancias, String nombre, String tipo, String direccion) {
        super(nombre, tipo, direccion);
        this.ganancias = ganancias;
    }
    
    public String iniciando(){
        return "Encendiendo hornos";
    }
}
