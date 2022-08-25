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
public class RegStock {
    int Id;
    int IdProducto;
    int Cantidad;
    Timestamp fecha;

    public RegStock() {
    }

    public RegStock(int Id, int IdProducto, int Cantidad, Timestamp fecha) {
        this.Id = Id;
        this.IdProducto = IdProducto;
        this.Cantidad = Cantidad;
        this.fecha = fecha;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
    
    
    
}
