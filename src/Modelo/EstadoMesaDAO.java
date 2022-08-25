/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class EstadoMesaDAO implements CRUD {
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<EstadoMesa> lista = new ArrayList<>();
        String sql = "select * from estado_mesa where EstMesEstReg <> '*'";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                EstadoMesa em = new EstadoMesa();
                em.setId(rs.getInt(1));
                em.setNom(rs.getString(2));
                em.setEstado(rs.getString(3));
                lista.add(em);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }

    
    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into estado_mesa (EstMesDes,EstMesEstReg) values (?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            r=ps.executeUpdate();
            cn.con.close();
        } catch (Exception e){
            
        }
        return r;
        
    }

    @Override
    public int actualizar(Object[] o) {
        
        int r=0;
        String sql="update estado_mesa set EstMesDes=?,EstMesEstReg=? where EstMesCod =?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
        return r;
        
    }

    @Override
    public int eliminar(Object[] o) {
        int r=0;
        String sql="update estado_mesa set EstMesEstReg=? where EstMesCod=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
        return r;
    }
    
    
    
}
