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
public class RegStockDAO{
    
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;


    public List listar() {
        List<RegStock> lista = new ArrayList<>();
        String sql = "select * from regstock ";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                RegStock cat = new RegStock();
                cat.setId(rs.getInt(1));
                cat.setIdProducto(rs.getInt(2));
                cat.setCantidad(rs.getInt(3));
                cat.setFecha(rs.getTimestamp(4));
                
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }
    


    public int add(RegStock rs) {
        int r=0;
       String sql="insert into regstock (IdProStock,CantStock) values (?,?)"; 
       try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, rs.getIdProducto());
            ps.setInt(2, rs.getCantidad());

          
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
       
       return r; 
    }

 
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public int eliminar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
