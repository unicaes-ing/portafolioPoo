/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author carra
 */
public abstract class Construccion {
    private String tipoEdificio;
    private int niveles;
    private String cliente;
    private String arquitecto;

    public Construccion(String tipoEdificio, int niveles, String cliente, String arquitecto) {
        this.tipoEdificio = tipoEdificio;
        this.niveles = niveles;
        this.cliente = cliente;
        this.arquitecto = arquitecto;
    }

    public String getTipoEdificio() {
        return tipoEdificio;
    }

    public void setTipoEdificio(String tipoEdificio) {
        this.tipoEdificio = tipoEdificio;
    }

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getArquitecto() {
        return arquitecto;
    }

    public void setArquitecto(String arquitecto) {
        this.arquitecto = arquitecto;
    }
    
    
}
