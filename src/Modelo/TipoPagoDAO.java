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
public class TipoPagoDAO {
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public int add(Object[] o) {
        int r=0;
        String sql="insert into tipo_pago(NomTiPa,IdVenTiPa,CantTiPa,EstRegTiPa) values(?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            
            r=ps.executeUpdate();
            cn.con.close();
        } catch (Exception e){
            
        }
        return r;
        
    }
    
    public List listarxIdVent(int idv) {
        
         List<TipoPago> lista = new ArrayList<>();
        String sql = "select * from tipo_pago where IdVenTiPa=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idv);
            
            rs=ps.executeQuery();
            while(rs.next()){
                TipoPago cat = new TipoPago();
                cat.setNombre(rs.getString(2));
                cat.setIdVenta(rs.getInt(3));
                cat.setCantidad(rs.getDouble(4));                
                cat.setEstado(rs.getString(5));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    
    public List listarxTipo(String tp,int idv) {
        
         List<TipoPago> lista = new ArrayList<>();
        String sql = "select * from tipo_pago where IdVenTiPa=? and NomTiPa=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idv);
            ps.setString(2, tp);
            
            rs=ps.executeQuery();
            while(rs.next()){
                TipoPago cat = new TipoPago();
                cat.setNombre(rs.getString(2));
                cat.setIdVenta(rs.getInt(3));
                cat.setCantidad(rs.getDouble(4));                
                cat.setEstado(rs.getString(5));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    public int actualizarTipoPago(Object[] o) {
        int r=0;
        String sql="update producto set NomPro=?,DesPro=?,PrecPro=?,CatProCod=?,EstRegPro=?,StockPro=? where IdPro=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
        return r;
    }
    
    public void eliminarTipoPago(int idVen) {
        
        String sql="DELETE FROM tipo_pago WHERE IdVenTiPa=?";
        
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idVen);
            ps.executeUpdate();
            cn.con.close();
            
        } catch(Exception e){
            
        }
        
    }
}    
    
    



