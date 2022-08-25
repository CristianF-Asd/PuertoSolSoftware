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
public class Venta {
    
    int Id;
    double PrecioTotal;
    Timestamp fecha;
    String Estado;
    double Descuento;

    public Venta() {
    }

    public Venta(int Id, double PrecioTotal, Timestamp fecha, String Estado, double Descuento) {
        this.Id = Id;
        this.PrecioTotal = PrecioTotal;
        this.fecha = fecha;
        this.Estado = Estado;
        this.Descuento = Descuento;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    
    
    
    
}
