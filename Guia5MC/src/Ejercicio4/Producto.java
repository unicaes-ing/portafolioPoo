/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author carra
 */
public class Producto {
    public String nombre;
    public String tipo;
    public double precio;
    public String categoria;

    public Producto(String nombre, String tipo, double precio, String categoria) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.categoria = categoria;
    }
}
