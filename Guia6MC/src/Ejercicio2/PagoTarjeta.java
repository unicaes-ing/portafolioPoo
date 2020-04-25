/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author carra
 */
public class PagoTarjeta extends Pago{
    private String nTarjeta;
    private double montoTarjeta=2000;

    public PagoTarjeta(String nTarjeta, String nombre, String banco) {
        super(nombre, banco);
        this.nTarjeta = nTarjeta;
    }

    @Override
    public double pago(double monto) {
        this.montoTarjeta = montoTarjeta - monto;
        if (this.montoTarjeta <= 0) {
            JOptionPane.showMessageDialog(null, "Usted no posee capital en su tarjeta");
        }
        return monto *= 1.13;
    }
    
    public String mensaje(){
        return "Usted debe acercarse a al banco a pagar: ";
    }

    public String getnTarjeta() {
        return nTarjeta;
    }

    public void setnTarjeta(String nTarjeta) {
        this.nTarjeta = nTarjeta;
    }
}
