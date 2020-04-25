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
public class PagoContado extends Pago{
    public PagoContado(String nombre, String banco) {
        super(nombre, banco);
    }

    @Override
    public double pago(double monto) {
        return monto *= 1.13;
    }
    
    public String mensaje(){
        return "Usted debe acercarse a al banco a pagar: ";
    }
}
