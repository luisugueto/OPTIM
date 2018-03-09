/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optim;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Luis Ugueto
 * ugueto.luis19@gmail.com
 */
public class GraficaCEP extends JFrame{
    
    public GraficaCEP(ArrayList CC, ArrayList CM, ArrayList CT, double XN){
        
        XYSeries cc = new XYSeries("(CC) Costo de Compra");
        for(int i = 0; i < CC.size()-1; i++){
            cc.add(i+1, (double) CC.get(i));
        }
        
        XYSeries cm = new XYSeries("(CM) Costo de Mantenimiento del Inventario");
        for(int i = 0; i < CC.size()-1; i++){
            cm.add(i+1, (double) CM.get(i));
        }
        
        XYSeries ct = new XYSeries("(CT) Costo Total");
        for(int i = 0; i < CC.size()-1; i++){
            ct.add(i+1, (double) CT.get(i));
        }
        
        XYSeries cp = new XYSeries("(CT) Cantidad Económica de Pedido");
        cp.add(1, (double)XN);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(cc);
        dataset.addSeries(cm);
        dataset.addSeries(ct);
        dataset.addSeries(cp);
        

        JFreeChart chart = ChartFactory.createXYLineChart(
                " ",
                "Cantidad de Pedido (und)", 
                "Costo $", 
                dataset, 
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );
        
        ChartFrame ventana = new ChartFrame("Gráfico de Cantidad de Pedido", chart);
        ventana.pack();
        ventana.setSize(500, 500);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }   
}
