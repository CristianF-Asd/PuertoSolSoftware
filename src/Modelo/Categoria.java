/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Cristian
 * Clase Categoria
 */
public class Categoria {

    int Id;
    String NombreCat;
    String Estado;

    public Categoria() {
    }

    
    public Categoria(int Id, String NombreCat, String Estado) {
        this.Id = Id;
        this.NombreCat = NombreCat;
        this.Estado = Estado;
    }

    public int getId() {
        return Id;
    }

    public String getNombreCat() {
        return NombreCat;
    }

    public String getEstado() {
        return Estado;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombreCat(String NombreCat) {
        this.NombreCat = NombreCat;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    
}
