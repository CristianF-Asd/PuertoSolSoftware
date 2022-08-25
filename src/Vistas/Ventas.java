/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import Modelo.DetallePedido;
import Modelo.Mesa;
import Modelo.MesaDAO;
import Modelo.Pedido;
import Modelo.PedidoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.TipoPago;
import Modelo.TipoPagoDAO;
import Modelo.Venta;
import Modelo.VentaDAO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian
 */
public class Ventas extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    Pedido pe = new Pedido();
    PedidoDAO dao = new PedidoDAO();
    MesaDAO med = new MesaDAO();
    Mesa me = new Mesa();
    Producto pro=new Producto();
    ProductoDAO prod = new ProductoDAO();
    String tt = "";
    Venta ve = new Venta();
    VentaDAO ved = new VentaDAO();
    TipoPago tp = new TipoPago();
    TipoPagoDAO tpd = new TipoPagoDAO();
    
    double tp1 = 0;
    double tp2 = 0;
    double tp3 = 0;
    double totalventa=0;
    int idImpresora;
    
    
    
    
    
    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
        
        listar();
        
    }
    
    void listar(){
        
            CampoMozo.setText(String.valueOf(VentasMesa.pe2.getMozo()));
            CampoMozo.setEditable(false);
            CampoMesa.setText(med.NoMesa(VentasMesa.pe2.getMesa()));
            CampoMesa.setEditable(false);
            
            System.out.print(VentasMesa.pe2.getMesa());
            
            if(VentasMesa.pe2.getMesa()==0){
                List<DetallePedido> lista= dao.listarDetPedidos(VentasMesa.pe2.getId());
                modelo=(DefaultTableModel)TablaProductos.getModel();
                Object[]ob=new Object[6];
                for(int i=0;i<lista.size();i++){
                ob[0]=i+1;
                ob[1]=lista.get(i).getIdProducto();
                ob[2]=prod.listarID(lista.get(i).getIdProducto()).getNom();
                ob[3]=lista.get(i).getCantidad();
                ob[4]=prod.listarID(lista.get(i).getIdProducto()).getPrec();
                ob[5]=lista.get(i).getTotal();       
                totalventa=totalventa+lista.get(i).getTotal(); 
                modelo.addRow(ob);
                }
            }else{
                
                List<Pedido> listap = dao.listarPedidosxMesa(VentasMesa.pe2.getMesa());
                for(int j=0;j<listap.size();j++){
                    List<DetallePedido> lista= dao.listarDetPedidos(listap.get(j).getId());
                    modelo=(DefaultTableModel)TablaProductos.getModel();
                    Object[]ob=new Object[6];
                    for(int i=0;i<lista.size();i++){
                        ob[0]=i+1;
                        ob[1]=lista.get(i).getIdProducto();
                        ob[2]=prod.listarID(lista.get(i).getIdProducto()).getNom();
                        ob[3]=lista.get(i).getCantidad();
                        ob[4]=prod.listarID(lista.get(i).getIdProducto()).getPrec();
                        ob[5]=lista.get(i).getTotal();       

                        modelo.addRow(ob);

                    }
                    TablaProductos.setModel(modelo);
                    totalventa = totalventa +listap.get(j).getTotal();

                    }
            }
            
            
            
            
            
            
            
            CampoTotalPagar.setText(String.valueOf(totalventa));
            CampoTotalPagar.setEditable(false);
            CampoCodigo.setEnabled(false);
            CampoTotal.setText(String.valueOf(totalventa));
            CampoTotal.setEditable(false);
            
            CampoCodigo.setEnabled(false);
           
            BotonBuscar.setEnabled(false);
            
            
            
            BotonGuardar.setEnabled(false);
            BotonLimpiar.setEnabled(false);
            
            
    }
    
    
    void imprimirTicket(){
        try {
            
            File archivo;
            archivo = new File("C:\\temp\\ticket"+ved.IdVenta()+".txt");
            
            PrinterMatrix printer = new PrinterMatrix();
            Extenso e = new Extenso();

            e.setNumber(20.30);
            //Definir el tamanho del papel para la impresion de dinamico y 32 columnas
            int filas = TablaProductos.getRowCount();
            int tamaño = filas+35;
            printer.setOutSize(tamaño, 45);

            //Imprimir = 1ra linea de la columa de 1 a 32
            
            printer.printTextWrap(1, 1, 20, 45, "PUERTO SOL"); //Nombre establecimiento
            printer.printTextWrap(3, 1, 15, 45, "Pescados y Mariscos"); //Barrio
            printer.printTextWrap(4, 1, 14, 45, "RUC: 20456136746 "); //Direccion
            printer.printTextWrap(5, 1, 10, 45, "Av Bolognesi Nro. 101-B Int 3 "); //Codigo Postal
            printer.printTextWrap(6, 1, 20, 45, "Telf: 953765166");
            printer.printTextWrap(8, 1, 1, 45, "============================================");
            printer.printTextWrap(11, 1, 25, 45, "Nro ticket: "+String.valueOf(ved.IdVenta()));
            printer.printTextWrap(12, 1, 1, 45, "MESERO:"+String.valueOf(VentasMesa.pe2.getMozo())); //Aqui va la fecha de recibo
            printer.printTextWrap(13, 1, 1, 45, "MESA:"+CampoMesa.getText()); //Aqui va la hora de recibo
            
            Date dd = new Date();
            SimpleDateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat timef = new SimpleDateFormat("HH:mm:ss");
            String date= datef.format(dd);
            String time= timef.format(dd);
            
            
            printer.printTextWrap(12, 1, 25, 45, "FECHA:"+date); //Numero del recibo - FACTURA O PEDIDO
            printer.printTextWrap(13, 1, 25, 45, "HORA:"+time); //Nombre Cajero
            printer.printTextWrap(15,1, 1, 45, "============================================");
            printer.printTextWrap(16,1, 1, 45, "DESCRIPCION                    CANT   PRECIO");
            printer.printTextWrap(17,1, 0, 40, " ");

            for (int i = 0; i < filas; i++) {
                int p = 18+i; //Fila

                
                printer.printTextWrap(p , 1, 1, 31 , TablaProductos.getValueAt(i,2).toString());
                printer.printTextWrap(p , 1, 32, 34, TablaProductos.getValueAt(i,3).toString());

                String pre= printer.alinharADireita(5, TablaProductos.getValueAt(i,5).toString());
                printer.printTextWrap(p , 1, 38, 45, pre);

                //String inp= printer.alinharADireita(7,punto_Venta.jtbl_venta.getValueAt(i,6).toString());
                //printer.printTextWrap(p , 1, 25, 32, inp);
            }
            
            printer.printTextWrap(filas+20,1, 1, 45, "============================================");
            
            DecimalFormat formateador = new DecimalFormat("#.###");

            String sub= printer.alinharADireita(10, String.valueOf(totalventa));
            printer.printTextWrap(filas+21, 1, 1, 45, "SUBTOTAL: ");
            printer.printTextWrap(filas+21, 1, 20, 45, "S/"+sub);
            
            String des= printer.alinharADireita(10,CampoDescuento.getText());
            printer.printTextWrap(filas+22, 1, 1, 45, "DESCUENTO: ");
            printer.printTextWrap(filas+22, 1, 20, 45, "S/"+des);
            

            String tot= printer.alinharADireita(10, CampoTotal.getText());
            printer.printTextWrap(filas+23, 1, 1, 45, "Total a pagar: ");
            printer.printTextWrap(filas+23, 1, 20, 45, "S/"+tot);

            String efe= printer.alinharADireita(10,"00");
            printer.printTextWrap(filas+24, 1, 1, 45, "Efectivo : ");
            printer.printTextWrap(filas+24, 1, 20, 45, "S/"+efe);

            String cam= printer.alinharADireita(10,"00");
            printer.printTextWrap(filas+25, 1, 1, 45, "Cambio : ");
            printer.printTextWrap(filas+25, 1, 20, 45, "S/"+ cam);

            printer.printTextWrap(filas+26, 1, 1, 45, "============================================");
            printer.printTextWrap(filas+27, 1, 8,45, "!Gracias por su preferencia!");
            printer.printTextWrap(filas+28, 1, 5, 45, " ");
            printer.printTextWrap(filas+29, 1, 12, 45, " ");
            printer.printTextWrap(filas+30, 1, 8, 45, "Este no es un documento fiscal");
            printer.printTextWrap(filas+31, 1, 1,45, "============================================");


            ///CREAR ARCHIVO EN CARPETA DEL PROYECTO PARA PEDIDOS
            printer.toFile("C:\\temp\\ticket"+ved.IdVenta()+".txt");
            FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("C:\\temp\\ticket"+ved.IdVenta()+".txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
        if (inputStream == null) {
            return;
        }

        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream, docFormat, null);
        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
        //PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
        PrintService [] printService = PrintServiceLookup.lookupPrintServices(docFormat, null);
            int i =0;
            for(PrintService service : printService){
                System.out.println("Impresora"+i+" : "+service.getName());
                if(service.getName().equals("BASIC 230")){
                    idImpresora = i;
                }
                i++;
        }
        
        if (printService[idImpresora] != null) {
            DocPrintJob printJob = printService[idImpresora].createPrintJob();
            try {
                printJob.print(document, attributeSet);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.err.println("No existen impresoras instaladas");
        }

        inputStream.close();
        //imprimirFin(subTotal, total, dineroR, devolucion); //ESTE METODO NO SE UTILIZARA
    
        DocPrintJob job = PrintServiceLookup.lookupDefaultPrintService().createPrintJob();  
        byte[] bytes = {27, 100, 3};
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        Doc doc = new SimpleDoc(bytes, flavor, null);
        job.print(doc, null);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al imprimir "+e);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        LabelId = new javax.swing.JLabel();
        CampoMozo = new javax.swing.JTextField();
        CampoMesa = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BotonImprimir = new javax.swing.JButton();
        ComboTIpoDoc = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CampoCodigo = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CampoTotalPagar = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        LablePago1 = new javax.swing.JLabel();
        LabelPago2 = new javax.swing.JLabel();
        LabelPago3 = new javax.swing.JLabel();
        CampoEfectivo = new javax.swing.JTextField();
        CampoYape = new javax.swing.JTextField();
        CampoVisa = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        TodoEfectivo = new javax.swing.JButton();
        TodoYape = new javax.swing.JButton();
        TodoVisa = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        LabelEfectivo = new javax.swing.JLabel();
        LabelYape = new javax.swing.JLabel();
        LabelVisa = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CampoDescuento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CampoTotal = new javax.swing.JTextField();
        BotonDescuento = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BotonCerrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("EMITIR COMPROBANTE");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("MOZO :");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("MESA:");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "COD", "PRODUCTO", "CANTIDAD", "PRE UNI", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaProductos);
        if (TablaProductos.getColumnModel().getColumnCount() > 0) {
            TablaProductos.getColumnModel().getColumn(0).setPreferredWidth(5);
            TablaProductos.getColumnModel().getColumn(1).setPreferredWidth(5);
            TablaProductos.getColumnModel().getColumn(2).setPreferredWidth(250);
            TablaProductos.getColumnModel().getColumn(3).setPreferredWidth(5);
            TablaProductos.getColumnModel().getColumn(4).setPreferredWidth(5);
            TablaProductos.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        CampoMozo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        CampoMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoMozoActionPerformed(evt);
            }
        });

        CampoMesa.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        CampoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoMesaActionPerformed(evt);
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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(LabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(88, 88, 88))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(LabelId)
                    .addComponent(CampoMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("DATOS DE COMPROBANTE:");

        BotonImprimir.setText("IMPRIMIR BOUCHER");
        BotonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonImprimirActionPerformed(evt);
            }
        });

        ComboTIpoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOTA DE VENTA" }));
        ComboTIpoDoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboTIpoDocItemStateChanged(evt);
            }
        });
        ComboTIpoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTIpoDocActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel17.setText("Tipo de Documento:");

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel15.setText("Codigo Cliente:");

        CampoCodigo.setText("NN");
        CampoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigoActionPerformed(evt);
            }
        });

        BotonBuscar.setText("BUSCAR");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("IMPRIMIR COPIA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(ComboTIpoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(5, 5, 5)
                                        .addComponent(CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonBuscar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(BotonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(27, 27, 27)
                .addComponent(ComboTIpoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(BotonBuscar)
                    .addComponent(CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("PAGO:");

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("TOTAL A PAGAR:");

        CampoTotalPagar.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        CampoTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTotalPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(16, 16, 16))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LablePago1.setText("EFECTIVO");

        LabelPago2.setText("YAPE");

        LabelPago3.setText("VISA (pos)");

        CampoEfectivo.setText("0");
        CampoEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEfectivoActionPerformed(evt);
            }
        });
        CampoEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoEfectivoKeyTyped(evt);
            }
        });

        CampoYape.setText("0");
        CampoYape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoYapeKeyTyped(evt);
            }
        });

        CampoVisa.setText("0");
        CampoVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoVisaActionPerformed(evt);
            }
        });
        CampoVisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoVisaKeyTyped(evt);
            }
        });

        BotonGuardar.setBackground(new java.awt.Color(255, 255, 51));
        BotonGuardar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonGuardar.setText("GUARDAR");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        TodoEfectivo.setText("TODO E");
        TodoEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodoEfectivoActionPerformed(evt);
            }
        });

        TodoYape.setText("TODO Y");
        TodoYape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodoYapeActionPerformed(evt);
            }
        });

        TodoVisa.setText("TODO V");
        TodoVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodoVisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LabelPago2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LablePago1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoYape, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(CampoEfectivo)
                                    .addComponent(CampoVisa)))
                            .addComponent(LabelPago3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(TodoVisa)
                                .addGap(13, 13, 13))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TodoEfectivo)
                                    .addComponent(TodoYape))
                                .addGap(0, 54, Short.MAX_VALUE))))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LablePago1)
                    .addComponent(TodoEfectivo))
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoYape, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPago2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TodoYape))
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoVisa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPago3)
                    .addComponent(TodoVisa))
                .addGap(18, 18, 18)
                .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BotonLimpiar.setBackground(new java.awt.Color(102, 255, 51));
        BotonLimpiar.setText("LIMPIAR");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setText("Datos Guardados:");

        LabelEfectivo.setText("EFECTIVO");

        LabelYape.setText("YAPE");

        LabelVisa.setText("VISA (pos)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(LabelYape))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelEfectivo)
                            .addComponent(LabelVisa)))
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelEfectivo)
                        .addGap(18, 18, 18)
                        .addComponent(LabelYape)
                        .addGap(18, 18, 18)
                        .addComponent(LabelVisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("APLICAR DESC(en s/):");

        CampoDescuento.setText("0");
        CampoDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDescuentoActionPerformed(evt);
            }
        });
        CampoDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoDescuentoKeyTyped(evt);
            }
        });

        jLabel14.setText("TOTAL:");

        BotonDescuento.setText("APLICAR DESCUENTO");
        BotonDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDescuentoActionPerformed(evt);
            }
        });

        jLabel8.setText("*(Aplicar Descuento antes de imprimir el boucher)");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel14))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(BotonDescuento))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18))
        );

        BotonCerrar.setBackground(new java.awt.Color(255, 0, 0));
        BotonCerrar.setText("CERRAR");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(431, 431, 431))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(102, 255, 255));
        jButton2.setText("ATRAS <-");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonImprimirActionPerformed
        // TODO add your handling code here:
        
        actualizarPedido();
        actualizarMesa();
        guardarVenta(); 
        imprimirTicket();
        JOptionPane.showMessageDialog(this, "TICKET IMPRESO");
        //BotonImprimir.setEnabled(false);
        BotonGuardar.setEnabled(true);
        BotonLimpiar.setEnabled(true);
        BotonDescuento.setEnabled(false);
        BotonImprimir.setEnabled(false);
        
    }//GEN-LAST:event_BotonImprimirActionPerformed

    void guardarVenta(){
        double total= Double.parseDouble(CampoTotal.getText());
        double desc = Double.parseDouble(CampoDescuento.getText());
        
        
        String es = "A";
        Object[] obj = new Object[3];
        obj[0]=total;
        obj[1]=desc;
        obj[2]=es;
        
        ved.add(obj);
        if(VentasMesa.pe2.getMesa()==0){
           dao.updateIdVenta(ved.IdVenta(),VentasMesa.pe2.getId()); 
        }else{
           List<Pedido> listap = dao.listarPedidosxMesa(VentasMesa.pe2.getMesa());
            for(int j=0;j<listap.size();j++){
               dao.updateIdVenta(ved.IdVenta(),listap.get(j).getId()); 
            } 
        }
        
        
        
        
        
        
    }
    
    void actualizarMesa(){
        med.actualizarIdCaja(VentasMesa.pe2.getMesa()); 
    }
    
    void actualizarPedido(){
        
        List<Pedido> listap = dao.listarPedidosxMesa(VentasMesa.pe2.getMesa());
            
            for(int j=0;j<listap.size();j++){
                dao.updateCaja(listap.get(j).getId());
            }
            if(listap.size()==0){
                
            }
       
       
    }
    
    
    
    private void CampoTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTotalPagarActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_CampoTotalPagarActionPerformed

    private void CampoDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDescuentoActionPerformed

    private void CampoMozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoMozoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoMozoActionPerformed

    private void CampoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoMesaActionPerformed

    private void CampoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigoActionPerformed

    private void ComboTIpoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTIpoDocActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_ComboTIpoDocActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void ComboTIpoDocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboTIpoDocItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ComboTIpoDocItemStateChanged

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        
            
        if(!CampoEfectivo.getText().equals("0") || !CampoYape.getText().equals("0") || !CampoVisa.getText().equals("0") ){
            calcularVuelto();
            double total = Double.parseDouble(CampoTotal.getText());
            if((tp1+tp2+tp3)!=total){
               JOptionPane.showMessageDialog(this, "CANTIDADES MAL INGRESADAS");                       
            }else{
                
                guardarTipoPago();
                BotonGuardar.setEnabled(false);
                BotonLimpiar.setEnabled(false);
                JOptionPane.showMessageDialog(this, "GUARDADO TIPOS DE PAGO CON EXITO");
                mostarTipoPago();
                dispose();
            }
            
            
            
                
        
            
            
                                
        }else{
            JOptionPane.showMessageDialog(this, "INGRESAR LOS TIPOS DE PAGO");
        }
        
        
    }//GEN-LAST:event_BotonGuardarActionPerformed

    
    
    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void CampoEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEfectivoActionPerformed

    private void CampoVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoVisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoVisaActionPerformed

    private void BotonDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDescuentoActionPerformed
        // TODO add your handling code here:
        double total =Double.parseDouble(CampoTotalPagar.getText());
        double descuento = total -Double.parseDouble(CampoDescuento.getText());
        CampoTotal.setText(String.valueOf(descuento));
        CampoTotalPagar.setText(String.valueOf(descuento));
    }//GEN-LAST:event_BotonDescuentoActionPerformed

    private void CampoEfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoEfectivoKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_CampoEfectivoKeyTyped

    private void CampoYapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoYapeKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_CampoYapeKeyTyped

    private void CampoVisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoVisaKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_CampoVisaKeyTyped

    private void CampoDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoDescuentoKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_CampoDescuentoKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                imprimirTicket();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        VentasMesa ve = new VentasMesa();       
        Menu.VentanaPrincipal.add(ve);
        ve.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TodoEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodoEfectivoActionPerformed
        // TODO add your handling code here:
        CampoEfectivo.setText(CampoTotalPagar.getText());
        CampoYape.setText("0");
        CampoVisa.setText("0");
        
    }//GEN-LAST:event_TodoEfectivoActionPerformed

    private void TodoYapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodoYapeActionPerformed
        // TODO add your handling code here:
        CampoYape.setText(CampoTotalPagar.getText());
        CampoEfectivo.setText("0");
        CampoVisa.setText("0");
    }//GEN-LAST:event_TodoYapeActionPerformed

    private void TodoVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodoVisaActionPerformed
        // TODO add your handling code here:
        CampoVisa.setText(CampoTotalPagar.getText());
        CampoYape.setText("0");
        CampoEfectivo.setText("0");
    }//GEN-LAST:event_TodoVisaActionPerformed
    void calcularVuelto(){
        
        tp1 =Double.parseDouble(CampoEfectivo.getText());
        tp2 =Double.parseDouble(CampoYape.getText());
        tp3 =Double.parseDouble(CampoVisa.getText());
        
        
        
    }
    void guardarTipoPago(){
        
        if(tp1!=0){
            String a = "EFECTIVO";
            Object[] ob= new Object[4];
            ob[0]=a;
            ob[1]=ved.IdVenta();
            ob[2]=tp1;
            ob[3]="A";
            tpd.add(ob);           
        }
        if(tp2!=0){
            String b = "YAPE";
            Object[] ob= new Object[4];
            ob[0]=b;
            ob[1]=ved.IdVenta();
            ob[2]=tp2;
            ob[3]="A";
            tpd.add(ob);           
        }
        if(tp3!=0){
            String c = "VISA";
            Object[] ob= new Object[4];
            ob[0]=c;
            ob[1]=ved.IdVenta();
            ob[2]=tp3;
            ob[3]="A";
            tpd.add(ob);           
        }
        
      
        
    }
    
    void mostarTipoPago(){
        List<TipoPago> listatp= tpd.listarxIdVent(ved.IdVenta());
           
            for(int i=0;i<listatp.size();i++){
                if(listatp.get(i).getNombre().equals("EFECTIVO")){
                    LabelEfectivo.setText("EFECTIVO "+listatp.get(i).getCantidad());
                }
                if(listatp.get(i).getNombre().equals("YAPE")){
                    LabelYape.setText("YAPE "+listatp.get(i).getCantidad());
                }
                if(listatp.get(i).getNombre().equals("VISA")){
                    LabelVisa.setText("VISA "+listatp.get(i).getCantidad());
                }       
                
                
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonDescuento;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonImprimir;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JTextField CampoCodigo;
    private javax.swing.JTextField CampoDescuento;
    private javax.swing.JTextField CampoEfectivo;
    private javax.swing.JTextField CampoMesa;
    public static javax.swing.JTextField CampoMozo;
    private javax.swing.JTextField CampoTotal;
    private javax.swing.JTextField CampoTotalPagar;
    private javax.swing.JTextField CampoVisa;
    private javax.swing.JTextField CampoYape;
    private javax.swing.JComboBox<String> ComboTIpoDoc;
    private javax.swing.JLabel LabelEfectivo;
    public static javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelPago2;
    private javax.swing.JLabel LabelPago3;
    private javax.swing.JLabel LabelVisa;
    private javax.swing.JLabel LabelYape;
    private javax.swing.JLabel LablePago1;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton TodoEfectivo;
    private javax.swing.JButton TodoVisa;
    private javax.swing.JButton TodoYape;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
