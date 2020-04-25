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
public class EmpleadoAsalariado extends Empleado{
    private double salario;

    public EmpleadoAsalariado(double salario, String nombre, int edad, String dui) {
        super(nombre, edad, dui);
        this.salario = salario;
    }

    @Override
    public void saludar() {
        JOptionPane.showMessageDialog(null, "Hola soy un empleado asalariado");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
