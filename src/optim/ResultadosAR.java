/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optim;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Ugueto
 * ugueto.luis19@gmail.com
 */
public class ResultadosAR extends javax.swing.JFrame {
    private ArrayList<Double> CCx, CMx, CTx;
    private int XNx;
    /**
     * Creates new form ResultadosAR
     * @param cantidadEconomicaP
     * @param tiempoEntrePedidos
     * @param pedidosAnuales
     * @param costoCompra
     * @param costoAnual
     * @param costoMantenerInventario
     */
    public ResultadosAR(float cantidadEconomicaP, float tiempoEntrePed, float pedidosAnio, float costoComp, float costoMantInventario,float costoAnio, float nivelSer, ArrayList<Double> CC, ArrayList<Double> CM, ArrayList<Double> CT, int val, int XN) {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        this.CCx = CC;
        this.CMx = CM;
        this.CTx = CT;
        this.XNx = XN;
        
        cantidadEconomicaPedido.setText(""+Math.round(cantidadEconomicaP * 100d) / 100d );
        tiempoEntrePedidos.setText(""+Math.round(tiempoEntrePed * 100d) / 100d );
        pedidosAnuales.setText(""+Math.round(pedidosAnio * 100d) / 100d );
        costoMantenerInventario.setText(""+Math.round(costoMantInventario * 100d) / 100d );
        costoDeCompra.setText(""+Math.round(costoComp * 100d) / 100d );
        costoTotalAnual.setText(""+Math.round(costoAnio * 100d) / 100d );
        nivelserviciocep.setText(""+nivelSer);
        
        jLabel5.setText("<html><body>Costo de mantener en inventario la <br>cantidad económica de pedido:</body></html>");
        jLabel6.setText("<html><body>Costo de compra de la cantidad <br>económica de pedido:</body></html>");
        jLabel7.setText("<html><body>Costo total anual de la cantidad <br>económica de pedido:</body></html>");
        jLabel8.setText("<html><body>Nivel de servicio para la cantidad <br>económica de pedido:</body></html>");
        
        
        // CREANDO TABLA
        DefaultTableModel model = new DefaultTableModel(); 
        JTable table = new JTable(model); 
        table.setBounds(20, 20, 300, 400);
        
        // COLUMNAS TABLA
        model.addColumn("Q"); 
        model.addColumn("CC"); 
        model.addColumn("CM"); 
        model.addColumn("CT"); 
        
        int numRows = 0;
        int max = 0;
        for (int K = val+1; K >= val-8; K--) {
			if (K==1) max = CT.get(K).intValue();
            
		  //if (CC[Q] == null || CM[Q] == null || CT[Q] == null) {
		  	
		  	//break;
		  //}
            
            // AGREGANDO COLUMNAS TABLA
            model.addRow(new Object[]{K+1, Math.round((double)CC.get(K) * 100d) / 100d, Math.round((double)CM.get(K) * 100d) / 100d, Math.round((double)CT.get(K) * 100d) / 100d});
            numRows++;
            if (val == K){
                // AQUI VA EL ROW SELECCIONADO
                table.setRowSelectionInterval(numRows-1, numRows-1);
            }
        }    
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 350, 450, 180);
        panelResultadosBR.add(scrollPane, BorderLayout.CENTER);
        
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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelResultadosBR = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cantidadEconomicaPedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tiempoEntrePedidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pedidosAnuales = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        costoMantenerInventario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        costoDeCompra = new javax.swing.JTextField();
        costoTotalAnual = new javax.swing.JTextField();
        nivelserviciocep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(530, 700));
        setResizable(false);

        jLabel1.setText("RESULTADOS");

        panelResultadosBR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelResultadosBR.setPreferredSize(new java.awt.Dimension(480, 630));

        jLabel2.setText("Cantidad económica de Pedido:");

        cantidadEconomicaPedido.setEditable(false);
        cantidadEconomicaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadEconomicaPedidoActionPerformed(evt);
            }
        });

        jLabel3.setText("Tiempo entre pedidos:");

        tiempoEntrePedidos.setEditable(false);

        jLabel4.setText("Nº de pedidos al año:");

        pedidosAnuales.setEditable(false);

        jLabel5.setText("jLabel5");

        costoMantenerInventario.setEditable(false);

        jButton1.setText("Ver Gráfica (CCP)");
        jButton1.setToolTipText("Ver Gráfica (Confiabilidad por cantidad de producto)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        costoDeCompra.setEditable(false);

        costoTotalAnual.setEditable(false);

        nivelserviciocep.setEditable(false);

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout panelResultadosBRLayout = new javax.swing.GroupLayout(panelResultadosBR);
        panelResultadosBR.setLayout(panelResultadosBRLayout);
        panelResultadosBRLayout.setHorizontalGroup(
            panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadosBRLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nivelserviciocep)
                    .addComponent(costoTotalAnual)
                    .addComponent(costoDeCompra)
                    .addComponent(tiempoEntrePedidos)
                    .addComponent(cantidadEconomicaPedido)
                    .addComponent(pedidosAnuales)
                    .addComponent(costoMantenerInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadosBRLayout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        panelResultadosBRLayout.setVerticalGroup(
            panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosBRLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadEconomicaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tiempoEntrePedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pedidosAnuales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(costoMantenerInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoTotalAnual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(panelResultadosBRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivelserviciocep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jScrollPane1.setViewportView(panelResultadosBR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadEconomicaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadEconomicaPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadEconomicaPedidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GraficaCEP grafica = new GraficaCEP(this.CCx, this.CMx, this.CTx, this.XNx);
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
            java.util.logging.Logger.getLogger(ResultadosAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadosAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadosAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadosAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new ResultadosAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadEconomicaPedido;
    private javax.swing.JTextField costoDeCompra;
    private javax.swing.JTextField costoMantenerInventario;
    private javax.swing.JTextField costoTotalAnual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nivelserviciocep;
    private javax.swing.JPanel panelResultadosBR;
    private javax.swing.JTextField pedidosAnuales;
    private javax.swing.JTextField tiempoEntrePedidos;
    // End of variables declaration//GEN-END:variables
}
