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
public class EntidadUsuario {
    int Id;
    String Nombre;
    String Apellidos;
    String Direccion;
    String DNI;
    String Email;
    String IdLogin;
    String Constrasena;
    int rol;
    String EstadoRegistro;

    public EntidadUsuario() {
    }
    
    

    public EntidadUsuario(int Id, String Nombre, String Apellidos, String Direccion, String DNI, String Email, String IdLogin, String Constrasena, int rol, String EstadoRegistro) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.DNI = DNI;
        this.Email = Email;
        this.IdLogin = IdLogin;
        this.Constrasena = Constrasena;
        this.rol = rol;
        this.EstadoRegistro = EstadoRegistro;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public String getEmail() {
        return Email;
    }

    public String getIdLogin() {
        return IdLogin;
    }

    public String getConstrasena() {
        return Constrasena;
    }

    public int getRol() {
        return rol;
    }

    public String getEstadoRegistro() {
        return EstadoRegistro;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setIdLogin(String IdLogin) {
        this.IdLogin = IdLogin;
    }

    public void setConstrasena(String Constrasena) {
        this.Constrasena = Constrasena;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public void setEstadoRegistro(String EstadoRegistro) {
        this.EstadoRegistro = EstadoRegistro;
    }
    
    
        
           
}
