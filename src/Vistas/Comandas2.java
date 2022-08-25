/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.DetallePedido;
import Modelo.EstadoMesa;
import Modelo.Mesa;
import Modelo.MesaDAO;
import Modelo.Pedido;
import Modelo.PedidoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian
 */
public class Comandas2 extends javax.swing.JFrame implements Runnable {

    
    
    
    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;
    
    Producto pro = new Producto();
    ProductoDAO prod = new ProductoDAO();
    
    MesaDAO dao= new MesaDAO();
    Mesa me = new Mesa();
    DefaultTableModel modelo = new DefaultTableModel();
    Pedido pe = new Pedido();
    DetallePedido dp = new DetallePedido();
    PedidoDAO ped = new PedidoDAO();
    
    
    /**
     * Creates new form Comandas2
     */
    public Comandas2() {
        initComponents();
        
        
        h1 = new Thread(this);
        h1.start();
       
        
    }
    
    void limpiar(){
        
    }
    
    void listar(){
        
        Date dateMaestro = new Date();
            SimpleDateFormat minutoMaestro = new SimpleDateFormat("mm");
            SimpleDateFormat horaMaestro = new SimpleDateFormat("HH");
            int mM = Integer.parseInt(minutoMaestro.format(dateMaestro));
            int horaM = Integer.parseInt(horaMaestro.format(dateMaestro));
            int totalMaestro =horaM*60+mM;
        
        List<Pedido> lista=ped.listarPedidos();
        
        for(int i=lista.size();i<9;i++){
            lista.add(null);
        }
        
        //1
        
        if(lista.get(0)!=null){
            LMesa1.setText(String.valueOf(dao.NoMesa(lista.get(0).getMesa())));
            LMozo1.setText(lista.get(0).getMozo());
            List<DetallePedido> listaest1=ped.listarDetPedidos(lista.get(0).getId());
            modelo=(DefaultTableModel)TablaPedidos1.getModel();
            Object[]ob1=new Object[2];
            for(int i=0;i<listaest1.size();i++){
                ob1[0]=prod.NombrePro(listaest1.get(i).getIdProducto());
                ob1[1]=listaest1.get(i).getCantidad();
                modelo.addRow(ob1);
            }
            
            TablaPedidos1.setModel(modelo); 
            BotonDes1.setEnabled(true);
            
            Date date = new Date(listaest1.get(0).getFecha2().getTime());
            SimpleDateFormat timef = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat timeminu = new SimpleDateFormat("mm");
            SimpleDateFormat timehora = new SimpleDateFormat("HH");
            String time= timef.format(date);
            int minu = Integer.parseInt(timeminu.format(date));
            int hora = Integer.parseInt(timehora.format(date));
            int minutotal = hora*60+minu;
            
            Fecha1.setText(time);   
            
            
            Dif1.setText("(hace "+String.valueOf(totalMaestro-minutotal)+" minutos)");
            
        }
        
        

        //2
        if(lista.get(1)!=null){
            
            LMesa2.setText(String.valueOf(dao.NoMesa(lista.get(1).getMesa())));
            LMozo2.setText(lista.get(1).getMozo());
            List<DetallePedido> listaest2=ped.listarDetPedidos(lista.get(1).getId());
            modelo=(DefaultTableModel)TablaPedidos2.getModel();
            Object[]ob2=new Object[2];
            for(int i=0;i<listaest2.size();i++){
                ob2[0]=prod.NombrePro(listaest2.get(i).getIdProducto());
                ob2[1]=listaest2.get(i).getCantidad();
                modelo.addRow(ob2);
            }
            TablaPedidos2.setModel(modelo);
            BotonDes2.setEnabled(true);
            
            Date date2 = new Date(listaest2.get(0).getFecha2().getTime());
            SimpleDateFormat timef = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat timeminu2 = new SimpleDateFormat("mm");
            SimpleDateFormat timehora2 = new SimpleDateFormat("HH");
            String time2= timef.format(date2);
            int minu = Integer.parseInt(timeminu2.format(date2));
            int hora = Integer.parseInt(timehora2.format(date2));
            int minutotal2 = hora*60+minu;
            Fecha2.setText(time2);
            Dif2.setText("(hace "+String.valueOf(totalMaestro-minutotal2)+" minutos)");
        }
        //3
        if(lista.get(2)!=null){
            LMesa3.setText(String.valueOf(dao.NoMesa(lista.get(2).getMesa())));
            LMozo3.setText(lista.get(2).getMozo());
            List<DetallePedido> listaest3=ped.listarDetPedidos(lista.get(2).getId());
            modelo=(DefaultTableModel)TablaPedidos3.getModel();
            Object[]ob3=new Object[2];
            for(int i=0;i<listaest3.size();i++){
                ob3[0]=prod.NombrePro(listaest3.get(i).getIdProducto());
                ob3[1]=listaest3.get(i).getCantidad();
                modelo.addRow(ob3);
            }
            TablaPedidos3.setModel(modelo);
            BotonDes3.setEnabled(true);
            
            Date date3 = new Date(listaest3.get(0).getFecha2().getTime());
            SimpleDateFormat timef = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat timeminu3 = new SimpleDateFormat("mm");
            SimpleDateFormat timehora3 = new SimpleDateFormat("HH");
            String time3= timef.format(date3);
            int minu = Integer.parseInt(timeminu3.format(date3));
            int hora = Integer.parseInt(timehora3.format(date3));
            int minutotal3 = hora*60+minu;
            Fecha3.setText(time3);
            Dif3.setText("(hace "+String.valueOf(totalMaestro-minutotal3)+" minutos)");
        }
        
        //4
        if(lista.get(3)!=null){
            LMesa4.setText(String.valueOf(dao.NoMesa(lista.get(3).getMesa())));
            LMozo4.setText(lista.get(3).getMozo());
            List<DetallePedido> listaest4=ped.listarDetPedidos(lista.get(3).getId());
            modelo=(DefaultTableModel)TablaPedidos4.getModel();
            Object[]ob4=new Object[2];
            for(int i=0;i<listaest4.size();i++){
                ob4[0]=prod.NombrePro(listaest4.get(i).getIdProducto());
                ob4[1]=listaest4.get(i).getCantidad();
                modelo.addRow(ob4);
            }
            TablaPedidos4.setModel(modelo);
            BotonDes4.setEnabled(true);
            
            Date date4 = new Date(listaest4.get(0).getFecha2().getTime());
            SimpleDateFormat timef = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat timeminu4 = new SimpleDateFormat("mm");
            SimpleDateFormat timehora4 = new SimpleDateFormat("HH");
            String time4= timef.format(date4);
            int minu = Integer.parseInt(timeminu4.format(date4));
            int hora = Integer.parseInt(timehora4.format(date4));
            int minutotal4 = hora*60+minu;
            Fecha4.setText(time4);
            Dif4.setText("(hace "+String.valueOf(totalMaestro-minutotal4)+" minutos)");
        }
        //5
        if(lista.get(4)!=null){
            LMesa5.setText(String.valueOf(dao.NoMesa(lista.get(4).getMesa())));
            LMozo5.setText(lista.get(4).getMozo());
            List<DetallePedido> listaest5=ped.listarDetPedidos(lista.get(4).getId());
            modelo=(DefaultTableModel)TablaPedidos5.getModel();
            Object[]ob5=new Object[2];
            for(int i=0;i<listaest5.size();i++){
                ob5[0]=prod.NombrePro(listaest5.get(i).getIdProducto());
                ob5[1]=listaest5.get(i).getCantidad();
                modelo.addRow(ob5);
            }
            TablaPedidos5.setModel(modelo);
            BotonDes5.setEnabled(true);
            
            Date date5 = new Date(listaest5.get(0).getFecha2().getTime());
            SimpleDateFormat timef = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat timeminu5 = new SimpleDateFormat("mm");
            SimpleDateFormat timehora5 = new SimpleDateFormat("HH");
            String time5= timef.format(date5);
            int minu = Integer.parseInt(timeminu5.format(date5));
            int hora = Integer.parseInt(timehora5.format(date5));
            int minutotal5 = hora*60+minu;
            Fecha5.setText(time5);
            Dif5.setText("(hace "+String.valueOf(totalMaestro-minutotal5)+" minutos)");
        }
        //6
        if(lista.get(5)!=null){
            LMesa6.setText(String.valueOf(dao.NoMesa(lista.get(5).getMesa())));
            LMozo6.setText(lista.get(5).getMozo());
            List<DetallePedido> listaest6=ped.listarDetPedidos(lista.get(5).getId());
            modelo=(DefaultTableModel)TablaPedidos6.getModel();
            Object[]ob6=new Object[2];
            for(int i=0;i<listaest6.size();i++){
                ob6[0]=prod.NombrePro(listaest6.get(i).getIdProducto());
                ob6[1]=listaest6.get(i).getCantidad();
                modelo.addRow(ob6);
            }
            TablaPedidos6.setModel(modelo);
            BotonDes6.setEnabled(true);
            
            
            Date date6 = new Date(listaest6.get(0).getFecha2().getTime());
            SimpleDateFormat timef = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat timeminu6 = new SimpleDateFormat("mm");
            SimpleDateFormat timehora6 = new SimpleDateFormat("HH");
            String time6= timef.format(date6);
            int minu = Integer.parseInt(timeminu6.format(date6));
            int hora = Integer.parseInt(timehora6.format(date6));
            int minutotal6 = hora*60+minu;
            Fecha6.setText(time6);
            Dif6.setText("(hace "+String.valueOf(totalMaestro-minutotal6)+" minutos)");
            
        }
        //7
        if(lista.get(6)!=null){
            LMesa7.setText(String.valueOf(dao.NoMesa(lista.get(6).getMesa())));
            LMozo7.setText(lista.get(6).getMozo());
            List<DetallePedido> listaest7=ped.listarDetPedidos(lista.get(6).getId());
            modelo=(DefaultTableModel)TablaPedidos7.getModel();
            Object[]ob7=new Object[2];
            for(int i=0;i<listaest7.size();i++){
                ob7[0]=prod.NombrePro(listaest7.get(i).getIdProducto());
                ob7[1]=listaest7.get(i).getCantidad();
                modelo.addRow(ob7);
            }
            TablaPedidos7.setModel(modelo);
            BotonDes7.setEnabled(true);
            
            Date date7 = new Date(listaest7.get(0).getFecha2().getTime());
            SimpleDateFormat timef = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat timeminu7 = new SimpleDateFormat("mm");
            SimpleDateFormat timehora7 = new SimpleDateFormat("HH");
            String time7= timef.format(date7);
            int minu = Integer.parseInt(timeminu7.format(date7));
            int hora = Integer.parseInt(timehora7.format(date7));
            int minutotal7 = hora*60+minu;
            Fecha7.setText(time7);
            Dif7.setText("(hace "+String.valueOf(totalMaestro-minutotal7)+" minutos)");
        }
        //8
        if(lista.get(7)!=null){
            LMesa8.setText(String.valueOf(dao.NoMesa(lista.get(7).getMesa())));
            LMozo8.setText(lista.get(7).getMozo());
            List<DetallePedido> listaest8=ped.listarDetPedidos(lista.get(7).getId());
            modelo=(DefaultTableModel)TablaPedidos8.getModel();
            Object[]ob8=new Object[2];
            for(int i=0;i<listaest8.size();i++){
                ob8[0]=prod.NombrePro(listaest8.get(i).getIdProducto());
                ob8[1]=listaest8.get(i).getCantidad();
                modelo.addRow(ob8);
            }
            TablaPedidos8.setModel(modelo);
            BotonDes8.setEnabled(true);
            
            Date date8 = new Date(listaest8.get(0).getFecha2().getTime());
            SimpleDateFormat timef = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat timeminu8 = new SimpleDateFormat("mm");
            SimpleDateFormat timehora8 = new SimpleDateFormat("HH");
            String time8= timef.format(date8);
            int minu = Integer.parseInt(timeminu8.format(date8));
            int hora = Integer.parseInt(timehora8.format(date8));
            int minutotal8 = hora*60+minu;
            Fecha8.setText(time8);
            Dif8.setText("(hace "+String.valueOf(totalMaestro-minutotal8)+" minutos)");

        }
        //9
        if(lista.get(8)!=null){
            LMesa9.setText(String.valueOf(dao.NoMesa(lista.get(8).getMesa())));
            LMozo9.setText(lista.get(8).getMozo());
            List<DetallePedido> listaest9=ped.listarDetPedidos(lista.get(8).getId());
            modelo=(DefaultTableModel)TablaPedidos9.getModel();
            Object[]ob9=new Object[2];
            for(int i=0;i<listaest9.size();i++){
                ob9[0]=prod.NombrePro(listaest9.get(i).getIdProducto());
                ob9[1]=listaest9.get(i).getCantidad();
                modelo.addRow(ob9);
            }
            TablaPedidos9.setModel(modelo);
            BotonDes9.setEnabled(true);
            
            
            Date date9 = new Date(listaest9.get(0).getFecha2().getTime());
            SimpleDateFormat timef = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat timeminu9 = new SimpleDateFormat("mm");
            SimpleDateFormat timehora9 = new SimpleDateFormat("HH");
            String time9= timef.format(date9);
            int minu = Integer.parseInt(timeminu9.format(date9));
            int hora = Integer.parseInt(timehora9.format(date9));
            int minutotal9 = hora*60+minu;
            Fecha9.setText(time9);
            Dif9.setText("(hace "+String.valueOf(totalMaestro-minutotal9)+" minutos)");
        }
    }
    
    
    void limpiarTabla(){
        modelo=(DefaultTableModel)TablaPedidos1.getModel();
        for(int i=0; i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;  
        }
        modelo=(DefaultTableModel)TablaPedidos2.getModel();
        for(int i=0; i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;  
        }
        modelo=(DefaultTableModel)TablaPedidos3.getModel();
        for(int i=0; i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;  
        }
        modelo=(DefaultTableModel)TablaPedidos4.getModel();
        for(int i=0; i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;  
        }
        modelo=(DefaultTableModel)TablaPedidos5.getModel();
        for(int i=0; i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;  
        }
        modelo=(DefaultTableModel)TablaPedidos6.getModel();
        for(int i=0; i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;  
        }
        modelo=(DefaultTableModel)TablaPedidos7.getModel();
        for(int i=0; i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;  
        }
        modelo=(DefaultTableModel)TablaPedidos8.getModel();
        for(int i=0; i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;  
        }
        modelo=(DefaultTableModel)TablaPedidos9.getModel();
        for(int i=0; i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;  
        }
    }
    void LimpiarLabels(){
        LMesa1.setText("");
        LMozo1.setText("");
        Fecha1.setText("");
        Dif1.setText("");
        
        LMesa2.setText("");
        LMozo2.setText("");
        Fecha2.setText("");
        Dif2.setText("");
        
        LMesa3.setText("");
        LMozo3.setText("");
        Fecha3.setText("");
        Dif3.setText("");
        
        LMesa4.setText("");
        LMozo4.setText("");
        Fecha4.setText("");
        Dif4.setText("");
        
        LMesa5.setText("");
        LMozo5.setText("");
        Fecha5.setText("");
        Dif5.setText("");
        
        LMesa6.setText("");
        LMozo6.setText("");
        Fecha6.setText("");
        Dif6.setText("");
        
        LMesa7.setText("");
        LMozo7.setText("");
        Fecha7.setText("");
        Dif7.setText("");
        
        LMesa8.setText("");
        LMozo8.setText("");
        Fecha8.setText("");
        Dif8.setText("");
        
        LMesa9.setText("");
        LMozo9.setText("");
        Fecha9.setText("");
        Dif9.setText("");
        
        BotonDes1.setEnabled(false);
        BotonDes2.setEnabled(false);
        BotonDes3.setEnabled(false);
        BotonDes4.setEnabled(false);
        BotonDes5.setEnabled(false);
        BotonDes6.setEnabled(false);
        BotonDes7.setEnabled(false);
        BotonDes8.setEnabled(false);
        BotonDes9.setEnabled(false);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        LMesa2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Fecha2 = new javax.swing.JLabel();
        LMozo2 = new javax.swing.JLabel();
        Dif2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaPedidos2 = new javax.swing.JTable();
        BotonDes2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        LMesa1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Fecha1 = new javax.swing.JLabel();
        LMozo1 = new javax.swing.JLabel();
        Dif1 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPedidos1 = new javax.swing.JTable();
        BotonDes1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        LMesa3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Fecha3 = new javax.swing.JLabel();
        LMozo3 = new javax.swing.JLabel();
        Dif3 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaPedidos3 = new javax.swing.JTable();
        BotonDes3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        LMesa4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Fecha4 = new javax.swing.JLabel();
        LMozo4 = new javax.swing.JLabel();
        Dif4 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaPedidos4 = new javax.swing.JTable();
        BotonDes4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        LMesa6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Fecha6 = new javax.swing.JLabel();
        LMozo6 = new javax.swing.JLabel();
        Dif6 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaPedidos6 = new javax.swing.JTable();
        BotonDes6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        LMesa5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Fecha5 = new javax.swing.JLabel();
        LMozo5 = new javax.swing.JLabel();
        Dif5 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaPedidos5 = new javax.swing.JTable();
        BotonDes5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        LMesa7 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Fecha7 = new javax.swing.JLabel();
        LMozo7 = new javax.swing.JLabel();
        Dif7 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TablaPedidos7 = new javax.swing.JTable();
        BotonDes7 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        LMesa8 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Fecha8 = new javax.swing.JLabel();
        LMozo8 = new javax.swing.JLabel();
        Dif8 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TablaPedidos8 = new javax.swing.JTable();
        BotonDes8 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        LMesa9 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        Fecha9 = new javax.swing.JLabel();
        LMozo9 = new javax.swing.JLabel();
        Dif9 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        TablaPedidos9 = new javax.swing.JTable();
        BotonDes9 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        HoraLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMANDAS");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton1.setText("HISTORIAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(715, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setText("2");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("MESA:");
        jLabel10.setName(""); // NOI18N

        LMesa2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        LMesa2.setForeground(new java.awt.Color(255, 51, 51));
        LMesa2.setText("0");
        LMesa2.setName(""); // NOI18N

        jLabel22.setText("MOZO:");

        Fecha2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Fecha2.setText("00:00:00");

        LMozo2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        Dif2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Dif2.setText("               ");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMesa2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMozo2))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dif2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMesa2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel22)
                    .addComponent(LMozo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(Dif2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        TablaPedidos2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        TablaPedidos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(TablaPedidos2);
        if (TablaPedidos2.getColumnModel().getColumnCount() > 0) {
            TablaPedidos2.getColumnModel().getColumn(0).setResizable(false);
            TablaPedidos2.getColumnModel().getColumn(0).setPreferredWidth(300);
            TablaPedidos2.getColumnModel().getColumn(1).setResizable(false);
        }

        BotonDes2.setBackground(new java.awt.Color(255, 153, 0));
        BotonDes2.setText("DESPACHADO");
        BotonDes2.setEnabled(false);
        BotonDes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDes2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(BotonDes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonDes2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("MESA:");
        jLabel9.setName(""); // NOI18N

        LMesa1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        LMesa1.setForeground(new java.awt.Color(255, 51, 51));
        LMesa1.setText("0");
        LMesa1.setName(""); // NOI18N

        jLabel21.setText("MOZO:");

        Fecha1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Fecha1.setText("00:00:00");

        LMozo1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        Dif1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Dif1.setText("               ");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMesa1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMozo1))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(Fecha1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dif1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMesa1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel21)
                    .addComponent(LMozo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(Dif1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("1");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablaPedidos1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        TablaPedidos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(TablaPedidos1);
        if (TablaPedidos1.getColumnModel().getColumnCount() > 0) {
            TablaPedidos1.getColumnModel().getColumn(0).setResizable(false);
            TablaPedidos1.getColumnModel().getColumn(0).setPreferredWidth(300);
            TablaPedidos1.getColumnModel().getColumn(1).setResizable(false);
        }

        BotonDes1.setBackground(new java.awt.Color(255, 153, 0));
        BotonDes1.setText("DESPACHADO");
        BotonDes1.setEnabled(false);
        BotonDes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(BotonDes1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonDes1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("MESA:");
        jLabel11.setName(""); // NOI18N

        LMesa3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        LMesa3.setForeground(new java.awt.Color(255, 51, 51));
        LMesa3.setText("0");
        LMesa3.setName(""); // NOI18N

        jLabel23.setText("MOZO:");

        Fecha3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Fecha3.setText("00:00:00");

        LMozo3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        Dif3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Dif3.setText("               ");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMesa3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMozo3))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(Fecha3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dif3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMesa3)
                    .addComponent(jLabel11)
                    .addComponent(jLabel23)
                    .addComponent(LMozo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha3)
                    .addComponent(Dif3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setText("3");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablaPedidos3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        TablaPedidos3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Cantidad"
            }
        ));
        jScrollPane4.setViewportView(TablaPedidos3);
        if (TablaPedidos3.getColumnModel().getColumnCount() > 0) {
            TablaPedidos3.getColumnModel().getColumn(0).setResizable(false);
            TablaPedidos3.getColumnModel().getColumn(0).setPreferredWidth(300);
            TablaPedidos3.getColumnModel().getColumn(1).setResizable(false);
        }

        BotonDes3.setBackground(new java.awt.Color(255, 153, 0));
        BotonDes3.setText("DESPACHADO");
        BotonDes3.setEnabled(false);
        BotonDes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDes3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(BotonDes3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonDes3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("MESA:");
        jLabel12.setName(""); // NOI18N

        LMesa4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        LMesa4.setForeground(new java.awt.Color(255, 51, 51));
        LMesa4.setText("0");
        LMesa4.setName(""); // NOI18N

        jLabel24.setText("MOZO:");

        Fecha4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Fecha4.setText("00:00:00");

        LMozo4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        Dif4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Dif4.setText("               ");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(Fecha4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dif4))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMesa4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMozo4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMesa4)
                    .addComponent(jLabel12)
                    .addComponent(jLabel24)
                    .addComponent(LMozo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(Dif4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel13.setText("4");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        TablaPedidos4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        TablaPedidos4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Cantidad"
            }
        ));
        jScrollPane7.setViewportView(TablaPedidos4);
        if (TablaPedidos4.getColumnModel().getColumnCount() > 0) {
            TablaPedidos4.getColumnModel().getColumn(0).setResizable(false);
            TablaPedidos4.getColumnModel().getColumn(0).setPreferredWidth(300);
            TablaPedidos4.getColumnModel().getColumn(1).setResizable(false);
        }

        BotonDes4.setBackground(new java.awt.Color(255, 153, 0));
        BotonDes4.setText("DESPACHADO");
        BotonDes4.setEnabled(false);
        BotonDes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDes4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonDes4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(BotonDes4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 51));
        jLabel26.setText("MESA:");
        jLabel26.setName(""); // NOI18N

        LMesa6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        LMesa6.setForeground(new java.awt.Color(255, 51, 51));
        LMesa6.setText("0");
        LMesa6.setName(""); // NOI18N

        jLabel28.setText("MOZO:");

        Fecha6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Fecha6.setText("00:00:00");

        LMozo6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        Dif6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Dif6.setText("               ");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(Fecha6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dif6))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMesa6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMozo6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMesa6)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28)
                    .addComponent(LMozo6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha6, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(Dif6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel31.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel31.setText("6");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel31)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        TablaPedidos6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        TablaPedidos6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Cantidad"
            }
        ));
        jScrollPane6.setViewportView(TablaPedidos6);
        if (TablaPedidos6.getColumnModel().getColumnCount() > 0) {
            TablaPedidos6.getColumnModel().getColumn(0).setResizable(false);
            TablaPedidos6.getColumnModel().getColumn(0).setPreferredWidth(300);
            TablaPedidos6.getColumnModel().getColumn(1).setResizable(false);
        }

        BotonDes6.setBackground(new java.awt.Color(255, 153, 0));
        BotonDes6.setText("DESPACHADO");
        BotonDes6.setEnabled(false);
        BotonDes6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDes6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(BotonDes6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonDes6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("MESA:");
        jLabel14.setName(""); // NOI18N

        LMesa5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        LMesa5.setForeground(new java.awt.Color(255, 51, 51));
        LMesa5.setText("0");
        LMesa5.setName(""); // NOI18N

        jLabel25.setText("MOZO:");

        Fecha5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Fecha5.setText("00:00:00");

        LMozo5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        Dif5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Dif5.setText("               ");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(Fecha5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dif5))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMesa5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMozo5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMesa5)
                    .addComponent(jLabel14)
                    .addComponent(jLabel25)
                    .addComponent(LMozo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(Dif5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel30.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel30.setText("5");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel30)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        TablaPedidos5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        TablaPedidos5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Cantidad"
            }
        ));
        jScrollPane5.setViewportView(TablaPedidos5);
        if (TablaPedidos5.getColumnModel().getColumnCount() > 0) {
            TablaPedidos5.getColumnModel().getColumn(0).setResizable(false);
            TablaPedidos5.getColumnModel().getColumn(0).setPreferredWidth(300);
            TablaPedidos5.getColumnModel().getColumn(1).setResizable(false);
        }

        BotonDes5.setBackground(new java.awt.Color(255, 153, 0));
        BotonDes5.setText("DESPACHADO");
        BotonDes5.setEnabled(false);
        BotonDes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDes5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(BotonDes5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonDes5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel32.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 51, 51));
        jLabel32.setText("MESA:");
        jLabel32.setName(""); // NOI18N

        LMesa7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        LMesa7.setForeground(new java.awt.Color(255, 51, 51));
        LMesa7.setText("0");
        LMesa7.setName(""); // NOI18N

        jLabel34.setText("MOZO:");

        Fecha7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Fecha7.setText("00:00:00");

        LMozo7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        Dif7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Dif7.setText("               ");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(Fecha7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dif7))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMesa7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMozo7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMesa7)
                    .addComponent(jLabel32)
                    .addComponent(jLabel34)
                    .addComponent(LMozo7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dif7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel44.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel44.setText("7");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel44)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablaPedidos7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        TablaPedidos7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Cantidad"
            }
        ));
        jScrollPane8.setViewportView(TablaPedidos7);
        if (TablaPedidos7.getColumnModel().getColumnCount() > 0) {
            TablaPedidos7.getColumnModel().getColumn(0).setResizable(false);
            TablaPedidos7.getColumnModel().getColumn(0).setPreferredWidth(300);
            TablaPedidos7.getColumnModel().getColumn(1).setResizable(false);
        }

        BotonDes7.setBackground(new java.awt.Color(255, 153, 0));
        BotonDes7.setText("DESPACHADO");
        BotonDes7.setEnabled(false);
        BotonDes7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDes7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(BotonDes7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(BotonDes7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel36.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 51, 51));
        jLabel36.setText("MESA:");
        jLabel36.setName(""); // NOI18N

        LMesa8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        LMesa8.setForeground(new java.awt.Color(255, 51, 51));
        LMesa8.setText("0");
        LMesa8.setName(""); // NOI18N

        jLabel38.setText("MOZO:");

        Fecha8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Fecha8.setText("00:00:00");

        LMozo8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        Dif8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Dif8.setText("               ");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(Fecha8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dif8))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMesa8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMozo8)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMesa8)
                    .addComponent(jLabel36)
                    .addComponent(jLabel38)
                    .addComponent(LMozo8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dif8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel45.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel45.setText("8");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel45)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablaPedidos8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        TablaPedidos8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Cantidad"
            }
        ));
        jScrollPane9.setViewportView(TablaPedidos8);
        if (TablaPedidos8.getColumnModel().getColumnCount() > 0) {
            TablaPedidos8.getColumnModel().getColumn(0).setResizable(false);
            TablaPedidos8.getColumnModel().getColumn(0).setPreferredWidth(300);
            TablaPedidos8.getColumnModel().getColumn(1).setResizable(false);
        }

        BotonDes8.setBackground(new java.awt.Color(255, 153, 0));
        BotonDes8.setText("DESPACHADO");
        BotonDes8.setEnabled(false);
        BotonDes8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDes8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(BotonDes8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonDes8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel40.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 51, 51));
        jLabel40.setText("MESA:");
        jLabel40.setName(""); // NOI18N

        LMesa9.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        LMesa9.setForeground(new java.awt.Color(255, 51, 51));
        LMesa9.setText("0");
        LMesa9.setName(""); // NOI18N

        jLabel42.setText("MOZO:");

        Fecha9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Fecha9.setText("00:00:00");

        LMozo9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        LMozo9.setText("             ");

        Dif9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Dif9.setText("               ");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMesa9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LMozo9))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(Fecha9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dif9)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMesa9)
                    .addComponent(jLabel40)
                    .addComponent(jLabel42)
                    .addComponent(LMozo9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Dif9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel46.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel46.setText("9");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel46)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        TablaPedidos9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        TablaPedidos9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Cantidad"
            }
        ));
        jScrollPane10.setViewportView(TablaPedidos9);
        if (TablaPedidos9.getColumnModel().getColumnCount() > 0) {
            TablaPedidos9.getColumnModel().getColumn(0).setResizable(false);
            TablaPedidos9.getColumnModel().getColumn(0).setPreferredWidth(300);
            TablaPedidos9.getColumnModel().getColumn(1).setResizable(false);
        }

        BotonDes9.setBackground(new java.awt.Color(255, 153, 0));
        BotonDes9.setText("DESPACHADO");
        BotonDes9.setEnabled(false);
        BotonDes9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDes9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonDes9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonDes9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        HoraLabel.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        HoraLabel.setText("00:00:00");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HoraLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HoraLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDes1ActionPerformed
        // TODO add your handling code here:
        
        List<Pedido> lista=ped.listarPedidos();
        ped.updateCocina(lista.get(0).getId());
        dao.actualizarIdCocina(lista.get(0).getMesa());
        
        
        limpiarTabla();
        LimpiarLabels();
        listar();
        
        
    }//GEN-LAST:event_BotonDes1ActionPerformed

    private void BotonDes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDes2ActionPerformed
        // TODO add your handling code here:
        List<Pedido> lista=ped.listarPedidos();
        ped.updateCocina(lista.get(1).getId());
        dao.actualizarIdCocina(lista.get(1).getMesa());
        
        limpiarTabla();
        LimpiarLabels();
        listar();
        
    }//GEN-LAST:event_BotonDes2ActionPerformed

    private void BotonDes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDes3ActionPerformed
        // TODO add your handling code here:
        List<Pedido> lista=ped.listarPedidos();
        ped.updateCocina(lista.get(2).getId());
        dao.actualizarIdCocina(lista.get(2).getMesa());
       
        limpiarTabla();
        LimpiarLabels();
        listar();
        
    }//GEN-LAST:event_BotonDes3ActionPerformed

    private void BotonDes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDes6ActionPerformed
        // TODO add your handling code here:
        List<Pedido> lista=ped.listarPedidos();
        ped.updateCocina(lista.get(5).getId());
        dao.actualizarIdCocina(lista.get(5).getMesa());
    
        limpiarTabla();
        LimpiarLabels();
        listar();
        
    }//GEN-LAST:event_BotonDes6ActionPerformed

    private void BotonDes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDes5ActionPerformed
        // TODO add your handling code here:
        List<Pedido> lista=ped.listarPedidos();
        ped.updateCocina(lista.get(4).getId());
        dao.actualizarIdCocina(lista.get(4).getMesa());
        
        limpiarTabla();
        LimpiarLabels();
        listar();
        
    }//GEN-LAST:event_BotonDes5ActionPerformed

    private void BotonDes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDes4ActionPerformed
        // TODO add your handling code here:
        List<Pedido> lista=ped.listarPedidos();
        ped.updateCocina(lista.get(3).getId());
        dao.actualizarIdCocina(lista.get(3).getMesa());
      
        limpiarTabla();
        LimpiarLabels();
        listar();
        
    }//GEN-LAST:event_BotonDes4ActionPerformed

    private void BotonDes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDes7ActionPerformed
        // TODO add your handling code here:
        List<Pedido> lista=ped.listarPedidos();
        ped.updateCocina(lista.get(6).getId());
        dao.actualizarIdCocina(lista.get(6).getMesa());
    
        limpiarTabla();
        LimpiarLabels();
        listar();
        
    }//GEN-LAST:event_BotonDes7ActionPerformed

    private void BotonDes8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDes8ActionPerformed
        // TODO add your handling code here:
        List<Pedido> lista=ped.listarPedidos();
        ped.updateCocina(lista.get(7).getId());
        dao.actualizarIdCocina(lista.get(7).getMesa());
 
        limpiarTabla();
        LimpiarLabels();
        listar();
        
    }//GEN-LAST:event_BotonDes8ActionPerformed

    private void BotonDes9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDes9ActionPerformed
        // TODO add your handling code here:
        List<Pedido> lista=ped.listarPedidos();
        ped.updateCocina(lista.get(8).getId());
        dao.actualizarIdCocina(lista.get(8).getMesa());
     
        limpiarTabla();
        LimpiarLabels();
        listar();
        
    }//GEN-LAST:event_BotonDes9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Comandas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comandas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comandas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comandas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comandas2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDes1;
    private javax.swing.JButton BotonDes2;
    private javax.swing.JButton BotonDes3;
    private javax.swing.JButton BotonDes4;
    private javax.swing.JButton BotonDes5;
    private javax.swing.JButton BotonDes6;
    private javax.swing.JButton BotonDes7;
    private javax.swing.JButton BotonDes8;
    private javax.swing.JButton BotonDes9;
    private javax.swing.JLabel Dif1;
    private javax.swing.JLabel Dif2;
    private javax.swing.JLabel Dif3;
    private javax.swing.JLabel Dif4;
    private javax.swing.JLabel Dif5;
    private javax.swing.JLabel Dif6;
    private javax.swing.JLabel Dif7;
    private javax.swing.JLabel Dif8;
    private javax.swing.JLabel Dif9;
    private javax.swing.JLabel Fecha1;
    private javax.swing.JLabel Fecha2;
    private javax.swing.JLabel Fecha3;
    private javax.swing.JLabel Fecha4;
    private javax.swing.JLabel Fecha5;
    private javax.swing.JLabel Fecha6;
    private javax.swing.JLabel Fecha7;
    private javax.swing.JLabel Fecha8;
    private javax.swing.JLabel Fecha9;
    private javax.swing.JLabel HoraLabel;
    private javax.swing.JLabel LMesa1;
    private javax.swing.JLabel LMesa2;
    private javax.swing.JLabel LMesa3;
    private javax.swing.JLabel LMesa4;
    private javax.swing.JLabel LMesa5;
    private javax.swing.JLabel LMesa6;
    private javax.swing.JLabel LMesa7;
    private javax.swing.JLabel LMesa8;
    private javax.swing.JLabel LMesa9;
    private javax.swing.JLabel LMozo1;
    private javax.swing.JLabel LMozo2;
    private javax.swing.JLabel LMozo3;
    private javax.swing.JLabel LMozo4;
    private javax.swing.JLabel LMozo5;
    private javax.swing.JLabel LMozo6;
    private javax.swing.JLabel LMozo7;
    private javax.swing.JLabel LMozo8;
    private javax.swing.JLabel LMozo9;
    private javax.swing.JTable TablaPedidos1;
    private javax.swing.JTable TablaPedidos2;
    private javax.swing.JTable TablaPedidos3;
    private javax.swing.JTable TablaPedidos4;
    private javax.swing.JTable TablaPedidos5;
    private javax.swing.JTable TablaPedidos6;
    private javax.swing.JTable TablaPedidos7;
    private javax.swing.JTable TablaPedidos8;
    private javax.swing.JTable TablaPedidos9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while(ct==h1){
            limpiarTabla();
            listar();
            
            calcula();
            HoraLabel.setText(hora+":"+minutos+":"+segundos+" "+ampm);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                
            }
            
        }
    }
    
    private void calcula(){
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        
        calendario.setTime(fechaHoraActual);
        ampm=calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        
        if(ampm.equals("PM")){
            int h=calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;
        }else{
            hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
}
