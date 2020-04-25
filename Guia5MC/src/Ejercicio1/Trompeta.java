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
public class Trompeta extends Instrumento{
    public Trompeta(String nombre, String color, String tamaño) {
        super(nombre, color, tamaño);
    }

    public void Sonar(){
        JOptionPane.showMessageDialog(null, "Sonando la trompeta");
    }
}
