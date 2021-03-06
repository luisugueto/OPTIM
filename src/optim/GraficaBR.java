/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optim;

import java.awt.BasicStroke;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Luis Ugueto
 * ugueto.luis19@gmail.com
 */
public class GraficaBR extends JFrame{
    
    private ChartFrame ventanaa;
    
    public GraficaBR(ArrayList poissoni, ArrayList poissona, double minimoStock, double nivelConfianza){
        XYSeries pi = new XYSeries("Probabilidad Individual");
        XYSeries nc = new XYSeries("Nivel de Confianza");
        for(int i = 0; i < poissoni.size()-1; i++){
            pi.add(i+1, (double) poissoni.get(i));
            nc.add(i+1, nivelConfianza);
        }
        
        XYSeries pa = new XYSeries("Probabilidad Acumulada");
        for(int i = 0; i < poissoni.size()-1; i++){
            pa.add(i+1, (double) poissona.get(i));
        } 
        
        XYSeries ms = new XYSeries("Mínimo Stock Recomendado");
        ms.add(0, minimoStock);      

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(pi);
        dataset.addSeries(pa);
        dataset.addSeries(ms); 
        dataset.addSeries(nc);
        

        JFreeChart chart = ChartFactory.createXYLineChart(
                " ",
                "Nivel de Confianza (%)", 
                "Cantidad de repuestos", 
                dataset, 
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );
        
        chart.setBackgroundPaint(Color.WHITE);
        
        XYPlot plot = chart.getXYPlot();
        // here we change the line size
        int seriesCount = plot.getSeriesCount();
        
        for (int i = 0; i < seriesCount; i++) {
            plot.getRenderer().setSeriesStroke(i, new BasicStroke(3));
        }
        
        XYPlot xyPlot = (XYPlot) chart.getPlot();
        xyPlot.setBackgroundPaint(Color.WHITE);
        xyPlot.setDomainGridlinePaint(Color.DARK_GRAY);
        xyPlot.setRangeGridlinePaint(Color.DARK_GRAY);
        
        ChartFrame ventana = new ChartFrame("Confiabilidad por cantidad de producto", null);
        ChartPanel chartPanel = new ChartPanel(chart); 
        chartPanel.setPopupMenu(null); 
        
        chartPanel.setDomainZoomable(false);
        chartPanel.setRangeZoomable(false);
        ventana.add(chartPanel);
        
        ventana.pack();
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventanaa = ventana;
    }
    
    public void closeJFrame(){
        ventanaa.dispose();
    }
    
    public ChartFrame getVentana(){
        return ventanaa;
    }
    
    
}
