/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Cristian
 */
public class UsuarioDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    
   
    
    Conexion con= new Conexion();
    Connection acceso;
   
    public EntidadUsuario ValidarUsuarioCajero(String id,String cont){
        EntidadUsuario eu = new EntidadUsuario();
        String sql="select * from usuario where IdLogUsu=? and ContrUsu=? and RolUsu=2";
        try{
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, cont);
            rs=ps.executeQuery();
            while(rs.next()){
                eu.setId(rs.getInt(1));
                eu.setNombre(rs.getString(2));
                eu.setApellidos(rs.getString(3));
                eu.setDireccion(rs.getString(4));
                eu.setDNI(rs.getString(5));
                eu.setEmail(rs.getString(6));
                eu.setIdLogin(rs.getString(7));
                eu.setConstrasena(rs.getString(8));
                eu.setRol(rs.getInt(9));
                eu.setEstadoRegistro(rs.getString(10));        
            } 
            
            
        } catch (Exception e){
            
        }
        
        
        return eu;
        
    }
}
