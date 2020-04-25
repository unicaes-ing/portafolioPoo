/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author carra
 */
public class EmpleadoComision extends Empleado{
    private double cantVentas;

    public EmpleadoComision(double cantVentas, String nombre, int edad, String dui) {
        super(nombre, edad, dui);
        this.cantVentas = cantVentas;
    }
    
    @Override
    public void saludar() {
        JOptionPane.showMessageDialog(null, "Hola soy un empleado por comision");
    }

    public double getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(double cantVentas) {
        this.cantVentas = cantVentas;
    }
}
