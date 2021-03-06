/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optim;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Ugueto
 * ugueto.luis19@gmail.com
 */
public class VentanaAR extends javax.swing.JFrame {
    private List<JTextField> jTextFields;
    private int indice;
    private int x = 70, y = 55;
    private float confianzaGlobal = 0, tiempoentrega = 0;
    private float cantidadEconPedido, tiempoPed,  pedidosAnio,  costoCompra,  costoMantInventario, costoAnual, nivelServicioCEP;
    private ArrayList<Double> CCx, CMx, CTx;
    private int XNx, graficaNumberCEP = 0;
    private GraficaCEP graficaCEP = null;
    
    private float puntopex, nivelserx, nsminxx, nsmaxx, confianzaGlobalx, tiempoentregax;
    private double ppminxx, ppmaxx, stockminimox, dapx, tpumx, sumaDemandaAnualx;
    private int cpx;
    
    private GraficoPDPNivelConfianza graficoNC = null;
    
    private ArrayList<GraficoPDPNivelConfianza> listGraficoNC = new ArrayList<GraficoPDPNivelConfianza>();
    private ArrayList<GraficoNivelServicioNC> listnivelServicioNC = new ArrayList<GraficoNivelServicioNC>();
    private ArrayList<GraficoNivelServicioTiempoEntrega> listgraficoTE = new ArrayList<GraficoNivelServicioTiempoEntrega>();
    private ArrayList<GraficaCEP> listgraficaCEP = new ArrayList<GraficaCEP>();
    
    private GraficoNivelServicioNC nivelServicioNC = null;
    private GraficoNivelServicioTiempoEntrega graficoTE = null;
    private JTable table = null;
    private DefaultTableModel model = new DefaultTableModel(); 
    private int graficaNumberNC = 0, graficaNumbernivelServicioNC = 0, graficaNumberTE = 0;
    
    /**
     * Creates new form VentanaAR
     */
    public VentanaAR() {
        initComponents();
        jTextFields = new ArrayList<>();
        indice = 0;
        demandaAnual.setEditable(false);   
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/imagenes/logo-trans-small.png")));
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        procesarPunto.setBackground(Color.decode("#3e8f3e"));
        procesarPunto.setForeground(Color.white);
        jButton1.setBackground(Color.decode("#3e8f3e"));
        jButton1.setForeground(Color.white);
        clearPunto.setBackground(Color.decode("#ee4444"));
        clearPunto.setForeground(Color.white);
        jButton2.setBackground(Color.decode("#ee4444"));
        jButton2.setForeground(Color.white);
        procesarCantidad.setBackground(Color.decode("#3e8f3e"));
        procesarCantidad.setForeground(Color.white);
        clearCantidad.setBackground(Color.decode("#ee4444"));
        clearCantidad.setForeground(Color.white);
        jButton6.setBackground(Color.decode("#3e8f3e"));
        jButton6.setForeground(Color.white);
        jButton7.setBackground(Color.decode("#3e8f3e"));
        jButton7.setForeground(Color.white);
        jButton8.setBackground(Color.decode("#3e8f3e"));
        jButton8.setForeground(Color.white);
        
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        
        jButton5.setBackground(Color.decode("#3e8f3e"));
        jButton5.setForeground(Color.white);
        jButton5.setEnabled(false);
        
        
        table = new JTable(model); 
        table.setBounds(20, 20, 300, 400);

        // COLUMNAS TABLA
        model.addColumn("Q"); 
        model.addColumn("CC"); 
        model.addColumn("CM"); 
        model.addColumn("CT"); 
                
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 350, 450, 180);
        panelResultadosBR2.add(scrollPane, BorderLayout.CENTER);
        
        jLabel48.setText("<html><body>Costo de mantener en inventario la <br>cantidad económica de pedido:</body></html>");
        jLabel49.setText("<html><body>Costo de compra de la cantidad <br>económica de pedido:</body></html>");
        jLabel50.setText("<html><body>Costo total anual de la cantidad <br>económica de pedido:</body></html>");
        jLabel51.setText("<html><body>Nivel de servicio para la cantidad <br>económica de pedido:</body></html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pdp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        puntoPedi = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        nivelServiText = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelTiempoEntrega = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        t0 = new javax.swing.JTextField();
        clearPunto = new javax.swing.JButton();
        m5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        procesarPunto = new javax.swing.JButton();
        m11 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        m10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        m8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        m7 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        m2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        m3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        m12 = new javax.swing.JTextField();
        demandaAnual = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        m9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cantidadCompradaItem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        m6 = new javax.swing.JTextField();
        consecuenciaIndisponibilidad = new javax.swing.JComboBox<String>();
        m4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        PORCENTAJE_COSTO = new javax.swing.JTextField();
        DEMANDA_TOTAL_ANUAL = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        COSTO_UNITARIO = new javax.swing.JTextField();
        COSTO_PROCESAMIENTO_PEDIDO = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        procesarCantidad = new javax.swing.JButton();
        clearCantidad = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        panelResultadosBR2 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        cantidadEconomicaPedido2 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        tiempoEntrePedidos2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        pedidosAnuales2 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        costoMantenerInventario2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        costoDeCompra2 = new javax.swing.JTextField();
        costoTotalAnual2 = new javax.swing.JTextField();
        nivelserviciocep2 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        criticidadCantidad = new javax.swing.JPanel();
        criticidadLabel = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 480));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Datos del Punto de Pedido");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("RESULTADOS");

        jLabel3.setText("Punto de Pedido:");

        puntoPedi.setEditable(false);

        jLabel30.setText("Nivel de Servicio:");

        nivelServiText.setEditable(false);

        jButton6.setText("Ver Gráfica Nivel de servicio en función del nivel de confianza");
        jButton6.setPreferredSize(new java.awt.Dimension(331, 23));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Ver Gráfica Puntos de pedido en función del nivel de confianza");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Ver Gráfica Nivel de servicio en función del tiempo de entrega");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel11.setText("Julio");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelTiempoEntrega.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setText("Pedido");

        jLabel20.setText("Días");

        jLabel21.setText("1");

        t0.setToolTipText("Días. Ejemplo: 10");
        t0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t0ActionPerformed(evt);
            }
        });
        t0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t0KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelTiempoEntregaLayout = new javax.swing.GroupLayout(panelTiempoEntrega);
        panelTiempoEntrega.setLayout(panelTiempoEntregaLayout);
        panelTiempoEntregaLayout.setHorizontalGroup(
            panelTiempoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiempoEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTiempoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTiempoEntregaLayout.createSequentialGroup()
                        .addGroup(panelTiempoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(panelTiempoEntregaLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelTiempoEntregaLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        panelTiempoEntregaLayout.setVerticalGroup(
            panelTiempoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiempoEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTiempoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTiempoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(t0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(panelTiempoEntrega);

        clearPunto.setText("Borrar Datos");
        clearPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearPuntoActionPerformed(evt);
            }
        });

        m5.setToolTipText("Ejemplo: 10");
        m5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m5KeyTyped(evt);
            }
        });

        jLabel10.setText("Junio");

        jLabel12.setText("Agosto");

        jLabel15.setText("Noviembre");

        procesarPunto.setText("Procesar");
        procesarPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarPuntoActionPerformed(evt);
            }
        });

        m11.setToolTipText("Ejemplo: 10");
        m11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m11KeyTyped(evt);
            }
        });

        jLabel6.setText("Febrero");

        m10.setToolTipText("Ejemplo: 10");
        m10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m10KeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("<html>Añadir<br>Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        m8.setToolTipText("Ejemplo: 10");
        m8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m8KeyTyped(evt);
            }
        });

        jLabel18.setText("Tiempos de Entrega");

        m7.setToolTipText("Ejemplo: 10");
        m7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m7KeyTyped(evt);
            }
        });

        jLabel28.setText("Demanda Anual");

        jLabel5.setText("Enero");

        jLabel8.setText("Abril");

        m2.setToolTipText("Ejemplo: 10");
        m2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m2KeyTyped(evt);
            }
        });

        jLabel7.setText("Marzo");

        jLabel9.setText("Mayo");

        m3.setToolTipText("Ejemplo: 10");
        m3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m3KeyTyped(evt);
            }
        });

        jLabel13.setText("Septiembre");

        m12.setToolTipText("Ejemplo: 10");
        m12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m12KeyTyped(evt);
            }
        });

        demandaAnual.setEditable(false);
        demandaAnual.setToolTipText("Piezas");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setText("<html>Remover<br>Pedido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel17.setText("<html>Consecuencia de la Indispon.");

        jLabel22.setText("Cantidad comprada por pedido");

        jLabel16.setText("Diciembre");

        m9.setToolTipText("Ejemplo: 10");
        m9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m9KeyTyped(evt);
            }
        });

        jLabel14.setText("Octubre");

        cantidadCompradaItem.setToolTipText("Piezas. Ejemplo: 10");
        cantidadCompradaItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadCompradaItemKeyTyped(evt);
            }
        });

        jLabel4.setText("Cantidad utilizada por mes (Piezas)");

        m1.setToolTipText("Ejemplo: 10");
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });
        m1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m1KeyTyped(evt);
            }
        });

        m6.setToolTipText("Ejemplo: 10");
        m6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m6KeyTyped(evt);
            }
        });

        consecuenciaIndisponibilidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No afecta la producción", "Afecta parcialmente la producción", "Paraliza totalmente la producción" }));
        consecuenciaIndisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consecuenciaIndisponibilidadActionPerformed(evt);
            }
        });

        m4.setToolTipText("Ejemplo: 10");
        m4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                m4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 47, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(demandaAnual))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cantidadCompradaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(consecuenciaIndisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(procesarPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(consecuenciaIndisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadCompradaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(demandaAnual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearPunto)
                    .addComponent(procesarPunto))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout pdpLayout = new javax.swing.GroupLayout(pdp);
        pdp.setLayout(pdpLayout);
        pdpLayout.setHorizontalGroup(
            pdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addGroup(pdpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdpLayout.createSequentialGroup()
                        .addGroup(pdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pdpLayout.createSequentialGroup()
                        .addGroup(pdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pdpLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(pdpLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntoPedi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nivelServiText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pdpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addGroup(pdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(70, 70, 70))
        );
        pdpLayout.setVerticalGroup(
            pdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdpLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pdpLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(pdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(puntoPedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(nivelServiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PUNTO DE PEDIDO", pdp);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Resultados");

        jLabel24.setText("Demanda Total Anual:");

        PORCENTAJE_COSTO.setToolTipText("%. Ejemplo: 10.5");
        PORCENTAJE_COSTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PORCENTAJE_COSTOActionPerformed(evt);
            }
        });
        PORCENTAJE_COSTO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PORCENTAJE_COSTOKeyTyped(evt);
            }
        });

        DEMANDA_TOTAL_ANUAL.setToolTipText("Piezas. Ejemplo: 10");
        DEMANDA_TOTAL_ANUAL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DEMANDA_TOTAL_ANUALKeyTyped(evt);
            }
        });

        jLabel25.setText("Costo unitario de cada artículo:");

        jLabel26.setText("Costo de procesamiento de cada pedido:");

        COSTO_UNITARIO.setToolTipText("$. Ejemplo: 10.0");
        COSTO_UNITARIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                COSTO_UNITARIOKeyTyped(evt);
            }
        });

        COSTO_PROCESAMIENTO_PEDIDO.setToolTipText("$. Ejemplo: 10.0");
        COSTO_PROCESAMIENTO_PEDIDO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                COSTO_PROCESAMIENTO_PEDIDOKeyTyped(evt);
            }
        });

        jLabel27.setText("Porcentaje del costo unitario del artículo:");

        procesarCantidad.setText("Procesar");
        procesarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarCantidadActionPerformed(evt);
            }
        });

        clearCantidad.setText("Borrar Datos");
        clearCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCantidadActionPerformed(evt);
            }
        });

        panelResultadosBR2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelResultadosBR2.setPreferredSize(new java.awt.Dimension(480, 630));

        jLabel45.setText("Cantidad económica de Pedido:");

        cantidadEconomicaPedido2.setEditable(false);
        cantidadEconomicaPedido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadEconomicaPedido2ActionPerformed(evt);
            }
        });

        jLabel46.setText("Tiempo entre pedidos:");

        tiempoEntrePedidos2.setEditable(false);

        jLabel47.setText("Nº de pedidos al año:");

        pedidosAnuales2.setEditable(false);

        jLabel48.setText("jLabel5");

        costoMantenerInventario2.setEditable(false);

        jButton5.setText("Ver Gráfica Cantidad de Pedido");
        jButton5.setToolTipText("Ver Gráfica (Confiabilidad por cantidad de producto)");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        costoDeCompra2.setEditable(false);

        costoTotalAnual2.setEditable(false);
        costoTotalAnual2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoTotalAnual2ActionPerformed(evt);
            }
        });

        nivelserviciocep2.setEditable(false);

        jLabel49.setText("jLabel6");

        jLabel50.setText("jLabel7");

        jLabel51.setText("jLabel8");

        javax.swing.GroupLayout panelResultadosBR2Layout = new javax.swing.GroupLayout(panelResultadosBR2);
        panelResultadosBR2.setLayout(panelResultadosBR2Layout);
        panelResultadosBR2Layout.setHorizontalGroup(
            panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosBR2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5)
                    .addGroup(panelResultadosBR2Layout.createSequentialGroup()
                        .addGroup(panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tiempoEntrePedidos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(pedidosAnuales2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costoMantenerInventario2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costoDeCompra2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costoTotalAnual2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nivelserviciocep2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadEconomicaPedido2))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        panelResultadosBR2Layout.setVerticalGroup(
            panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosBR2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadEconomicaPedido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(tiempoEntrePedidos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(pedidosAnuales2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(costoMantenerInventario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoDeCompra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoTotalAnual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivelserviciocep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jScrollPane4.setViewportView(panelResultadosBR2);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Cantidad Económica de Pedido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(procesarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23)))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DEMANDA_TOTAL_ANUAL, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(COSTO_UNITARIO)
                            .addComponent(COSTO_PROCESAMIENTO_PEDIDO)
                            .addComponent(PORCENTAJE_COSTO))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator4)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(DEMANDA_TOTAL_ANUAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(COSTO_UNITARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(COSTO_PROCESAMIENTO_PEDIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(PORCENTAJE_COSTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procesarCantidad)
                    .addComponent(clearCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CANTIDAD ECONÓMICA DE PEDIDO", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        criticidadLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        criticidadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        criticidadLabel.setText("<html>CRITICIDAD");
        criticidadLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout criticidadCantidadLayout = new javax.swing.GroupLayout(criticidadCantidad);
        criticidadCantidad.setLayout(criticidadCantidadLayout);
        criticidadCantidadLayout.setHorizontalGroup(
            criticidadCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criticidadCantidadLayout.createSequentialGroup()
                .addComponent(criticidadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        criticidadCantidadLayout.setVerticalGroup(
            criticidadCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(criticidadLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Criticidad del Artículo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(criticidadCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel29)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(17, 17, 17)
                .addComponent(criticidadCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarCEP(){
        if(DEMANDA_TOTAL_ANUAL.getText().isEmpty() || DEMANDA_TOTAL_ANUAL.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar los campos vacíos!");   
            return false;
        }
        if(COSTO_UNITARIO.getText().isEmpty() || COSTO_UNITARIO.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar los campos vacíos!");   
            return false;
        }
        if(COSTO_PROCESAMIENTO_PEDIDO.getText().isEmpty() || COSTO_PROCESAMIENTO_PEDIDO.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar los campos vacíos!");   
            return false;
        }
        if(PORCENTAJE_COSTO.getText().isEmpty() || PORCENTAJE_COSTO.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar los campos vacíos!");   
            return false;
        }
        return true;
    }
    public boolean procesarCEP(){
        try {
            if(validarCEP()){
                if(graficaNumberCEP == 1){
                    listgraficaCEP.forEach((a)->a.closeJFrame());
                    graficaNumberCEP = 0;
                }
                int demandaTotalAnual;
                float costoProcesamientoPedido, costoUnitario, porcentajeCosto, porcentajeCostoFinal;

                demandaTotalAnual = (int)parseInt(""+DEMANDA_TOTAL_ANUAL.getText());

                costoProcesamientoPedido = (float)parseInt(""+COSTO_PROCESAMIENTO_PEDIDO.getText());

                costoUnitario = parseFloat(""+COSTO_UNITARIO.getText());
                porcentajeCosto = parseFloat(""+PORCENTAJE_COSTO.getText());

                porcentajeCosto = porcentajeCosto/100;
                float cantidadEconomicaPe = (float) Math.sqrt(( 2 * demandaTotalAnual * costoProcesamientoPedido ) / (porcentajeCosto * costoUnitario));

                float pedidosAnual = demandaTotalAnual / cantidadEconomicaPe;
                float tiempoEntrePe = 365 / pedidosAnual;
                float costoDeComp = (demandaTotalAnual / cantidadEconomicaPe) * costoProcesamientoPedido;
                float costoMantenerInv = (cantidadEconomicaPe/2) * costoUnitario * porcentajeCosto;
                float costoTotalA = costoDeComp + costoMantenerInv;
                porcentajeCostoFinal = porcentajeCosto*100;

                this.cantidadEconPedido = cantidadEconomicaPe;
                this.pedidosAnio = pedidosAnual;
                this.tiempoPed = tiempoEntrePe;
                this.costoCompra = costoDeComp;
                this.costoMantInventario = costoMantenerInv;
                this.costoAnual = costoTotalA;

                return true;
            }
        }
        catch (Exception e) { 
            JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());   
        }
        return false;
    }
    
    public boolean graficarCEP(){
        try{
            if(procesarCEP()){
                if(graficaNumberCEP == 1){
                    this.graficaCEP.closeJFrame();
                }
                
                int val =0;
                float demandaTotalAnual, costoProcesamientoPedido, costoUnitario, porcentajeCosto;

                demandaTotalAnual = parseFloat(DEMANDA_TOTAL_ANUAL.getText());
                costoProcesamientoPedido = parseFloat(COSTO_PROCESAMIENTO_PEDIDO.getText());
                costoUnitario = parseFloat(COSTO_UNITARIO.getText());
                porcentajeCosto = parseFloat(PORCENTAJE_COSTO.getText());

                porcentajeCosto = porcentajeCosto/100;
                float cantidadEconomicaPed = (float) Math.sqrt(( 2 * demandaTotalAnual * costoProcesamientoPedido ) / (porcentajeCosto * costoUnitario));
                float pedidosAnual = demandaTotalAnual / cantidadEconomicaPed;
                float tiempoEntrePed = 365 / pedidosAnual;
                float costoDeComp = (demandaTotalAnual / cantidadEconomicaPed) * costoProcesamientoPedido;
                float costoMantenerInv = (cantidadEconomicaPed/2) * costoUnitario * porcentajeCosto;
                float costoTotalAn = costoDeComp + costoMantenerInv;

                float nivelserv = 0;

                /* if (confianzaGlobal == 0 || tiempoentrega == -1) {
                    JOptionPane.showMessageDialog(null, "No se ha calculado el nivel de servicio: Faltan datos del punto de pedido.");
                    return false;
                } else { */
                    nivelserv = 100 - ((100-confianzaGlobal)*tiempoentrega*demandaTotalAnual)/(365*cantidadEconomicaPed);
                    this.nivelServicioCEP = nivelserv;
                // }

                int XN = 0;
                ArrayList<Integer> XV = new ArrayList<Integer>();
                ArrayList<Double> CC = new ArrayList<Double>();
                ArrayList<Double> CM = new ArrayList<Double>();
                ArrayList<Double> CT = new ArrayList<Double>();
                
                
                for (int Q = 1; ; Q++) {            
                    //XV.add(Q);
                    double mul1 = (demandaTotalAnual/Q)*costoProcesamientoPedido;
                    CC.add(mul1);

                    Double d = (double)Q/2;
                    double mul2 = (d.floatValue()*costoUnitario)*porcentajeCosto;
                    CM.add(mul2);

                    double suma = CC.get(Q-1).doubleValue() + CM.get(Q-1).doubleValue();
                    CT.add(suma);
                  if (CC.get(Q-1).floatValue() <= CM.get(Q-1).floatValue() && (int)XN == 0) {
                    val = Q-1;
                    Double dd = (double)Q/5+1;
                    XN = dd.intValue()*5;
                    XN = XN +5;
                  }
                  if (Q == (int)XN) break;
                }
                
                this.CCx = CC;
                this.CMx = CM;
                this.CTx = CT;
                this.XNx = XN;
                
                int max = 0;

                cantidadEconomicaPedido2.setText(""+Math.round(this.cantidadEconPedido * 100d) / 100d );
                tiempoEntrePedidos2.setText(""+Math.round(this.tiempoPed * 100d) / 100d );
                pedidosAnuales2.setText(""+Math.round(this.pedidosAnio * 100d) / 100d );
                costoMantenerInventario2.setText(""+Math.round(this.costoMantInventario * 100d) / 100d );
                costoDeCompra2.setText(""+Math.round(this.costoCompra * 100d) / 100d );
                costoTotalAnual2.setText(""+Math.round(this.costoAnual * 100d) / 100d );
                nivelserviciocep2.setText(""+Math.round(this.nivelServicioCEP * 100d) / 100d );
                
                

                int numRows = 0;
                int maxx = 0;

                int valB = 0;

                if(val == 1){
                    valB = val-1;
                }
                if(val == 2){
                    valB = val-2;
                }
                if(val == 3){
                    valB = val-3;
                }
                if(val == 4){
                    valB = val-4;
                }
                if(val == 5){
                    valB = val-5;
                }

                if(this.table != null)
                {
                    for( int i = model.getRowCount() - 1; i >= 0; i-- )
                    {
                        model.removeRow(i);
                    }
                }
                
                for (int K = val+5; K >= valB; K--) {
                    if (K==1) maxx = CT.get(K).intValue();

                    // AGREGANDO COLUMNAS TABLA
                    model.addRow(new Object[]{K+1, Math.round((double)CC.get(K) * 100d) / 100d, Math.round((double)CM.get(K) * 100d) / 100d, Math.round((double)CT.get(K) * 100d) / 100d});
                    numRows++;
                    if (val == K){
                        // AQUI VA EL ROW SELECCIONADO
                        table.setRowSelectionInterval(numRows-1, numRows-1);
                    }
                }    
                
                table.setVisible(true);
                jButton5.setEnabled(true);
                //ResultadosAR resultadosFrame = new ResultadosAR(this.cantidadEconPedido, this.tiempoPed, this.pedidosAnio, this.costoCompra, this.costoMantInventario, this.costoAnual, this.nivelServicioCEP, CC, CM, CT, val, XN);

                //Create the scroll pane and add the table to it. 

                //Add the scroll pane to this window.
                //resultadosFrame.setVisible(true);
                //resultadosFrame.show();	
            }
            return true;
        }
        catch (Exception e) { 
            JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());   
        }
        return false; 
    }
    
    public boolean validarPDP(){
        if(m1.getText().isEmpty() || m1.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Enero vacío!");   
            return false;
        }
        if(m2.getText().isEmpty() || m2.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Febrero vacío!");   
            return false;
        }
        if(m3.getText().isEmpty() || m3.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Marzo vacío!");   
            return false;
        }
        if(m4.getText().isEmpty() || m4.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Abril vacío!");   
            return false;
        }
        if(m5.getText().isEmpty() || m5.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Mayo vacío!");   
            return false;
        }
        if(m6.getText().isEmpty() || m6.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Junio vacío!");   
            return false;
        }
        if(m7.getText().isEmpty() || m7.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Julio vacío!");   
            return false;
        }
        if(m8.getText().isEmpty() || m8.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Agosto vacío!");   
            return false;
        }
        if(m9.getText().isEmpty() || m9.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Septiembre vacío!");   
            return false;
        }
        if(m10.getText().isEmpty() || m10.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Octubre vacío!");   
            return false;
        }
        if(m11.getText().isEmpty() || m11.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Noviembre vacío!");   
            return false;
        }
        if(m12.getText().isEmpty() || m12.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Diciembre vacío!");   
            return false;
        }
        if(cantidadCompradaItem.getText().isEmpty() || cantidadCompradaItem.getText() == null){
            JOptionPane.showMessageDialog(null, "No puede dejar  el campo Cantidad Comprada por pedido vacío!");   
            return false;
        }
        if(!validarPedidos()){
            JOptionPane.showMessageDialog(null, "No puede dejar los pedidos vacíos!");
            return false;
        }
            
        return true;
    }
    
    public boolean validarPedidos(){
        Component[] children = panelTiempoEntrega.getComponents();
        for (int i=0;i<children.length;i++){
            if (children[i] instanceof JTextField){
                String text = ((JTextField)children[i]).getText();
                if(!text.isEmpty()){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean procesarPDP(){
        try{
            if(validarPDP()){
                if(this.graficaNumberCEP == 1){
                    //this.graficaCEP.closeJFrame();
                    listgraficaCEP.forEach((a)->a.closeJFrame());
                }
                if(this.graficaNumberNC == 1){
                    //this.graficoNC.closeJFrame();
                    listGraficoNC.forEach((a)->a.closeJFrame());
                }
                if(this.graficaNumbernivelServicioNC == 1){
                    //this.nivelServicioNC.closeJFrame();
                    listnivelServicioNC.forEach((a)->a.closeJFrame());
                }
                if(this.graficaNumberTE == 1){
                    //this.graficoTE.closeJFrame();
                    listgraficoTE.forEach((a)->a.closeJFrame());
                }
                this.tiempoentrega = 0;
                ArrayList meses=new ArrayList();
                ArrayList tiempos=new ArrayList();
                int cp = parseInt(""+cantidadCompradaItem.getText());
                int consecuencia = 0;
                int lineas = 0;

                if(consecuenciaIndisponibilidad.getSelectedItem().toString().equalsIgnoreCase("No afecta la producción"))
                {
                    consecuencia = 1;
                }
                if(consecuenciaIndisponibilidad.getSelectedItem().toString().equalsIgnoreCase("Afecta parcialmente la producción"))
                {
                    consecuencia = 2;
                }
                if(consecuenciaIndisponibilidad.getSelectedItem().toString().equalsIgnoreCase("Paraliza totalmente la producción"))
                {
                    consecuencia = 4;
                }
                int indisponibilidad = consecuencia;
                int ndap;
                double da[] = new double[12];

                String post[] = new String[3];

                post[1] = ""+indisponibilidad;
                post[2] = ""+cp;

                switch (indisponibilidad) {
                    case 1: this.confianzaGlobal = 80; break;
                    case 2: this.confianzaGlobal = 95; break;
                    case 4: this.confianzaGlobal = (float) 99.9; break;
                    default: 
                        JOptionPane.showMessageDialog(null, "Error de indisponibilidad");
                    break;
                }	

                // SUMA DE LA DEMANDA ANUAL
                int sumaDemandaAnual = 0;
                sumaDemandaAnual+=parseInt(""+m1.getText());
                da[0] = (double)parseInt(""+m1.getText());
                post[0] = ""+(float)parseInt(""+m1.getText());

                sumaDemandaAnual+=parseInt(""+m2.getText());
                da[1] = (double)parseInt(""+m2.getText());

                sumaDemandaAnual+=parseInt(""+m3.getText());
                da[2] = (double)parseInt(""+m3.getText());

                sumaDemandaAnual+=parseInt(""+m4.getText());
                da[3] = (double)parseInt(""+m4.getText());

                sumaDemandaAnual+=parseInt(""+m5.getText());
                da[4] = (double)parseInt(""+m5.getText());

                sumaDemandaAnual+=parseInt(""+m6.getText());
                da[5] = (double)parseInt(""+m6.getText());

                sumaDemandaAnual+=parseInt(""+m7.getText());
                da[6] = (double)parseInt(""+m7.getText());

                sumaDemandaAnual+=parseInt(""+m8.getText());
                da[7] = (double)parseInt(""+m8.getText());

                sumaDemandaAnual+=parseInt(""+m9.getText());
                da[8] = (double)parseInt(""+m9.getText());

                sumaDemandaAnual+=parseInt(""+m10.getText());
                da[9] = (double)parseInt(""+m10.getText());

                sumaDemandaAnual+=parseInt(""+m11.getText());
                da[10] = (double)parseInt(""+m11.getText());

                sumaDemandaAnual+=parseInt(""+m12.getText());
                da[11] = (double)parseInt(""+m12.getText());

                // OBTENER TEXTO DE LOS TEXT FIELDS DE TIEMPO DE ENTREGA
                Component[] children = panelTiempoEntrega.getComponents();
                for (int i=1;i<=children.length;i++){
                    if (children[i-1] instanceof JTextField){
                        String text = ((JTextField)children[i-1]).getText();
                        lineas++;
                        this.tiempoentrega += parseInt(text);

                        if(i == 1) post[2] = text;
                        else post[2] = post[2]+','+text;
                    }
                }

                float auxTiempoEntrega;
                auxTiempoEntrega = this.tiempoentrega / lineas; 
                this.tiempoentrega  = auxTiempoEntrega;

                ndap = criticidad(indisponibilidad, this.tiempoentrega );

                double stockminimo = (this.tiempoentrega*((double) sumaDemandaAnual/365));
                double tpum = (double)sumaDemandaAnual/(double)12;
                double dap=0;

                for (int i = 0; i < 12; i++) {
                    double auxDa = Math.abs((da[i]-tpum));   
                    da[i] = auxDa;
                    dap = dap + da[i];
                }

                double auxDap = dap/12;
                dap = auxDap;

                float stockseguridad = (float) ((stockminimo*ndap*dap)/tpum);
                float puntope = (float) (stockminimo + stockseguridad);
                float nivelser = 100 - ((100-this.confianzaGlobal)*this.tiempoentrega*sumaDemandaAnual)/(cp*365);

                demandaAnual.setText(""+(int)sumaDemandaAnual);
                DEMANDA_TOTAL_ANUAL.setText(""+(int)sumaDemandaAnual);
                puntoPedi.setText(""+Math.round(puntope * 100d) / 100d);
                nivelServiText.setText(""+Math.round(nivelser * 100d) / 100d);
                uptcrit(ndap);     

                // Grafico PDP en función al Nivel de confianza
                double ppmin= ((stockminimo * 0 * dap)/tpum) + stockminimo;
                double ppmax= ((stockminimo * 5 * dap)/tpum) + stockminimo;

               // GraficoPDPNivelConfianza graficoNC = new GraficoPDPNivelConfianza(ppmin, ppmax, this.confianzaGlobal);

                // Grafico Nivel de Servicio en función del nivel de Confianza
                float nsmin = 100 - ((100-80)*sumaDemandaAnual*this.tiempoentrega)/(cp*365);
                if (nsmin > 1) nsmin -= 2;

                float nsmax = (float) (100 - ((100-99.99)*sumaDemandaAnual*this.tiempoentrega)/(cp*365));
                // GraficoNivelServicioNC nivelServicioNC = new GraficoNivelServicioNC(nsmin, nsmax, this.confianzaGlobal, nivelser);

                // Grafico Nivel de Servicio en función al tiempo de entrega
                // GraficoNivelServicioTiempoEntrega graficoTE = new GraficoNivelServicioTiempoEntrega(ppmin, ppmax, nivelser, this.tiempoentrega);
                jButton6.setEnabled(true);
                jButton7.setEnabled(true);
                jButton8.setEnabled(true);
                
                puntopex = puntope;
                nivelserx = nivelser;
                ppminxx = ppmin; 
                ppmaxx = ppmax; 
                nsminxx = nsmin; 
                nsmaxx = nsmax;
                confianzaGlobalx = this.confianzaGlobal;
                tiempoentregax = this.tiempoentrega; 
                stockminimox = stockminimo;
                dapx = dap;
                tpumx = tpum;
                sumaDemandaAnualx = sumaDemandaAnual;
                cpx = cp;
                
                jButton6.setEnabled(true);
                jButton7.setEnabled(true);
                jButton8.setEnabled(true);
                //ResultadosARPDP resultados = new ResultadosARPDP(puntope, nivelser, ppmin, ppmax, nsmin, nsmax,this.confianzaGlobal, this.tiempoentrega, stockminimo, dap, tpum, sumaDemandaAnual, cp);
            }
        }
        catch (Exception e) { 
            JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());   
        }
        return false;
    }
    
    public int criticidad (int indisponibilidad, float tiempo) {
        int criticidad=-1;
        if (tiempo == 0 || indisponibilidad == 0) criticidad = 0;
        if (tiempo > 0 && tiempo < 10) {
            switch(indisponibilidad) {
                case 1: case 2: criticidad=1; break;
                case 4: criticidad=2; break; 
            }
        };
        if (tiempo >= 10 && tiempo <= 30) {
            switch(indisponibilidad) {
                case 1: criticidad = 1; break;
                case 2: criticidad = 2; break;
                case 4: criticidad = 4; break;
            }
        };
        if (tiempo > 30) {
            switch(indisponibilidad) {
                case 1: criticidad = 2; break;
                case 2: case 4: criticidad = 4; break;
            }
        };
        return criticidad;
    }

    
    public void uptcrit (int criticidad) {
        String texto=""; int valor=0;

        if (criticidad == 4) {
            texto = "Alta";
            criticidadCantidad.setBackground(Color.RED);
            // valor = 100;
        }
        else if (criticidad == 2) {
            texto = "Media";
            criticidadCantidad.setBackground(Color.ORANGE);
            // valor = 60;
        }
        else if (criticidad == 1) {
            texto = "Baja";
            criticidadCantidad.setBackground(Color.GREEN);
            // valor = 30;
        }

        criticidadLabel.setText(texto);
        
    }
        
    private void clearCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCantidadActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clearCantidadActionPerformed

    private void clearFields(){
        if(this.graficaCEP != null && this.graficaCEP.getVentana().isVisible()) {
            //this.graficaCEP.closeJFrame();
            graficaNumberCEP = 0;
            listgraficaCEP.forEach((a)->a.closeJFrame());
        }
        
        if(this.graficoNC != null && this.graficoNC.getVentana().isVisible()) {
            //this.graficoNC.closeJFrame();
            this.graficaNumberNC = 0;
            listGraficoNC.forEach((a)->a.closeJFrame());
        }
        
        if(this.nivelServicioNC != null && this.nivelServicioNC.getVentana().isVisible()) {
            //this.nivelServicioNC.closeJFrame();
            this.graficaNumbernivelServicioNC = 0;
            listnivelServicioNC.forEach((a)->a.closeJFrame());
        }
        
        if(this.graficoTE != null && this.graficoTE.getVentana().isVisible()) {
            //this.graficoTE.closeJFrame();
            this.graficaNumberTE = 0;
            listgraficoTE.forEach((a)->a.closeJFrame());
        }
        if(this.table != null)
            this.table.setVisible(false);
        
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        m1.setText("");
        m2.setText("");
        m3.setText("");
        m4.setText("");
        m5.setText("");
        m6.setText("");
        m7.setText("");
        m8.setText("");
        m9.setText("");
        m10.setText("");
        m11.setText("");
        m12.setText("");
        
        
        Component[] children = panelTiempoEntrega.getComponents();
        for (int i=0;i<children.length;i++){
            if (children[i] instanceof JTextField){
                ((JTextField)children[i]).setText("");
            }
        }
        cantidadCompradaItem.setText("");
        tiempoentrega = 0;
        confianzaGlobal = 0;
        demandaAnual.setText("");
        DEMANDA_TOTAL_ANUAL.setText("");
        COSTO_UNITARIO.setText("");
        COSTO_PROCESAMIENTO_PEDIDO.setText("");
        PORCENTAJE_COSTO.setText("");
        
        puntoPedi.setText("");
        nivelServiText.setText("");
        cantidadEconomicaPedido2.setText("");
        tiempoEntrePedidos2.setText("");
        pedidosAnuales2.setText("");
        costoMantenerInventario2.setText("");
        costoDeCompra2.setText("");
        costoTotalAnual2.setText("");
        nivelserviciocep2.setText("");
        
        criticidadCantidad.setBackground(new Color(240, 240, 240));
        criticidadLabel.setText("CRITICIDAD"); 
    }
    
    private void procesarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarCantidadActionPerformed
        // TODO add your handling code here:
        graficarCEP();
    }//GEN-LAST:event_procesarCantidadActionPerformed

    private void PORCENTAJE_COSTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PORCENTAJE_COSTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PORCENTAJE_COSTOActionPerformed

    private void DEMANDA_TOTAL_ANUALKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DEMANDA_TOTAL_ANUALKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_DEMANDA_TOTAL_ANUALKeyTyped

    private void COSTO_UNITARIOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_COSTO_UNITARIOKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_COSTO_UNITARIOKeyTyped

    private void COSTO_PROCESAMIENTO_PEDIDOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_COSTO_PROCESAMIENTO_PEDIDOKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_COSTO_PROCESAMIENTO_PEDIDOKeyTyped

    private void PORCENTAJE_COSTOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PORCENTAJE_COSTOKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_PORCENTAJE_COSTOKeyTyped

    private void clearPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPuntoActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clearPuntoActionPerformed

    private void procesarPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarPuntoActionPerformed
        // TODO add your handling code here:
        procesarPDP();
    }//GEN-LAST:event_procesarPuntoActionPerformed

    private void cantidadCompradaItemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadCompradaItemKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_cantidadCompradaItemKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for(int i=0;i<panelTiempoEntrega.getComponentCount();i++)
        {
            if(panelTiempoEntrega.getComponent(i).getName() != null){

                if (panelTiempoEntrega.getComponent(i).getName().equals("labelTiempoEntrega"+indice))
                {
                    panelTiempoEntrega.remove(i);
                    panelTiempoEntrega.updateUI();
                }
                if (panelTiempoEntrega.getComponent(i).getName().equals("t"+indice) || panelTiempoEntrega.getComponent(i).getName().equals("labelTiempoEntrega"+indice))
                {
                    if(jTextFields.size() <= 1)
                    this.y = 55;
                    else
                    this.y = y - 40;

                    jTextFields.remove(jTextFields.size() - 1);
                    panelTiempoEntrega.remove(i);
                    panelTiempoEntrega.updateUI();
                    indice--;
                }

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextFields.size() < 2){
            JTextField field = new JTextField("");
            JLabel label = new JLabel();
            int count = 0, yLabel = 0 ;
            indice++;
            count = indice;
            count++;

            if(jTextFields.size() < 1)
            this.y = y + 35;
            else
            this.y = y + 40;

            label.setText(""+count);

            yLabel = this.y + 6;

            label.setBounds(14,yLabel,100,10);
            field.setBounds(x,y, 67, 20);
            label.setName("labelTiempoEntrega"+indice);
            field.setName("t"+indice);
            field.setToolTipText("Días. Ejemplo: 10");
            field.addKeyListener(new KeyListener(){
                @Override
                public void keyTyped(KeyEvent ke) {
                    char validar = ke.getKeyChar();

                    if(Character.isLetter(validar)){
                        getToolkit().beep();
                        ke.consume();

                        JOptionPane.showMessageDialog(null, "Ingresar solo números!");
                    }
                }
                @Override
                public void keyPressed(KeyEvent ke) { }

                @Override
                public void keyReleased(KeyEvent ke) { }
            });

            jTextFields.add(field);
            panelTiempoEntrega.add(label);
            panelTiempoEntrega.add(field);
            panelTiempoEntrega.updateUI();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t0KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_t0KeyTyped

    private void t0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t0ActionPerformed

    private void m12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m12KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m12KeyTyped

    private void m11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m11KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m11KeyTyped

    private void m10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m10KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m10KeyTyped

    private void m9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m9KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m9KeyTyped

    private void m8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m8KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m8KeyTyped

    private void m7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m7KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m7KeyTyped

    private void m6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m6KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m6KeyTyped

    private void m5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m5KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m5KeyTyped

    private void m4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m4KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m4KeyTyped

    private void m3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m3KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m3KeyTyped

    private void m2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m2KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m2KeyTyped

    private void m1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m1KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresar solo números!");
        }
    }//GEN-LAST:event_m1KeyTyped

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.graficaNumberNC = 1;
        
        if(graficaNumberNC >= 1){
            //jButton6.setEnabled(false);
            graficoNC = new GraficoPDPNivelConfianza(this.ppminxx, this.ppmaxx, this.confianzaGlobalx, this.stockminimox, this.dapx, this.tpumx, (double)this.tiempoentregax, this.sumaDemandaAnualx);
            listGraficoNC.add(graficoNC);
        }
        else
            graficoNC = new GraficoPDPNivelConfianza(this.ppminxx, this.ppmaxx, this.confianzaGlobalx, this.stockminimox, this.dapx, this.tpumx, (double)this.tiempoentregax, this.sumaDemandaAnualx);
            //jButton6.setEnabled(true); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.graficaNumbernivelServicioNC = 1;
        
        if(graficaNumbernivelServicioNC >= 1){
            //jButton7.setEnabled(false);
            nivelServicioNC = new GraficoNivelServicioNC(this.nsminxx, this.nsmaxx, this.confianzaGlobalx, this.nivelserx, this.tiempoentregax, this.sumaDemandaAnualx, this.cpx);
            listnivelServicioNC.add(nivelServicioNC);
        }
        else
            nivelServicioNC = new GraficoNivelServicioNC(this.nsminxx, this.nsmaxx, this.confianzaGlobalx, this.nivelserx, this.tiempoentregax, this.sumaDemandaAnualx, this.cpx);
            //jButton7.setEnabled(true); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.graficaNumberTE = 1;
        
        if(graficaNumberTE == 1){
        //    jButton8.setEnabled(false);
            graficoTE = new GraficoNivelServicioTiempoEntrega(this.ppminxx, this.ppmaxx, this.nivelserx, this.tiempoentregax, this.confianzaGlobalx, this.sumaDemandaAnualx, this.cpx);
            listgraficoTE.add(graficoTE);
        }
        else
            graficoTE = new GraficoNivelServicioTiempoEntrega(this.ppminxx, this.ppmaxx, this.nivelserx, this.tiempoentregax, this.confianzaGlobalx, this.sumaDemandaAnualx, this.cpx);
          //  jButton8.setEnabled(true); 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void consecuenciaIndisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consecuenciaIndisponibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consecuenciaIndisponibilidadActionPerformed

    private void cantidadEconomicaPedido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadEconomicaPedido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadEconomicaPedido2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        graficaNumberCEP = 1;
        
        if(graficaNumberCEP == 1){
            graficaCEP = new GraficaCEP(this.CCx, this.CMx, this.CTx, this.XNx);
            listgraficaCEP.add(graficaCEP);
        //    jButton5.setEnabled(false);
        }
        else
            graficaCEP = new GraficaCEP(this.CCx, this.CMx, this.CTx, this.XNx);
          //  jButton5.setEnabled(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void costoTotalAnual2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoTotalAnual2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoTotalAnual2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField COSTO_PROCESAMIENTO_PEDIDO;
    private javax.swing.JTextField COSTO_UNITARIO;
    private javax.swing.JTextField DEMANDA_TOTAL_ANUAL;
    private javax.swing.JTextField PORCENTAJE_COSTO;
    private javax.swing.JTextField cantidadCompradaItem;
    private javax.swing.JTextField cantidadEconomicaPedido2;
    private javax.swing.JButton clearCantidad;
    private javax.swing.JButton clearPunto;
    private javax.swing.JComboBox<String> consecuenciaIndisponibilidad;
    private javax.swing.JTextField costoDeCompra2;
    private javax.swing.JTextField costoMantenerInventario2;
    private javax.swing.JTextField costoTotalAnual2;
    private javax.swing.JPanel criticidadCantidad;
    private javax.swing.JLabel criticidadLabel;
    private javax.swing.JTextField demandaAnual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m10;
    private javax.swing.JTextField m11;
    private javax.swing.JTextField m12;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField m4;
    private javax.swing.JTextField m5;
    private javax.swing.JTextField m6;
    private javax.swing.JTextField m7;
    private javax.swing.JTextField m8;
    private javax.swing.JTextField m9;
    private javax.swing.JTextField nivelServiText;
    private javax.swing.JTextField nivelserviciocep2;
    private javax.swing.JPanel panelResultadosBR2;
    private javax.swing.JPanel panelTiempoEntrega;
    private javax.swing.JPanel pdp;
    private javax.swing.JTextField pedidosAnuales2;
    private javax.swing.JButton procesarCantidad;
    private javax.swing.JButton procesarPunto;
    private javax.swing.JTextField puntoPedi;
    private javax.swing.JTextField t0;
    private javax.swing.JTextField tiempoEntrePedidos2;
    // End of variables declaration//GEN-END:variables
}
