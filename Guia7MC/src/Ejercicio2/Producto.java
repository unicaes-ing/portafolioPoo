/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author carra
 */
public class Producto implements Caducidad, Impuesto{
    public double costo;
    public String fechaCaducidad;
    public double impuestoIva;
    public Double total;

    @Override
    public String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMM/YYYY");
        return formatoFecha.format(fecha);
    }

    @Override
    public double calcImpuesto(double costo) {
        return costo * 0.13;
    }

    @Override
    public double calcTotal(double costo) {
        return costo + this.impuestoIva;
    }
    
    
}
