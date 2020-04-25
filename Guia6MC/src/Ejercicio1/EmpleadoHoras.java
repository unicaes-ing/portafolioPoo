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
public class EmpleadoHoras extends Empleado{
    private int horas;

    public EmpleadoHoras(int horas, String nombre, int edad, String dui) {
        super(nombre, edad, dui);
        this.horas = horas;
    }
    
    @Override
    public void saludar() {
        JOptionPane.showMessageDialog(null, "Hola, soy un empleado por horas y he trabado : "+ this.horas+ " horas");
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
