/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optim;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Luis Ugueto
 * ugueto.luis19@gmail.com
 */
public class GraficoPDPNivelConfianza extends JFrame{
    
    public GraficoPDPNivelConfianza(double ppmin, double ppmax, float confianza){        
        XYSeries nc = new XYSeries("");
        
        for(int i = 50; i < 100; i++){
            if(i > confianza)
            { }
            else
                nc.add(i, ppmin);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(nc);

        JFreeChart chart = ChartFactory.createXYLineChart(
                " ",
                "Nivel de Confianza (%)", 
                "Punto de Pedido (PP)", 
                dataset, 
                PlotOrientation.VERTICAL,
                false,
                false,
                false
        );
        
        XYPlot xyPlot = (XYPlot) chart.getPlot();
        xyPlot.setDomainCrosshairVisible(true);
        xyPlot.setRangeCrosshairVisible(true);
        
        NumberAxis domain = (NumberAxis) xyPlot.getDomainAxis();
        domain.setRange(45, 100);
        domain.setVerticalTickLabels(false);
        
        NumberAxis range = (NumberAxis) xyPlot.getRangeAxis();
        range.setRange(ppmin-(ppmin*0.8), ppmax+(ppmax*0.2));
        
        ChartFrame ventana = new ChartFrame("Nivel de servicio en función del nivel de confianza", chart);
        ventana.pack();
        ventana.setSize(500, 500);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        
    }
    
}
