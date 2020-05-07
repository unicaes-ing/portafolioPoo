/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Interfaces.CalcularEdificio;
import Interfaces.InformacionEdificio;
import javax.swing.JOptionPane;

/**
 *
 * @author carra
 */
public class Edificio extends Construccion implements CalcularEdificio, InformacionEdificio{
    private double altura;
    private double base;
    
    public Edificio(String tipoEdificio, int niveles, String cliente, String arquitecto, double altura, double base) {
        super(tipoEdificio, niveles, cliente, arquitecto);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double CalcPerimetro(double largo, double ancho) {
        return 2 * (largo + ancho);
    }

    @Override
    public double CalcArea() {
        return this.base * this.altura;
    }

    @Override
    public void MostrarEdificio(double perimetro, double area) {
        JOptionPane.showMessageDialog(null, "Perimetro: "+perimetro+"\nArea: "+area);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
}
