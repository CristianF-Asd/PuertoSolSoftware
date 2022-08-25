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
public class PedidoDAO {
    
    
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    public String IdPedido(){
        String idv="";
        String sql="select max(IdPed) from pedido";
        try {
           con=cn.Conectar();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               idv=rs.getString(1);
           }
           cn.con.close();
        }catch (Exception e){
            
        }
        return idv;
    }
    
    public List listarPedidosActuales() {
        
        List<Pedido> lista = new ArrayList<>();
        String sql = "select * from pedido where EstRegPed <> '*' and EstPed <> 3";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Pedido cat = new Pedido();
                cat.setId(rs.getInt(1));
                cat.setTotal(rs.getDouble(2));
                cat.setVenta(rs.getInt(3));
                cat.setMesa(rs.getInt(4));
                cat.setEsPedido(rs.getInt(6));
                cat.setMozo(rs.getString(7));
                cat.setEstado(rs.getString(8));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    
    public Pedido IDPedidoxMesa2(int idmesa){
        Pedido cat = new Pedido();
        String sql="select * from pedido where MesaPed=? ORDER BY IdPed DESC";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idmesa);
            
            rs=ps.executeQuery();
            while (rs.next()){
                cat.setId(rs.getInt(1));
                cat.setTotal(rs.getDouble(2));
                cat.setVenta(rs.getInt(3));
                cat.setMesa(rs.getInt(4));
                cat.setEsPedido(rs.getInt(6));
                cat.setMozo(rs.getString(7));
                cat.setEstado(rs.getString(8));
            }
            cn.con.close();
        }catch(Exception e){
            
        }
        return cat;
    }
    
    public int IDPedidoxMesa(int id){
        int no=0;
        String sql="select IdPed from pedido where MesaPed=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            
            rs=ps.executeQuery();
            while (rs.next()){
                no=rs.getInt(1);
            }
            cn.con.close();
        }catch(Exception e){
            
        }
        return no;
    }
    
    public int GuardarPedidoLlevar(Object[] o){
        
        String sql="insert into pedido(TotalPed,EstPed,MozoPed,EspPed,EstRegPed) values(?,?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            
           
            //ps.setDouble(1, p.getTotal());
            //ps.setInt(2, p.getMesa());
            //ps.setInt(3,p.getEsPedido());
            //ps.setString(4, p.getMozo());
            //ps.setString(5,p.getEstado());
            r=ps.executeUpdate();
            cn.con.close();
            
        }   catch(Exception e){
            
        }     
         return r;       
    }
    public int GuardarPedido(Object[] o){
        
        String sql="insert into pedido(TotalPed,MesaPed,EstPed,MozoPed,EspPed,EstRegPed) values(?,?,?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
           
            //ps.setDouble(1, p.getTotal());
            //ps.setInt(2, p.getMesa());
            //ps.setInt(3,p.getEsPedido());
            //ps.setString(4, p.getMozo());
            //ps.setString(5,p.getEstado());
            r=ps.executeUpdate();
            cn.con.close();
            
        }   catch(Exception e){
            
        }     
         return r;       
    }
    
    public int GuardarDetallePedido(DetallePedido dp){
        String sql="insert into pedido_detalle(IdDetPed,IdProDetPed,CantDetPed,ValDetPed,EstRegDetPed) values (?,?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dp.getDetallePed());
            ps.setInt(2, dp.getIdProducto());
            ps.setInt(3, dp.getCantidad());
            ps.setDouble(4, dp.getTotal());
            //ps.setString(5, current_timestamp());
            ps.setString(5, dp.getEstado());
            r=ps.executeUpdate();
            cn.con.close();
            
        }catch(Exception e){
            
        }
        
        return r;
    }
    
    public List listarPedidos() {
        
        List<Pedido> lista = new ArrayList<>();
        String sql = "select * from pedido where EstRegPed <> '*' and EstPed = 1";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Pedido cat = new Pedido();
                cat.setId(rs.getInt(1));
                cat.setTotal(rs.getDouble(2));
                cat.setVenta(rs.getInt(3));
                cat.setMesa(rs.getInt(4));
                cat.setEsPedido(rs.getInt(6));
                cat.setMozo(rs.getString(7));
                cat.setEstado(rs.getString(8));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    
    
    public List listarPedidosxId2() {
        
        List<Pedido> lista = new ArrayList<>();
        String sql = "select * from pedido where EstRegPed <> '*' and EstPed <>1 and VenPed is NULL and MesaPed is NULL";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Pedido cat = new Pedido();
                cat.setId(rs.getInt(1));
                cat.setTotal(rs.getDouble(2));
                cat.setVenta(rs.getInt(3));
                cat.setMesa(rs.getInt(4));
                cat.setEsPedido(rs.getInt(6));
                cat.setMozo(rs.getString(7));
                cat.setEstado(rs.getString(8));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    
    
    
    public List listarPedidosxId(int id) {
        
        List<Pedido> lista = new ArrayList<>();
        String sql = "select * from pedido where EstRegPed <> '*' and IdPed=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                Pedido cat = new Pedido();
                cat.setId(rs.getInt(1));
                cat.setTotal(rs.getDouble(2));
                cat.setVenta(rs.getInt(3));
                cat.setMesa(rs.getInt(4));
                cat.setEsPedido(rs.getInt(6));
                cat.setMozo(rs.getString(7));
                cat.setEstado(rs.getString(8));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    
    public List listarPedidosxMesa(int id) {
        
        List<Pedido> lista = new ArrayList<>();
        String sql = "select * from pedido where EstRegPed <> '*' and MesaPed=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                Pedido cat = new Pedido();
                cat.setId(rs.getInt(1));
                cat.setTotal(rs.getDouble(2));
                cat.setVenta(rs.getInt(3));
                cat.setMesa(rs.getInt(4));
                cat.setEsPedido(rs.getInt(6));
                cat.setMozo(rs.getString(7));
                cat.setEstado(rs.getString(8));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    
    public List listarPedidosxIdVent(int id) {
        
        List<Pedido> lista = new ArrayList<>();
        String sql = "select * from pedido where EstRegPed <> '*' and 	VenPed=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                Pedido cat = new Pedido();
                cat.setId(rs.getInt(1));
                cat.setTotal(rs.getDouble(2));
                cat.setVenta(rs.getInt(3));
                cat.setMesa(rs.getInt(4));
                cat.setEsPedido(rs.getInt(6));
                cat.setMozo(rs.getString(7));
                cat.setEstado(rs.getString(8));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    
     public Pedido PedidosxId(int id) {
        
        Pedido cat = new Pedido();
        String sql = "select * from pedido where EstRegPed <> '*' and IdPed=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                
                cat.setId(rs.getInt(1));
                cat.setTotal(rs.getDouble(2));
                cat.setVenta(rs.getInt(3));
                cat.setMesa(rs.getInt(4));
                cat.setEsPedido(rs.getInt(6));
                cat.setMozo(rs.getString(7));
                cat.setEstado(rs.getString(8));
                
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return cat;
    }
    
    
    
    
    public List listarDetPedidos(int id){
        
        List<DetallePedido> lista = new ArrayList<>();
        String sql = "select * from pedido_detalle where EstRegDetPed <> '*' and IdDetPed=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                DetallePedido cat = new DetallePedido();
                cat.setDetallePed(rs.getInt(2));
                cat.setIdProducto(rs.getInt(3));
                cat.setCantidad(rs.getInt(4));
                cat.setTotal(rs.getDouble(5));
                cat.setFecha2(rs.getTimestamp(6));
                cat.setEstado(rs.getString(7));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
        
    }
    
    
    public int updateCocina(int id) {
        int r=0;
        String sql="update pedido set EstPed=? where IdPed=?";
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
    
    public int updateCaja(int id) {
        int r=0;
        String sql="update pedido set EstPed=? where IdPed=?";
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
    
    public int updateIdVenta(int idVen,int idPed) {
        
     
        int r=0;
        String sql="update pedido set VenPed=?,MesaPed= NULL where IdPed=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, idVen);
            ps.setObject(2, idPed);
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
        return r; 
    }
    
    
    public int updateTotal(double  total,int idPed) {
        
     
        int r=0;
        String sql="update pedido set TotalPed=? where IdPed=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, total);
            ps.setObject(2, idPed);
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
        return r; 
    }
    
    public void eliminarPedidoDetalle(int idPed) {
        
        String sql="DELETE FROM pedido_detalle WHERE IdDetPed=?";
        
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idPed);
            ps.executeUpdate();
            cn.con.close();
            
        } catch(Exception e){
            
        }
        
    }
    
    
    
    
}
