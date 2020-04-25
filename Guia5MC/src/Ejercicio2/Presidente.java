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
public class Presidente extends Empleado{
    public Gerente gerente1;
    public Gerente gerent2;

    public Presidente(Gerente gerente1, Gerente gerent2, String nombre, String apellido) {
        super(nombre, apellido);
        this.gerente1 = gerente1;
        this.gerent2 = gerent2;
    }
}
