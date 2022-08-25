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
public class ProductoDAO implements CRUD {
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    public String NombrePro(int id){
        String nombre="";
        String sql="select NomPro from producto where IdPro=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            
            rs=ps.executeQuery();
            while (rs.next()){
                nombre=rs.getString(1);
            }
            cn.con.close();
        }catch(Exception e){
            
        }
        return nombre;
    }
    public double PrecPro(int id){
        double nombre=0;
        String sql="select PrecPro from producto where IdPro=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            
            rs=ps.executeQuery();
            while (rs.next()){
                nombre=rs.getDouble(1);
            }
            cn.con.close();
        }catch(Exception e){
            
        }
        return nombre;
    }
    
    public Producto listarID(int id){
        Producto pro = new Producto();
        String sql="select * from producto where IdPro=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            
            while (rs.next()){
                pro.setId(rs.getInt(1));
                pro.setNom(rs.getString(2));
                pro.setDes(rs.getString(3));
                pro.setPrec(rs.getDouble(4));
                pro.setCat(rs.getInt(5));
                pro.setEstado(rs.getString(6));
                
            }
            cn.con.close();
            
        } catch(Exception e){
            
        }
        return pro;        
    }
    
    public List listarProxCat(int idcat){
        
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from producto where EstRegPro <> '*' and CatProCod=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idcat);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto pro = new Producto();
                pro.setId(rs.getInt(1));
                pro.setNom(rs.getString(2));
                pro.setPrec(rs.getDouble(4));
                pro.setStock(rs.getInt(7));
                lista.add(pro);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }

    
    public List listarCat(){
        List<Categoria> lista = new ArrayList<>();
        String sql = "select * from categoria where EstRegCat <> '*'";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Categoria cat = new Categoria();
                cat.setId(rs.getInt(1));
                cat.setNombreCat(rs.getString(2));
                cat.setEstado(rs.getString(3));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }

    @Override
    public List listar() {
        
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from producto where EstRegPro <> '*'";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto cat = new Producto();
                cat.setId(rs.getInt(1));
                cat.setNom(rs.getString(2));
                cat.setDes(rs.getString(3));
                cat.setPrec(rs.getDouble(4));
                cat.setCat(rs.getInt(5));
                cat.setEstado(rs.getString(6));
                cat.setStock(rs.getInt(7));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into producto(NomPro,DesPro,PrecPro,CatProCod,EstRegPro,StockPro) values(?,?,?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r=ps.executeUpdate();
            cn.con.close();
        } catch (Exception e){
            
        }
        return r;
        
    }

    @Override
    public int actualizar(Object[] o) {
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

    @Override
    public int eliminar(Object[] o) {
        int r=0;
        String sql="update producto set EstRegPro=? where IdPro=?";
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
    
    public int getStock(int id){
        int r=0;
      
        
        String sql="select StockPro from producto where IdPro=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            
            rs=ps.executeQuery();
            while (rs.next()){
                r=rs.getInt(1);
            }
            cn.con.close();
        }catch(Exception e){
            
        }
        return r;
    }
    
    public int getCat(int id){
        int r=0;
      
        
        String sql="select CatProCod from producto where IdPro=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            
            rs=ps.executeQuery();
            while (rs.next()){
                r=rs.getInt(1);
            }
            cn.con.close();
        }catch(Exception e){
            
        }
        return r;
    }
    public int actualizarStock(int id,int cant){
        int r=0;
      
        String sql="update producto set StockPro=? where IdPro=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, cant);
            ps.setObject(2, id);
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
        return r;
    }
    
}
