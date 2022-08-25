/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class DetallePedido {
    
    int detallePed;
    int IdProducto;
    int cantidad;
    double total;
   
    String estado;
    Timestamp fecha2;

   
    
    public DetallePedido() {
    }

    public DetallePedido(int detallePed, int IdProducto, int cantidad, double total, String estado, Timestamp fecha2) {
        this.detallePed = detallePed;
        this.IdProducto = IdProducto;
        this.cantidad = cantidad;
        this.total = total;
        this.estado = estado;
        this.fecha2 = fecha2;
    }

    public int getDetallePed() {
        return detallePed;
    }

    public void setDetallePed(int detallePed) {
        this.detallePed = detallePed;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Timestamp getFecha2() {
        return fecha2;
    }

    public void setFecha2(Timestamp fecha2) {
        this.fecha2 = fecha2;
    }
    
    
    
    
    
}
