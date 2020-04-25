/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author carra
 */
public class Gerente extends Empleado{
    public Empleado empleado1;
    public Empleado empleado2;
    public Empleado empleado3;

    public Gerente(Empleado empleado1, Empleado empleado2, Empleado empleado3, String nombre, String apellido) {
        super(nombre, apellido);
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        this.empleado3 = empleado3;
    }
}
