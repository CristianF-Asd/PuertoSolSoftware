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
public class ClienteDAO implements CRUD {
    
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {   
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from cliente where EstRegCli <> '*'";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cat = new Cliente();
                cat.setId(rs.getInt(1));
                cat.setNombre(rs.getString(2));
                cat.setApellidos(rs.getString(3));
                cat.setDireccion(rs.getString(4));
                cat.setDNI(rs.getString(5));
                cat.setRazonSocial(rs.getString(6));
                cat.setRUC(rs.getString(7));
                cat.setEmail(rs.getString(8));
                cat.setTelefono(rs.getString(9));
                cat.setEstado(rs.getString(10));
                lista.add(cat);
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return lista;
    }

    
    public Cliente ClientexId(int id) {
        
        Cliente a = new Cliente();
        
        String sql = "select * from cliente where IdCli=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                a.setId(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setApellidos(rs.getString(3));
                a.setDireccion(rs.getString(4));
                a.setDNI(rs.getString(5));
                a.setRazonSocial(rs.getString(6));
                a.setRUC(rs.getString(7));
                a.setEmail(rs.getString(8));
                a.setTelefono(rs.getString(9));
                a.setEstado(rs.getString(10));
             
            }
            cn.con.close();
        } catch(Exception e){
            
        }
        return a;
    }
    
    
    @Override
    public int add(Object[] o) {
        
        int r=0;
        String sql="insert into cliente(NomCli,ApeCli,DirCli,DniCli,RaSoCli,RucFacCli,EmailCli,TelCli,EstRegCli)values(?,?,?,?,?,?,?,?,?)";
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
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
            r=ps.executeUpdate();
            cn.con.close();
        } catch (Exception e){
            
        }
        return r;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update cliente set NomCli=?,ApeCli=?,DirCli=?,DniCli=?,RaSoCli=?,RucFacCli=?,EmailCli=?,TelCli=?,EstRegCli=? where IdCli=?";
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
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
            ps.setObject(10, o[9]);
            r=ps.executeUpdate();
            cn.con.close();
        }catch(Exception e){
            
        }
        return r;
    }

    @Override
    public int eliminar(Object[] o) {
        int r=0;
        String sql="update cliente set EstRegCli=? where IdCli=?";
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
