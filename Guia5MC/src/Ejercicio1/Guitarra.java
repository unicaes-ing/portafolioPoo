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
public class Guitarra extends Instrumento{
    public String numCuerdas;

    public Guitarra(String nombre, String color, String tipo) {
        super(nombre, color, tipo);
        numCuerdas = "6";
    }
    
    public void Sonar(){
        JOptionPane.showMessageDialog(null, "Sonando");
    }
}
