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
 * Clase categoria que conecta 
 * con la base de datos para realizar 
 * doferentes consultas referidas a la clase categoria
 */
public class CategoriaDAO implements CRUD{
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    
    //Selecciona de la base de datos todas las categorias que esten activas 
    @Override
    public List listar(){
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

    
    
    
    //Inserta en la base de datos una nueva categoria
    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into categoria(NomCat,EstRegCat)values(?,?)";
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
    
    
    //Actualiza una categoria
    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update categoria set NomCat=?,EstRegCat=? where IdCat=?";
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
    
    
    //Axtualiza una categoria a inactivo 
    @Override
    public int eliminar(Object[] o) {
        int r=0;
        String sql="update categoria set EstRegCat=? where IdCat=?";
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
