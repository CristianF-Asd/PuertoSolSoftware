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
public class VentaDAO implements CRUD{
    
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;

    @Override
    public List listar() {
         List<Venta> lista = new ArrayList<>();
        String sql = "select * from venta where EstRegVent <> '*'";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Venta cat = new Venta();
                cat.setId(rs.getInt(1));
                cat.setFecha(rs.getTimestamp(2));
                cat.setPrecioTotal(rs.getDouble(3));
                cat.setDescuento(rs.getDouble(5));                
                cat.setEstado(rs.getString(6));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    
    public List listarxFecha(String fech) {
        
         List<Venta> lista = new ArrayList<>();
        String sql = "select * from venta where FechaVent between '"+fech+" 00:00:00' and '"+fech+" 23:59:59'";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();
            while(rs.next()){
                Venta cat = new Venta();
                cat.setId(rs.getInt(1));
                cat.setFecha(rs.getTimestamp(2));
                cat.setPrecioTotal(rs.getDouble(3));
                cat.setDescuento(rs.getDouble(5));                
                cat.setEstado(rs.getString(6));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    
    
    

    @Override
    public int add(Object[] o) {
        String sql="insert into venta(PrecTotVent,DescVent,EstRegVent) values(?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);      
        
            r=ps.executeUpdate();
            cn.con.close();
        }   catch(Exception e){
            
        }     
         return r;
    }
    public int IdVenta(){
        int idv=0;
        String sql="select max(IdVent) from venta";
        try {
           con=cn.Conectar();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               idv=rs.getInt(1);
           }
           cn.con.close();
        }catch (Exception e){
            
        }
        return idv;
    }
    
    public Venta VentaxId(int id) {
        
        Venta ven = new Venta();
        String sql = "select * from venta where EstRegVent <> '*' and IdVent=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                ven.setId(rs.getInt(1));
                ven.setFecha(rs.getTimestamp(2));
                ven.setPrecioTotal(rs.getDouble(3));
                ven.setDescuento(rs.getDouble(5));
                
                
                
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return ven;
    }
    
    

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
