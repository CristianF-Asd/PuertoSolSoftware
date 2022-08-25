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
public class MesaDAO implements CRUD{
    
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    public String NoMesa(int id){
        String no = "";
        String sql="select NumMe from mesa where IdMe=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            
            rs=ps.executeQuery();
            while (rs.next()){
                no=rs.getString(1);
            }
            cn.con.close();
        }catch(Exception e){
            
        }
        return no;
    }
    
    public int IdMesa(String nom){
        int no = 0;
        String sql="select IdMe from mesa where NumMe=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, nom);
            
            rs=ps.executeQuery();
            while (rs.next()){
                no=rs.getInt(1);
            }
            cn.con.close();
        }catch(Exception e){
            
        }
        return no;
    }
    
    public List listarEstMes() {
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
    
    public List listarporEstMes(int i) {
        List<Mesa> lista = new ArrayList<>();
        String sql = "select * from mesa where EstRegMe <> '*' and EstMe=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, i);
            rs=ps.executeQuery();
            while(rs.next()){
                Mesa em = new Mesa();
                em.setId(rs.getInt(1));
                em.setEstMesa(rs.getInt(3));
                lista.add(em);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    

    @Override
    public List listar() {
        List<Mesa> lista = new ArrayList<>();
        String sql = "select * from mesa where EstRegMe <> '*'";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Mesa cat = new Mesa();
                cat.setId(rs.getInt(1));
                cat.setNumme(rs.getString(2));
                cat.setEstMesa(rs.getInt(3));
                cat.setEstado(rs.getString(4));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int actualizarId(int id) {
        
        int r=0;
        String sql="update mesa set EstMe=? where IdMe=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, 2);
            ps.setObject(2, id);
            
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
        return r;        
    } 
    
    
    public int actualizarIdBar(int id) {
        
        int r=0;
        String sql="update mesa set EstMe=? where IdMe=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, 3);
            ps.setObject(2, id);
            
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
        return r;        
    } 
    
    public int actualizarIdCocina(int id) {
        
        int r=0;
        String sql="update mesa set EstMe=? where IdMe=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, 3);
            ps.setObject(2, id);
            
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
        return r;        
    } 
    public int actualizarIdCaja(int id) {
        
        int r=0;
        String sql="update mesa set EstMe=? where IdMe=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, 1);
            ps.setObject(2, id);
            
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
        return r;        
    } 
}
