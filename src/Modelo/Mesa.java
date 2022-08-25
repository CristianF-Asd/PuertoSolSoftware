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
public class Mesa {
    int id;
    String numme;
    int estMesa;
    String estado;

    public Mesa(int id, String numme, int estMesa, String estado) {
        this.id = id;
        this.numme = numme;
        this.estMesa = estMesa;
        this.estado = estado;
    }

    public Mesa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumme() {
        return numme;
    }

    public void setNumme(String numme) {
        this.numme = numme;
    }

    public int getEstMesa() {
        return estMesa;
    }

    public void setEstMesa(int estMesa) {
        this.estMesa = estMesa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
