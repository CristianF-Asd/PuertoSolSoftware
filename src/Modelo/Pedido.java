/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Cristian
 */
public class Pedido {
    int id;
    double total;
    int venta;
    int mesa;
    int esPedido;
    String mozo;
    String especificaciones;
    String estado;

    public Pedido() {
    }

    public Pedido(int id, double total, int venta, int mesa, int esPedido, String mozo, String especificaciones, String estado) {
        this.id = id;
        this.total = total;
        this.venta = venta;
        this.mesa = mesa;
        this.esPedido = esPedido;
        this.mozo = mozo;
        this.especificaciones = especificaciones;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getEsPedido() {
        return esPedido;
    }

    public void setEsPedido(int esPedido) {
        this.esPedido = esPedido;
    }

    public String getMozo() {
        return mozo;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
    
    
}
