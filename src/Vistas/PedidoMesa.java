/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.Mesa;
import Modelo.MesaDAO;
import Modelo.Pedido;
import Modelo.PedidoDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian
 */
public class PedidoMesa extends javax.swing.JInternalFrame {
    
    MesaDAO dao= new MesaDAO();
    Mesa me = new Mesa();
    DefaultTableModel modelo = new DefaultTableModel();
    Pedido pe = new Pedido();
    PedidoDAO ped = new PedidoDAO();
    List<Mesa> lista=dao.listar();
    public static String mes="";
    /**
     * Creates new form PedidoMesa
     */
    public PedidoMesa() {
        initComponents();

        listar();
    }
    
    void listar(){
        
        
        
        //l1
        if(lista.get(0).getEstMesa()==2){
            jButtonl1.setBackground(Color.red);
            //jButtonl1.setEnabled(false);
            jButtonl1.setText("<html><center>Mesa L1<br />"+ped.IDPedidoxMesa2(1).getMozo()+"</center></html>");
        }
        if(lista.get(0).getEstMesa()==3){
            jButtonl1.setBackground(Color.yellow);
            jButtonl1.setText("<html><center>Mesa L1<br />"+ped.IDPedidoxMesa2(1).getMozo()+"</center></html>");
            //jButtonl1.setEnabled(false);
        }
        //l2
        if(lista.get(1).getEstMesa()==2){
            jButtonl2.setBackground(Color.red);
            jButtonl2.setText("<html><center>Mesa L2<br />"+ped.IDPedidoxMesa2(2).getMozo()+"</center></html>");
            //jButtonl2.setEnabled(false);
            
        }
        if(lista.get(1).getEstMesa()==3){
            jButtonl2.setBackground(Color.yellow);
            jButtonl2.setText("<html><center>Mesa L2<br />"+ped.IDPedidoxMesa2(2).getMozo()+"</center></html>");
            //jButtonl2.setEnabled(false);
        }
        //l3
        if(lista.get(2).getEstMesa()==2){
            jButtonl3.setBackground(Color.red);
            jButtonl3.setText("<html><center>Mesa L3<br />"+ped.IDPedidoxMesa2(3).getMozo()+"</center></html>");
            //jButtonl3.setEnabled(false);
            
        }
        if(lista.get(2).getEstMesa()==3){
            jButtonl3.setBackground(Color.yellow);
            jButtonl3.setText("<html><center>Mesa L3<br />"+ped.IDPedidoxMesa2(3).getMozo()+"</center></html>");
            //jButtonl3.setEnabled(false);
        }
        //l4
        if(lista.get(3).getEstMesa()==2){
            jButtonl4.setBackground(Color.red);
            jButtonl4.setText("<html><center>Mesa L4<br />"+ped.IDPedidoxMesa2(4).getMozo()+"</center></html>");
            //jButtonl4.setEnabled(false);
            
        }
        if(lista.get(3).getEstMesa()==3){
            jButtonl4.setBackground(Color.yellow);
            jButtonl4.setText("<html><center>Mesa L4<br />"+ped.IDPedidoxMesa2(4).getMozo()+"</center></html>");
            //jButtonl4.setEnabled(false);
        }
        //l5
        if(lista.get(4).getEstMesa()==2){
            jButtonl5.setBackground(Color.red);
            jButtonl5.setText("<html><center>Mesa L5<br />"+ped.IDPedidoxMesa2(5).getMozo()+"</center></html>");
            //jButtonl5.setEnabled(false);
            
        }
        if(lista.get(4).getEstMesa()==3){
            jButtonl5.setBackground(Color.yellow);
            jButtonl5.setText("<html><center>Mesa L5<br />"+ped.IDPedidoxMesa2(5).getMozo()+"</center></html>");
            //jButtonl5.setEnabled(false);
        }
        //l6
        if(lista.get(5).getEstMesa()==2){
            jButtonl6.setBackground(Color.red);
            jButtonl6.setText("<html><center>Mesa L6<br />"+ped.IDPedidoxMesa2(6).getMozo()+"</center></html>");
            //jButtonl6.setEnabled(false);
            
        }
        if(lista.get(5).getEstMesa()==3){
            jButtonl6.setBackground(Color.yellow);
            jButtonl6.setText("<html><center>Mesa L6<br />"+ped.IDPedidoxMesa2(6).getMozo()+"</center></html>");
            //jButtonl6.setEnabled(false);
        }
        //l7
        if(lista.get(6).getEstMesa()==2){
            jButtonl7.setBackground(Color.red);
            jButtonl7.setText("<html><center>Mesa L7<br />"+ped.IDPedidoxMesa2(7).getMozo()+"</center></html>");
            //jButtonl7.setEnabled(false);
            
        }
        if(lista.get(6).getEstMesa()==3){
            jButtonl7.setBackground(Color.yellow);
            jButtonl7.setText("<html><center>Mesa L7<br />"+ped.IDPedidoxMesa2(7).getMozo()+"</center></html>");
            //jButtonl7.setEnabled(false);
        }
        //l8
        if(lista.get(7).getEstMesa()==2){
            jButtonl8.setBackground(Color.red);
            jButtonl8.setText("<html><center>Mesa L8<br />"+ped.IDPedidoxMesa2(8).getMozo()+"</center></html>");
            //jButtonl8.setEnabled(false);
            
        }
        if(lista.get(7).getEstMesa()==3){
            jButtonl8.setBackground(Color.yellow);
            jButtonl8.setText("<html><center>Mesa L8<br />"+ped.IDPedidoxMesa2(8).getMozo()+"</center></html>");
            //jButtonl8.setEnabled(false);
        }
        //l9
        if(lista.get(8).getEstMesa()==2){
            jButtonl9.setBackground(Color.red);
            jButtonl9.setText("<html><center>Mesa L9<br />"+ped.IDPedidoxMesa2(9).getMozo()+"</center></html>");
            //jButtonl9.setEnabled(false);
            
        }
        if(lista.get(8).getEstMesa()==3){
            jButtonl9.setBackground(Color.yellow);
            jButtonl9.setText("<html><center>Mesa L9<br />"+ped.IDPedidoxMesa2(9).getMozo()+"</center></html>");
            //jButtonl9.setEnabled(false);
        }
        //l10
        if(lista.get(9).getEstMesa()==2){
            jButtonl10.setBackground(Color.red);
            jButtonl10.setText("<html><center>Mesa L10<br />"+ped.IDPedidoxMesa2(10).getMozo()+"</center></html>");
            //jButtonl10.setEnabled(false);
            
        }
        if(lista.get(9).getEstMesa()==3){
            jButtonl10.setBackground(Color.yellow);
            jButtonl10.setText("<html><center>Mesa L10<br />"+ped.IDPedidoxMesa2(10).getMozo()+"</center></html>");
            //jButtonl10.setEnabled(false);
        }
        //l11
        if(lista.get(10).getEstMesa()==2){
            jButtonl11.setBackground(Color.red);
            jButtonl11.setText("<html><center>Mesa L11<br />"+ped.IDPedidoxMesa2(11).getMozo()+"</center></html>");
            
            //jButtonl11.setEnabled(false);
            
        }
        if(lista.get(10).getEstMesa()==3){
            jButtonl11.setBackground(Color.yellow);
            jButtonl11.setText("<html><center>Mesa L11<br />"+ped.IDPedidoxMesa2(11).getMozo()+"</center></html>");
            //jButtonl11.setEnabled(false);
        }
        //l12
        if(lista.get(11).getEstMesa()==2){
            jButtonl12.setBackground(Color.red);
            jButtonl12.setText("<html><center>Mesa L12<br />"+ped.IDPedidoxMesa2(12).getMozo()+"</center></html>");
            //jButtonl12.setEnabled(false);
            
        }
        if(lista.get(11).getEstMesa()==3){
            jButtonl12.setBackground(Color.yellow);
            jButtonl12.setText("<html><center>Mesa L12<br />"+ped.IDPedidoxMesa2(12).getMozo()+"</center></html>");
            //jButtonl12.setEnabled(false);
        }
        //l13
        if(lista.get(12).getEstMesa()==2){
            jButtonl13.setBackground(Color.red);
            jButtonl13.setText("<html><center>Mesa L13<br />"+ped.IDPedidoxMesa2(13).getMozo()+"</center></html>");
            //jButtonl13.setEnabled(false);
            
        }
        if(lista.get(12).getEstMesa()==3){
            jButtonl13.setBackground(Color.yellow);
            jButtonl13.setText("<html><center>Mesa L13<br />"+ped.IDPedidoxMesa2(13).getMozo()+"</center></html>");
            //jButtonl13.setEnabled(false);
        }
        //l14
        if(lista.get(13).getEstMesa()==2){
            jButtonl14.setBackground(Color.red);
            jButtonl14.setText("<html><center>Mesa L14<br />"+ped.IDPedidoxMesa2(14).getMozo()+"</center></html>");
            //jButtonl14.setEnabled(false);
            
        }
        if(lista.get(13).getEstMesa()==3){
            jButtonl14.setBackground(Color.yellow);
            jButtonl14.setText("<html><center>Mesa L14<br />"+ped.IDPedidoxMesa2(14).getMozo()+"</center></html>");
            //jButtonl14.setEnabled(false);
        }
        //l15
        if(lista.get(14).getEstMesa()==2){
            jButtonl15.setBackground(Color.red);
            jButtonl15.setText("<html><center>Mesa L15<br />"+ped.IDPedidoxMesa2(15).getMozo()+"</center></html>");
            //jButtonl15.setEnabled(false);
            
        }
        if(lista.get(14).getEstMesa()==3){
            jButtonl15.setBackground(Color.yellow);
            jButtonl15.setText("<html><center>Mesa L15<br />"+ped.IDPedidoxMesa2(15).getMozo()+"</center></html>");
            //jButtonl15.setEnabled(false);
        }
        //p1
        if(lista.get(15).getEstMesa()==2){
            jButtonp1.setBackground(Color.red);
            jButtonp1.setText("<html><center>Mesa P1<br />"+ped.IDPedidoxMesa2(16).getMozo()+"</center></html>");
            //jButtonp1.setEnabled(false);
            
        }
        if(lista.get(15).getEstMesa()==3){
            jButtonp1.setBackground(Color.yellow);
            jButtonp1.setText("<html><center>Mesa P1<br />"+ped.IDPedidoxMesa2(16).getMozo()+"</center></html>");
            //jButtonp1.setEnabled(false);
        }
        //p2
        if(lista.get(16).getEstMesa()==2){
            jButtonp2.setBackground(Color.red);
            jButtonp2.setText("<html><center>Mesa P2<br />"+ped.IDPedidoxMesa2(17).getMozo()+"</center></html>");
            //jButtonp2.setEnabled(false);
            
        }
        if(lista.get(16).getEstMesa()==3){
            jButtonp2.setBackground(Color.yellow);
            jButtonp2.setText("<html><center>Mesa P2<br />"+ped.IDPedidoxMesa2(17).getMozo()+"</center></html>");
            //jButtonp2.setEnabled(false);
        }
        //p3
        if(lista.get(17).getEstMesa()==2){
            jButtonp3.setBackground(Color.red);
            jButtonp3.setText("<html><center>Mesa P3<br />"+ped.IDPedidoxMesa2(18).getMozo()+"</center></html>");
            //jButtonp3.setEnabled(false);
            
        }
        if(lista.get(17).getEstMesa()==3){
            jButtonp3.setBackground(Color.yellow);
            jButtonp3.setText("<html><center>Mesa P3<br />"+ped.IDPedidoxMesa2(18).getMozo()+"</center></html>");
            //jButtonp3.setEnabled(false);
        }
        //p4
        if(lista.get(18).getEstMesa()==2){
            jButtonp4.setBackground(Color.red);
            jButtonp4.setText("<html><center>Mesa P4<br />"+ped.IDPedidoxMesa2(19).getMozo()+"</center></html>");
            //jButtonp4.setEnabled(false);
            
        }
        if(lista.get(18).getEstMesa()==3){
            jButtonp4.setBackground(Color.yellow);
            jButtonp4.setText("<html><center>Mesa P4<br />"+ped.IDPedidoxMesa2(19).getMozo()+"</center></html>");

            //jButtonp4.setEnabled(false);
        }
        //p5
        if(lista.get(19).getEstMesa()==2){
            jButtonp5.setBackground(Color.red);
            jButtonp5.setText("<html><center>Mesa P5<br />"+ped.IDPedidoxMesa2(20).getMozo()+"</center></html>");
            //jButtonp5.setEnabled(false);
            
        }
        if(lista.get(19).getEstMesa()==3){
            jButtonp5.setBackground(Color.yellow);
            jButtonp5.setText("<html><center>Mesa P5<br />"+ped.IDPedidoxMesa2(20).getMozo()+"</center></html>");
            //jButtonp5.setEnabled(false);
        }
        //p6
        if(lista.get(20).getEstMesa()==2){
            jButtonp6.setBackground(Color.red);
            jButtonp6.setText("<html><center>Mesa P6<br />"+ped.IDPedidoxMesa2(21).getMozo()+"</center></html>");
            //jButtonp6.setEnabled(false);
            
        }
        if(lista.get(20).getEstMesa()==3){
            jButtonp6.setBackground(Color.yellow);
            jButtonp6.setText("<html><center>Mesa P6<br />"+ped.IDPedidoxMesa2(21).getMozo()+"</center></html>");
            //jButtonp6.setEnabled(false);
        }
        //p7
        if(lista.get(21).getEstMesa()==2){
            jButtonp7.setBackground(Color.red);
            jButtonp7.setText("<html><center>Mesa P7<br />"+ped.IDPedidoxMesa2(22).getMozo()+"</center></html>");
            //jButtonp7.setEnabled(false);
            
        }
        if(lista.get(21).getEstMesa()==3){
            jButtonp7.setBackground(Color.yellow);
            jButtonp7.setText("<html><center>Mesa P7<br />"+ped.IDPedidoxMesa2(22).getMozo()+"</center></html>");
            //jButtonp7.setEnabled(false);
        }
        //p8
        if(lista.get(22).getEstMesa()==2){
            jButtonp8.setBackground(Color.red);
            jButtonp8.setText("<html><center>Mesa P8<br />"+ped.IDPedidoxMesa2(23).getMozo()+"</center></html>");
            //jButtonp8.setEnabled(false);
            
        }
        if(lista.get(22).getEstMesa()==3){
            jButtonp8.setBackground(Color.yellow);
            jButtonp8.setText("<html><center>Mesa P8<br />"+ped.IDPedidoxMesa2(23).getMozo()+"</center></html>");
            //jButtonp8.setEnabled(false);
        }
        //p9
        if(lista.get(23).getEstMesa()==2){
            jButtonp9.setBackground(Color.red);
            jButtonp9.setText("<html><center>Mesa P9<br />"+ped.IDPedidoxMesa2(24).getMozo()+"</center></html>");
            //jButtonp9.setEnabled(false);
            
        }
        if(lista.get(23).getEstMesa()==3){
            jButtonp9.setBackground(Color.yellow);
            jButtonp9.setText("<html><center>Mesa P9<br />"+ped.IDPedidoxMesa2(24).getMozo()+"</center></html>");
            //jButtonp9.setEnabled(false);
        }
        //p10
        if(lista.get(24).getEstMesa()==2){
            jButtonp10.setBackground(Color.red);
            jButtonp10.setText("<html><center>Mesa P10<br />"+ped.IDPedidoxMesa2(25).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(24).getEstMesa()==3){
            jButtonp10.setBackground(Color.yellow);
            jButtonp10.setText("<html><center>Mesa P10<br />"+ped.IDPedidoxMesa2(25).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        
        //p11
        
        if(lista.get(35).getEstMesa()==2){
            jButtonp11.setBackground(Color.red);
            jButtonp11.setText("<html><center>Mesa P11<br />"+ped.IDPedidoxMesa2(36).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(35).getEstMesa()==3){
            jButtonp11.setBackground(Color.yellow);
             jButtonp11.setText("<html><center>Mesa P11<br />"+ped.IDPedidoxMesa2(36).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //p12
        if(lista.get(36).getEstMesa()==2){
            jButtonp12.setBackground(Color.red);
            jButtonp12.setText("<html><center>Mesa P12<br />"+ped.IDPedidoxMesa2(37).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(36).getEstMesa()==3){
            jButtonp12.setBackground(Color.yellow);
            jButtonp12.setText("<html><center>Mesa P12<br />"+ped.IDPedidoxMesa2(37).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        
        //p13
        if(lista.get(37).getEstMesa()==2){
            jButtonp13.setBackground(Color.red);
            jButtonp13.setText("<html><center>Mesa P13<br />"+ped.IDPedidoxMesa2(38).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(37).getEstMesa()==3){
            jButtonp13.setBackground(Color.yellow);
            jButtonp13.setText("<html><center>Mesa P13<br />"+ped.IDPedidoxMesa2(38).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //p14
        if(lista.get(38).getEstMesa()==2){
            jButtonp14.setBackground(Color.red);
            jButtonp14.setText("<html><center>Mesa P14<br />"+ped.IDPedidoxMesa2(39).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(38).getEstMesa()==3){
            jButtonp14.setBackground(Color.yellow);
            jButtonp14.setText("<html><center>Mesa P14<br />"+ped.IDPedidoxMesa2(39).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //p15
        if(lista.get(39).getEstMesa()==2){
            jButtonp15.setBackground(Color.red);
            jButtonp15.setText("<html><center>Mesa P15<br />"+ped.IDPedidoxMesa2(40).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(39).getEstMesa()==3){
            jButtonp15.setBackground(Color.yellow);
            jButtonp15.setText("<html><center>Mesa P15<br />"+ped.IDPedidoxMesa2(40).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        
        //t1
        if(lista.get(25).getEstMesa()==2){
            jButtont1.setBackground(Color.red);
            jButtont1.setText("<html><center>Mesa T1<br />"+ped.IDPedidoxMesa2(26).getMozo()+"</center></html>");
            //jButtont1.setEnabled(false);
            
        }
        if(lista.get(25).getEstMesa()==3){
            jButtont1.setBackground(Color.yellow);
            jButtont1.setText("<html><center>Mesa T1<br />"+ped.IDPedidoxMesa2(26).getMozo()+"</center></html>");
            
            //jButtont1.setEnabled(false);
        }
        //t2
        if(lista.get(26).getEstMesa()==2){
            jButtont2.setBackground(Color.red);
            jButtont2.setText("<html><center>Mesa T2<br />"+ped.IDPedidoxMesa2(27).getMozo()+"</center></html>");
            //jButtont2.setEnabled(false);
            
        }
        if(lista.get(26).getEstMesa()==3){
            jButtont2.setBackground(Color.yellow);
            jButtont2.setText("<html><center>Mesa T2<br />"+ped.IDPedidoxMesa2(27).getMozo()+"</center></html>");
            //jButtont2.setEnabled(false);
        }
        //t3
        if(lista.get(27).getEstMesa()==2){
            jButtont3.setBackground(Color.red);
            jButtont3.setText("<html><center>Mesa T3<br />"+ped.IDPedidoxMesa2(28).getMozo()+"</center></html>");
            //jButtont3.setEnabled(false);
            
        }
        if(lista.get(27).getEstMesa()==3){
            jButtont3.setBackground(Color.yellow);
            jButtont3.setText("<html><center>Mesa T3<br />"+ped.IDPedidoxMesa2(28).getMozo()+"</center></html>");
            //jButtont3.setEnabled(false);
        }
        //t4
        if(lista.get(28).getEstMesa()==2){
            jButtont4.setBackground(Color.red);
            jButtont4.setText("<html><center>Mesa T4<br />"+ped.IDPedidoxMesa2(29).getMozo()+"</center></html>");
            //jButtont4.setEnabled(false);
            
        }
        if(lista.get(28).getEstMesa()==3){
            jButtont4.setBackground(Color.yellow);
            jButtont4.setText("<html><center>Mesa T4<br />"+ped.IDPedidoxMesa2(29).getMozo()+"</center></html>");
            //jButtont4.setEnabled(false);
        }
        //t5
        if(lista.get(29).getEstMesa()==2){
            jButtont5.setBackground(Color.red);
            jButtont5.setText("<html><center>Mesa T5<br />"+ped.IDPedidoxMesa2(30).getMozo()+"</center></html>");
            //jButtont5.setEnabled(false);
            
        }
        if(lista.get(29).getEstMesa()==3){
            jButtont5.setBackground(Color.yellow);
            jButtont5.setText("<html><center>Mesa T5<br />"+ped.IDPedidoxMesa2(30).getMozo()+"</center></html>");
            //jButtont5.setEnabled(false);
        }
        //t6
        if(lista.get(30).getEstMesa()==2){
            jButtont6.setBackground(Color.red);
            jButtont6.setText("<html><center>Mesa T6<br />"+ped.IDPedidoxMesa2(31).getMozo()+"</center></html>");
            //jButtont6.setEnabled(false);
            
        }
        if(lista.get(30).getEstMesa()==3){
            jButtont6.setBackground(Color.yellow);
            jButtont6.setText("<html><center>Mesa T6<br />"+ped.IDPedidoxMesa2(31).getMozo()+"</center></html>");
            //jButtont6.setEnabled(false);
        }
        //t7
        if(lista.get(31).getEstMesa()==2){
            jButtont7.setBackground(Color.red);
            jButtont7.setText("<html><center>Mesa T7<br />"+ped.IDPedidoxMesa2(32).getMozo()+"</center></html>");
            //jButtont7.setEnabled(false);
            
        }
        if(lista.get(31).getEstMesa()==3){
            jButtont7.setBackground(Color.yellow);
            jButtont7.setText("<html><center>Mesa T7<br />"+ped.IDPedidoxMesa2(32).getMozo()+"</center></html>");
            //jButtont7.setEnabled(false);
        }
        //t8
        if(lista.get(32).getEstMesa()==2){
            jButtont8.setBackground(Color.red);
            jButtont8.setText("<html><center>Mesa T8<br />"+ped.IDPedidoxMesa2(33).getMozo()+"</center></html>");
            //jButtont8.setEnabled(false);
            
        }
        if(lista.get(32).getEstMesa()==3){
            jButtont8.setBackground(Color.yellow);
            jButtont8.setText("<html><center>Mesa T8<br />"+ped.IDPedidoxMesa2(33).getMozo()+"</center></html>");
            //jButtont8.setEnabled(false);
        }
        //t9
        if(lista.get(33).getEstMesa()==2){
            jButtont9.setBackground(Color.red);
            jButtont9.setText("<html><center>Mesa T9<br />"+ped.IDPedidoxMesa2(34).getMozo()+"</center></html>");
            //jButtont9.setEnabled(false);
            
        }
        if(lista.get(33).getEstMesa()==3){
            jButtont9.setBackground(Color.yellow);
            jButtont9.setText("<html><center>Mesa T9<br />"+ped.IDPedidoxMesa2(34).getMozo()+"</center></html>");
            //jButtont9.setEnabled(false);
        }
        //t10
        if(lista.get(34).getEstMesa()==2){
            jButtont10.setBackground(Color.red);
            jButtont10.setText("<html><center>Mesa T10<br />"+ped.IDPedidoxMesa2(35).getMozo()+"</center></html>");
            //jButtont10.setEnabled(false);
            
        }
        if(lista.get(34).getEstMesa()==3){
            jButtont10.setBackground(Color.yellow);
            jButtont10.setText("<html><center>Mesa T10<br />"+ped.IDPedidoxMesa2(35).getMozo()+"</center></html>");
            //jButtont10.setEnabled(false);
        }
        //t11
        if(lista.get(40).getEstMesa()==2){
            jButtont11.setBackground(Color.red);
            jButtont11.setText("<html><center>Mesa T11<br />"+ped.IDPedidoxMesa2(41).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(40).getEstMesa()==3){
            jButtont11.setBackground(Color.yellow);
            jButtont11.setText("<html><center>Mesa T11<br />"+ped.IDPedidoxMesa2(41).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //t12
        if(lista.get(41).getEstMesa()==2){
            jButtont12.setBackground(Color.red);
            jButtont12.setText("<html><center>Mesa T12<br />"+ped.IDPedidoxMesa2(42).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(41).getEstMesa()==3){
            jButtont12.setBackground(Color.yellow);
            jButtont12.setText("<html><center>Mesa T12<br />"+ped.IDPedidoxMesa2(42).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //t13
        if(lista.get(42).getEstMesa()==2){
            jButtont13.setBackground(Color.red);
            jButtont13.setText("<html><center>Mesa T13<br />"+ped.IDPedidoxMesa2(43).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(42).getEstMesa()==3){
            jButtont13.setBackground(Color.yellow);
            jButtont13.setText("<html><center>Mesa T13<br />"+ped.IDPedidoxMesa2(43).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //t14
        if(lista.get(43).getEstMesa()==2){
            jButtont14.setBackground(Color.red);
            jButtont14.setText("<html><center>Mesa T14<br />"+ped.IDPedidoxMesa2(44).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(43).getEstMesa()==3){
            jButtont14.setBackground(Color.yellow);
            jButtont14.setText("<html><center>Mesa T14<br />"+ped.IDPedidoxMesa2(44).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //t15
        if(lista.get(44).getEstMesa()==2){
            jButtont15.setBackground(Color.red);
            jButtont15.setText("<html><center>Mesa T15<br />"+ped.IDPedidoxMesa2(45).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(44).getEstMesa()==3){
            jButtont15.setBackground(Color.yellow);
            jButtont15.setText("<html><center>Mesa T15<br />"+ped.IDPedidoxMesa2(45).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //t16
        if(lista.get(45).getEstMesa()==2){
            jButtont16.setBackground(Color.red);
            jButtont16.setText("<html><center>Mesa T16<br />"+ped.IDPedidoxMesa2(46).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(45).getEstMesa()==3){
            jButtont16.setBackground(Color.yellow);
            jButtont16.setText("<html><center>Mesa T16<br />"+ped.IDPedidoxMesa2(46).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //t17
        if(lista.get(46).getEstMesa()==2){
            jButtont17.setBackground(Color.red);
            jButtont17.setText("<html><center>Mesa T17<br />"+ped.IDPedidoxMesa2(47).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(46).getEstMesa()==3){
            jButtont17.setBackground(Color.yellow);
            jButtont17.setText("<html><center>Mesa T17<br />"+ped.IDPedidoxMesa2(47).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //t18
        if(lista.get(47).getEstMesa()==2){
            jButtont18.setBackground(Color.red);
            jButtont18.setText("<html><center>Mesa T18<br />"+ped.IDPedidoxMesa2(48).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(47).getEstMesa()==3){
            jButtont18.setBackground(Color.yellow);
            jButtont18.setText("<html><center>Mesa T18<br />"+ped.IDPedidoxMesa2(48).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //F1
        if(lista.get(48).getEstMesa()==2){
            jButtonF1.setBackground(Color.red);
            jButtonF1.setText("<html><center>LA SALLE<br />"+ped.IDPedidoxMesa2(49).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(48).getEstMesa()==3){
            jButtonF1.setBackground(Color.yellow);
            jButtonF1.setText("<html><center>LA SALLE<br />"+ped.IDPedidoxMesa2(49).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
     
        //F2
        if(lista.get(49).getEstMesa()==2){
            jButtonF2.setBackground(Color.red);
            jButtonF2.setText("<html><center>LA NEGRA<br />"+ped.IDPedidoxMesa2(50).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(49).getEstMesa()==3){
            jButtonF2.setBackground(Color.yellow);
            jButtonF2.setText("<html><center>LA NEGRA<br />"+ped.IDPedidoxMesa2(50).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //F3
        if(lista.get(50).getEstMesa()==2){
            jButtonF3.setBackground(Color.red);
            jButtonF3.setText("<html><center>DOS Y DOS<br />"+ped.IDPedidoxMesa2(51).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(50).getEstMesa()==3){
            jButtonF3.setBackground(Color.yellow);
            jButtonF3.setText("<html><center>DOS Y DOS<br />"+ped.IDPedidoxMesa2(51).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //F4
        if(lista.get(51).getEstMesa()==2){
            jButtonF4.setBackground(Color.red);
            jButtonF4.setText("<html><center>BLUSKIN<br />"+ped.IDPedidoxMesa2(52).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(51).getEstMesa()==3){
            jButtonF4.setBackground(Color.yellow);
            jButtonF4.setText("<html><center>BLUSKIN<br />"+ped.IDPedidoxMesa2(52).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //F5
        if(lista.get(52).getEstMesa()==2){
            jButtonF5.setBackground(Color.red);
            jButtonF5.setText("<html><center>PURA LECHE<br />"+ped.IDPedidoxMesa2(53).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(52).getEstMesa()==3){
            jButtonF5.setBackground(Color.yellow);
            jButtonF5.setText("<html><center>PURA LECHE<br />"+ped.IDPedidoxMesa2(53).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //F6
        if(lista.get(53).getEstMesa()==2){
            jButtonF6.setBackground(Color.red);
            jButtonF6.setText("<html><center>TOTTENHAM<br />"+ped.IDPedidoxMesa2(54).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(53).getEstMesa()==3){
            jButtonF6.setBackground(Color.yellow);
            jButtonF6.setText("<html><center>TOTTENHAM<br />"+ped.IDPedidoxMesa2(54).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //F7
        if(lista.get(54).getEstMesa()==2){
            jButtonF7.setBackground(Color.red);
            jButtonF7.setText("<html><center>JUNIORS<br />"+ped.IDPedidoxMesa2(55).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(54).getEstMesa()==3){
            jButtonF7.setBackground(Color.yellow);
            jButtonF7.setText("<html><center>JUNIORS<br />"+ped.IDPedidoxMesa2(55).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //F8
        if(lista.get(55).getEstMesa()==2){
            jButtonF8.setBackground(Color.red);
            jButtonF8.setText("<html><center> LOS PIBES<br />"+ped.IDPedidoxMesa2(56).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(55).getEstMesa()==3){
            jButtonF8.setBackground(Color.yellow);
            jButtonF8.setText("<html><center>LOS PIBES<br />"+ped.IDPedidoxMesa2(56).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //F9
        if(lista.get(56).getEstMesa()==2){
            jButtonF9.setBackground(Color.red);
            jButtonF9.setText("<html><center>DIFESUR<br />"+ped.IDPedidoxMesa2(57).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(56).getEstMesa()==3){
            jButtonF9.setBackground(Color.yellow);
            jButtonF9.setText("<html><center>DIFESUR<br />"+ped.IDPedidoxMesa2(57).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //F10
        if(lista.get(57).getEstMesa()==2){
            jButtonF10.setBackground(Color.red);
            jButtonF10.setText("<html><center>SIGMA<br />"+ped.IDPedidoxMesa2(58).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(57).getEstMesa()==3){
            jButtonF10.setBackground(Color.yellow);
            jButtonF10.setText("<html><center>SIGMA<br />"+ped.IDPedidoxMesa2(58).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
        //F11
        if(lista.get(58).getEstMesa()==2){
            jButtonF11.setBackground(Color.red);
            jButtonF11.setText("<html><center>TRIBUNA<br />"+ped.IDPedidoxMesa2(59).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
            
        }
        if(lista.get(58).getEstMesa()==3){
            jButtonF11.setBackground(Color.yellow);
            jButtonF11.setText("<html><center>TRIBUNA<br />"+ped.IDPedidoxMesa2(59).getMozo()+"</center></html>");
            //jButtonp10.setEnabled(false);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonl1 = new javax.swing.JButton();
        jButtonl2 = new javax.swing.JButton();
        jButtonl3 = new javax.swing.JButton();
        jButtonl4 = new javax.swing.JButton();
        jButtonl5 = new javax.swing.JButton();
        jButtonl12 = new javax.swing.JButton();
        jButtonl14 = new javax.swing.JButton();
        jButtonl6 = new javax.swing.JButton();
        jButtonl7 = new javax.swing.JButton();
        jButtonl8 = new javax.swing.JButton();
        jButtonl9 = new javax.swing.JButton();
        jButtonl10 = new javax.swing.JButton();
        jButtonl13 = new javax.swing.JButton();
        jButtonl15 = new javax.swing.JButton();
        jButtonl11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtont1 = new javax.swing.JButton();
        jButtont2 = new javax.swing.JButton();
        jButtont3 = new javax.swing.JButton();
        jButtont4 = new javax.swing.JButton();
        jButtont5 = new javax.swing.JButton();
        jButtont6 = new javax.swing.JButton();
        jButtont7 = new javax.swing.JButton();
        jButtont8 = new javax.swing.JButton();
        jButtont9 = new javax.swing.JButton();
        jButtont10 = new javax.swing.JButton();
        jButtont11 = new javax.swing.JButton();
        jButtont12 = new javax.swing.JButton();
        jButtont13 = new javax.swing.JButton();
        jButtont14 = new javax.swing.JButton();
        jButtont15 = new javax.swing.JButton();
        jButtont16 = new javax.swing.JButton();
        jButtont17 = new javax.swing.JButton();
        jButtont18 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonp1 = new javax.swing.JButton();
        jButtonp2 = new javax.swing.JButton();
        jButtonp3 = new javax.swing.JButton();
        jButtonp4 = new javax.swing.JButton();
        jButtonp5 = new javax.swing.JButton();
        jButtonp6 = new javax.swing.JButton();
        jButtonp7 = new javax.swing.JButton();
        jButtonp8 = new javax.swing.JButton();
        jButtonp9 = new javax.swing.JButton();
        jButtonp10 = new javax.swing.JButton();
        jButtonp11 = new javax.swing.JButton();
        jButtonp12 = new javax.swing.JButton();
        jButtonp13 = new javax.swing.JButton();
        jButtonp14 = new javax.swing.JButton();
        jButtonp15 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonF1 = new javax.swing.JButton();
        jButtonF2 = new javax.swing.JButton();
        jButtonF3 = new javax.swing.JButton();
        jButtonF4 = new javax.swing.JButton();
        jButtonF5 = new javax.swing.JButton();
        jButtonF7 = new javax.swing.JButton();
        jButtonF8 = new javax.swing.JButton();
        jButtonF9 = new javax.swing.JButton();
        jButtonF10 = new javax.swing.JButton();
        jButtonF6 = new javax.swing.JButton();
        jButtonF11 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("SELECCIONE LA MESA PARA HACER EL PEDIDO:");

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("PEDIDOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonl1.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl1.setText("MESA L1");
        jButtonl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl1ActionPerformed(evt);
            }
        });

        jButtonl2.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl2.setText("MESA L2");
        jButtonl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl2ActionPerformed(evt);
            }
        });

        jButtonl3.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl3.setText("MESA L3");
        jButtonl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl3ActionPerformed(evt);
            }
        });

        jButtonl4.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl4.setText("MESA L4");
        jButtonl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl4ActionPerformed(evt);
            }
        });

        jButtonl5.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl5.setText("MESA L5");
        jButtonl5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl5ActionPerformed(evt);
            }
        });

        jButtonl12.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl12.setText("MESA L12");
        jButtonl12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl12ActionPerformed(evt);
            }
        });

        jButtonl14.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl14.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl14.setText("MESA L14");
        jButtonl14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl14ActionPerformed(evt);
            }
        });

        jButtonl6.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl6.setText("MESA L6");
        jButtonl6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl6ActionPerformed(evt);
            }
        });

        jButtonl7.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl7.setText("MESA L7");
        jButtonl7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl7ActionPerformed(evt);
            }
        });

        jButtonl8.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl8.setText("MESA L8");
        jButtonl8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl8ActionPerformed(evt);
            }
        });

        jButtonl9.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl9.setText("MESA L9");
        jButtonl9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl9ActionPerformed(evt);
            }
        });

        jButtonl10.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl10.setText("MESA L10");
        jButtonl10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl10ActionPerformed(evt);
            }
        });

        jButtonl13.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl13.setText("MESA L13");
        jButtonl13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl13ActionPerformed(evt);
            }
        });

        jButtonl15.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl15.setText("MESA L15");
        jButtonl15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl15ActionPerformed(evt);
            }
        });

        jButtonl11.setBackground(new java.awt.Color(51, 255, 51));
        jButtonl11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonl11.setText("MESA L11");
        jButtonl11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonl11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonl1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonl2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonl6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonl3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jButtonl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonl11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonl12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonl13, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonl14, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jButtonl4, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jButtonl9, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonl5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jButtonl10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonl15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonl4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonl5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonl3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonl2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonl9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonl10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonl8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonl11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonl12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonl13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonl15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonl14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LOCAL", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtont1.setBackground(new java.awt.Color(51, 255, 51));
        jButtont1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont1.setText("MESA T1");
        jButtont1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont1ActionPerformed(evt);
            }
        });

        jButtont2.setBackground(new java.awt.Color(51, 255, 51));
        jButtont2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont2.setText("MESA T2");
        jButtont2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont2ActionPerformed(evt);
            }
        });

        jButtont3.setBackground(new java.awt.Color(51, 255, 51));
        jButtont3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont3.setText("MESA T3");
        jButtont3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont3ActionPerformed(evt);
            }
        });

        jButtont4.setBackground(new java.awt.Color(51, 255, 51));
        jButtont4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont4.setText("MSA T4");
        jButtont4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont4ActionPerformed(evt);
            }
        });

        jButtont5.setBackground(new java.awt.Color(51, 255, 51));
        jButtont5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont5.setText("MESA T5");
        jButtont5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont5ActionPerformed(evt);
            }
        });

        jButtont6.setBackground(new java.awt.Color(51, 255, 51));
        jButtont6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont6.setText("MESA T6");
        jButtont6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont6ActionPerformed(evt);
            }
        });

        jButtont7.setBackground(new java.awt.Color(51, 255, 51));
        jButtont7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont7.setText("MESA T7");
        jButtont7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont7ActionPerformed(evt);
            }
        });

        jButtont8.setBackground(new java.awt.Color(51, 255, 51));
        jButtont8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont8.setText("MESA T8");
        jButtont8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont8ActionPerformed(evt);
            }
        });

        jButtont9.setBackground(new java.awt.Color(51, 255, 51));
        jButtont9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont9.setText("MESA T9");
        jButtont9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont9ActionPerformed(evt);
            }
        });

        jButtont10.setBackground(new java.awt.Color(51, 255, 51));
        jButtont10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont10.setText("MESA T10");
        jButtont10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont10ActionPerformed(evt);
            }
        });

        jButtont11.setBackground(new java.awt.Color(51, 255, 51));
        jButtont11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont11.setText("MESA T11");
        jButtont11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont11ActionPerformed(evt);
            }
        });

        jButtont12.setBackground(new java.awt.Color(51, 255, 51));
        jButtont12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont12.setText("MESA T12");
        jButtont12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont12ActionPerformed(evt);
            }
        });

        jButtont13.setBackground(new java.awt.Color(51, 255, 51));
        jButtont13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont13.setText("MESA T13");
        jButtont13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont13ActionPerformed(evt);
            }
        });

        jButtont14.setBackground(new java.awt.Color(51, 255, 51));
        jButtont14.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont14.setText("MESA T14");
        jButtont14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont14ActionPerformed(evt);
            }
        });

        jButtont15.setBackground(new java.awt.Color(51, 255, 51));
        jButtont15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont15.setText("MESA T15");
        jButtont15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont15ActionPerformed(evt);
            }
        });

        jButtont16.setBackground(new java.awt.Color(51, 255, 51));
        jButtont16.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont16.setText("MESA T16");
        jButtont16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont16ActionPerformed(evt);
            }
        });

        jButtont17.setBackground(new java.awt.Color(51, 255, 51));
        jButtont17.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont17.setText("MESA T17");
        jButtont17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont17ActionPerformed(evt);
            }
        });

        jButtont18.setBackground(new java.awt.Color(51, 255, 51));
        jButtont18.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtont18.setText("MESA T18");
        jButtont18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtont18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtont1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtont2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtont7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtont13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtont14, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jButtont8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtont3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtont4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtont15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtont16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtont9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtont10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtont5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtont11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtont17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtont6, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jButtont12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtont18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtont1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtont2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtont3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtont4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtont5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtont6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtont10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtont11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtont12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtont9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtont14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtont15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtont16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtont17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtont18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtont7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtont8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtont13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("TERRAZA", jPanel3);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonp1.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp1.setText("MESA P1");
        jButtonp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp1ActionPerformed(evt);
            }
        });

        jButtonp2.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp2.setText("MESA P2");
        jButtonp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp2ActionPerformed(evt);
            }
        });

        jButtonp3.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp3.setText("MESA P3");
        jButtonp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp3ActionPerformed(evt);
            }
        });

        jButtonp4.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp4.setText("MSA P4");
        jButtonp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp4ActionPerformed(evt);
            }
        });

        jButtonp5.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp5.setText("MESA P5");
        jButtonp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp5ActionPerformed(evt);
            }
        });

        jButtonp6.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp6.setText("MESA P6");
        jButtonp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp6ActionPerformed(evt);
            }
        });

        jButtonp7.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp7.setText("MESA P7");
        jButtonp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp7ActionPerformed(evt);
            }
        });

        jButtonp8.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp8.setText("MESA P8");
        jButtonp8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp8ActionPerformed(evt);
            }
        });

        jButtonp9.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp9.setText("MESA P9");
        jButtonp9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp9ActionPerformed(evt);
            }
        });

        jButtonp10.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp10.setText("MESA P10");
        jButtonp10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp10ActionPerformed(evt);
            }
        });

        jButtonp11.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp11.setText("MESA P11");
        jButtonp11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp11ActionPerformed(evt);
            }
        });

        jButtonp12.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp12.setText("MESA P12");
        jButtonp12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp12ActionPerformed(evt);
            }
        });

        jButtonp13.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp13.setText("MESA P13");
        jButtonp13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp13ActionPerformed(evt);
            }
        });

        jButtonp14.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp14.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp14.setText("MESA P14");
        jButtonp14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp14ActionPerformed(evt);
            }
        });

        jButtonp15.setBackground(new java.awt.Color(51, 255, 51));
        jButtonp15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonp15.setText("MESA P15");
        jButtonp15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonp15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonp1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonp2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonp3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonp4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonp11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonp12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonp6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonp7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButtonp8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButtonp13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonp9, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jButtonp14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonp5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonp10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonp15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(193, 193, 193))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonp1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonp6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonp11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonp15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PISCINA", jPanel2);

        jButtonF1.setBackground(new java.awt.Color(51, 255, 51));
        jButtonF1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonF1.setText("LA SALLE");
        jButtonF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF1ActionPerformed(evt);
            }
        });

        jButtonF2.setBackground(new java.awt.Color(51, 255, 51));
        jButtonF2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonF2.setText("LA NEGRA");
        jButtonF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF2ActionPerformed(evt);
            }
        });

        jButtonF3.setBackground(new java.awt.Color(51, 255, 51));
        jButtonF3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonF3.setText("DOS Y DOS");
        jButtonF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF3ActionPerformed(evt);
            }
        });

        jButtonF4.setBackground(new java.awt.Color(51, 255, 51));
        jButtonF4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonF4.setText("BLUSKIN");
        jButtonF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF4ActionPerformed(evt);
            }
        });

        jButtonF5.setBackground(new java.awt.Color(51, 255, 51));
        jButtonF5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonF5.setText("PURA LECHE");
        jButtonF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF5ActionPerformed(evt);
            }
        });

        jButtonF7.setBackground(new java.awt.Color(51, 255, 51));
        jButtonF7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonF7.setText("JUNIORS");
        jButtonF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF7ActionPerformed(evt);
            }
        });

        jButtonF8.setBackground(new java.awt.Color(51, 255, 51));
        jButtonF8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonF8.setText("PIBES");
        jButtonF8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF8ActionPerformed(evt);
            }
        });

        jButtonF9.setBackground(new java.awt.Color(51, 255, 51));
        jButtonF9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonF9.setText("DIFESUR");
        jButtonF9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF9ActionPerformed(evt);
            }
        });

        jButtonF10.setBackground(new java.awt.Color(51, 255, 51));
        jButtonF10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonF10.setText("SIGMA");
        jButtonF10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF10ActionPerformed(evt);
            }
        });

        jButtonF6.setBackground(new java.awt.Color(51, 255, 51));
        jButtonF6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonF6.setText("TOTTENHAM");
        jButtonF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF6ActionPerformed(evt);
            }
        });

        jButtonF11.setBackground(new java.awt.Color(51, 255, 51));
        jButtonF11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonF11.setText("TRIBUNA");
        jButtonF11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonF7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonF2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonF3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonF4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonF5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonF6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonF8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonF9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonF10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonF11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonF1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonF7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FUTBOL", jPanel4);

        jButton17.setBackground(new java.awt.Color(255, 0, 0));
        jButton17.setText("CERRAR");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel3.setText("SELECCIONE LA MESA PARA HACER EL PEDIDO:");

        jLabel6.setText("En Mesa");

        jTextField3.setBackground(new java.awt.Color(255, 255, 0));
        jTextField3.setText("             ");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(204, 0, 0));
        jTextField2.setText("             ");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Despachando");

        jLabel4.setText("Disponible");

        jTextField1.setBackground(new java.awt.Color(0, 255, 102));
        jTextField1.setText("             ");

        jButton1.setText("PARA LLEVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(19, 19, 19)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl1ActionPerformed
        // TODO add your handling code here:
        mes="L1";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonl1ActionPerformed

    private void jButtonl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl2ActionPerformed
        // TODO add your handling code here:
        mes="L2";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl2ActionPerformed

    private void jButtonl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl3ActionPerformed
        // TODO add your handling code here:
        mes="L3";
        Pedidos ve = new Pedidos();
        Menu.VentanaPrincipal.add(ve);
        ve.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl3ActionPerformed

    private void jButtonl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl4ActionPerformed
        // TODO add your handling code here:
        mes="L4";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl4ActionPerformed

    private void jButtonl5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl5ActionPerformed
        // TODO add your handling code here:
        mes="L5";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl5ActionPerformed

    private void jButtonl12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl12ActionPerformed
        // TODO add your handling code here:
        mes="L12";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl12ActionPerformed

    private void jButtonl14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl14ActionPerformed
        // TODO add your handling code here:
        mes="L14";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl14ActionPerformed

    private void jButtonl6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl6ActionPerformed
        // TODO add your handling code here:
        mes="L6";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl6ActionPerformed

    private void jButtonl7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl7ActionPerformed
        // TODO add your handling code here:
        mes="L7";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl7ActionPerformed

    private void jButtonl8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl8ActionPerformed
        // TODO add your handling code here:
        mes="L8";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl8ActionPerformed

    private void jButtonl9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl9ActionPerformed
        // TODO add your handling code here:
        mes="L9";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl9ActionPerformed

    private void jButtonl10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl10ActionPerformed
        // TODO add your handling code here:
        mes="L10";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl10ActionPerformed

    private void jButtonl13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl13ActionPerformed
        // TODO add your handling code here:
        mes="L13";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl13ActionPerformed

    private void jButtonl15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl15ActionPerformed
        // TODO add your handling code here:
        mes="L15";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl15ActionPerformed

    private void jButtonl11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonl11ActionPerformed
        // TODO add your handling code here:
        mes="L11";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonl11ActionPerformed

    private void jButtonp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp1ActionPerformed
        // TODO add your handling code here:
        mes="P1";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp1ActionPerformed

    private void jButtonp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp2ActionPerformed
        // TODO add your handling code here:
        mes="P2";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp2ActionPerformed

    private void jButtonp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp3ActionPerformed
        // TODO add your handling code here:
        mes="P3";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp3ActionPerformed

    private void jButtonp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp4ActionPerformed
        // TODO add your handling code here:
        mes="P4";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp4ActionPerformed

    private void jButtonp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp5ActionPerformed
        // TODO add your handling code here:
        mes="P5";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp5ActionPerformed

    private void jButtonp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp6ActionPerformed
        // TODO add your handling code here:
        mes="P6";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp6ActionPerformed

    private void jButtonp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp7ActionPerformed
        // TODO add your handling code here:
        mes="P7";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp7ActionPerformed

    private void jButtonp8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp8ActionPerformed
        // TODO add your handling code here:
        mes="P8";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp8ActionPerformed

    private void jButtonp9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp9ActionPerformed
        // TODO add your handling code here:
        mes="P9";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp9ActionPerformed

    private void jButtonp10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp10ActionPerformed
        // TODO add your handling code here:
        mes="P10";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp10ActionPerformed

    private void jButtont1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont1ActionPerformed
        // TODO add your handling code here:
        mes="T1";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont1ActionPerformed

    private void jButtont2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont2ActionPerformed
        // TODO add your handling code here:
        mes="T2";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont2ActionPerformed

    private void jButtont3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont3ActionPerformed
        // TODO add your handling code here:
        mes="T3";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont3ActionPerformed

    private void jButtont4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont4ActionPerformed
        // TODO add your handling code here:
        mes="T4";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont4ActionPerformed

    private void jButtont5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont5ActionPerformed
        // TODO add your handling code here:
        mes="T5";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont5ActionPerformed

    private void jButtont6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont6ActionPerformed
        // TODO add your handling code here:
        mes="T6";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont6ActionPerformed

    private void jButtont7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont7ActionPerformed
        // TODO add your handling code here:
        mes="T7";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont7ActionPerformed

    private void jButtont8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont8ActionPerformed
        // TODO add your handling code here:
        mes="T8";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont8ActionPerformed

    private void jButtont9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont9ActionPerformed
        // TODO add your handling code here:
        mes="T9";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont9ActionPerformed

    private void jButtont10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont10ActionPerformed
        // TODO add your handling code here:
        mes="T10";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont10ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        dispose();
        

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mes="";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonp11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp11ActionPerformed
        // TODO add your handling code here:
        mes="P11";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp11ActionPerformed

    private void jButtonp12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp12ActionPerformed
        // TODO add your handling code here:
        mes="P12";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp12ActionPerformed

    private void jButtonp13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp13ActionPerformed
        // TODO add your handling code here:
        mes="P13";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp13ActionPerformed

    private void jButtonp14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp14ActionPerformed
        // TODO add your handling code here:
        mes="P14";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp14ActionPerformed

    private void jButtonp15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonp15ActionPerformed
        // TODO add your handling code here:
        mes="P15";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonp15ActionPerformed

    private void jButtont11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont11ActionPerformed
        // TODO add your handling code here:
        mes="T11";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont11ActionPerformed

    private void jButtont12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont12ActionPerformed
        // TODO add your handling code here:
        mes="T12";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont12ActionPerformed

    private void jButtont13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont13ActionPerformed
        // TODO add your handling code here:
        mes="T13";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont13ActionPerformed

    private void jButtont14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont14ActionPerformed
        // TODO add your handling code here:
        mes="T14";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont14ActionPerformed

    private void jButtont15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont15ActionPerformed
        // TODO add your handling code here:
        mes="T15";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont15ActionPerformed

    private void jButtont16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont16ActionPerformed
        // TODO add your handling code here:
        mes="T16";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont16ActionPerformed

    private void jButtont17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont17ActionPerformed
        // TODO add your handling code here:
        mes="T17";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont17ActionPerformed

    private void jButtont18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtont18ActionPerformed
        // TODO add your handling code here:
        mes="T18";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtont18ActionPerformed

    private void jButtonF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF1ActionPerformed
        // TODO add your handling code here:
        mes="SALLE";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonF1ActionPerformed

    private void jButtonF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF2ActionPerformed
        // TODO add your handling code here:
        mes="NEGRA";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonF2ActionPerformed

    private void jButtonF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF3ActionPerformed
        // TODO add your handling code here:
        mes="DOSYDO";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonF3ActionPerformed

    private void jButtonF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF4ActionPerformed
        // TODO add your handling code here:
        mes="BLUSKIN";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonF4ActionPerformed

    private void jButtonF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF5ActionPerformed
        // TODO add your handling code here:
        mes="PLECHE";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonF5ActionPerformed

    private void jButtonF7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF7ActionPerformed
        // TODO add your handling code here:
        mes="JUNIOR";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonF7ActionPerformed

    private void jButtonF8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF8ActionPerformed
        // TODO add your handling code here:
        mes="PIBES";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonF8ActionPerformed

    private void jButtonF9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF9ActionPerformed
        // TODO add your handling code here:
        mes="DIFESU";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonF9ActionPerformed

    private void jButtonF10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF10ActionPerformed
        // TODO add your handling code here:
        mes="SIGMA";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonF10ActionPerformed

    private void jButtonF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF6ActionPerformed
        // TODO add your handling code here:
        mes="TOTTEM";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonF6ActionPerformed

    private void jButtonF11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF11ActionPerformed
        // TODO add your handling code here:
        mes="TRIBUN";
        Pedidos pes = new Pedidos();
        Menu.VentanaPrincipal.add(pes);
        pes.setVisible(true);
        //System.out.print(pe2);
        this.dispose();
    }//GEN-LAST:event_jButtonF11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButtonF1;
    private javax.swing.JButton jButtonF10;
    private javax.swing.JButton jButtonF11;
    private javax.swing.JButton jButtonF2;
    private javax.swing.JButton jButtonF3;
    private javax.swing.JButton jButtonF4;
    private javax.swing.JButton jButtonF5;
    private javax.swing.JButton jButtonF6;
    private javax.swing.JButton jButtonF7;
    private javax.swing.JButton jButtonF8;
    private javax.swing.JButton jButtonF9;
    private javax.swing.JButton jButtonl1;
    private javax.swing.JButton jButtonl10;
    private javax.swing.JButton jButtonl11;
    private javax.swing.JButton jButtonl12;
    private javax.swing.JButton jButtonl13;
    private javax.swing.JButton jButtonl14;
    private javax.swing.JButton jButtonl15;
    private javax.swing.JButton jButtonl2;
    private javax.swing.JButton jButtonl3;
    private javax.swing.JButton jButtonl4;
    private javax.swing.JButton jButtonl5;
    private javax.swing.JButton jButtonl6;
    private javax.swing.JButton jButtonl7;
    private javax.swing.JButton jButtonl8;
    private javax.swing.JButton jButtonl9;
    private javax.swing.JButton jButtonp1;
    private javax.swing.JButton jButtonp10;
    private javax.swing.JButton jButtonp11;
    private javax.swing.JButton jButtonp12;
    private javax.swing.JButton jButtonp13;
    private javax.swing.JButton jButtonp14;
    private javax.swing.JButton jButtonp15;
    private javax.swing.JButton jButtonp2;
    private javax.swing.JButton jButtonp3;
    private javax.swing.JButton jButtonp4;
    private javax.swing.JButton jButtonp5;
    private javax.swing.JButton jButtonp6;
    private javax.swing.JButton jButtonp7;
    private javax.swing.JButton jButtonp8;
    private javax.swing.JButton jButtonp9;
    private javax.swing.JButton jButtont1;
    private javax.swing.JButton jButtont10;
    private javax.swing.JButton jButtont11;
    private javax.swing.JButton jButtont12;
    private javax.swing.JButton jButtont13;
    private javax.swing.JButton jButtont14;
    private javax.swing.JButton jButtont15;
    private javax.swing.JButton jButtont16;
    private javax.swing.JButton jButtont17;
    private javax.swing.JButton jButtont18;
    private javax.swing.JButton jButtont2;
    private javax.swing.JButton jButtont3;
    private javax.swing.JButton jButtont4;
    private javax.swing.JButton jButtont5;
    private javax.swing.JButton jButtont6;
    private javax.swing.JButton jButtont7;
    private javax.swing.JButton jButtont8;
    private javax.swing.JButton jButtont9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
