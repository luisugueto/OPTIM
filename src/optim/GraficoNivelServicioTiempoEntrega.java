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
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.util.ShapeUtilities;

/**
 *
 * @author Luis Ugueto
 * ugueto.luis19@gmail.com
 */
public class GraficoNivelServicioTiempoEntrega extends JFrame{
    
    public GraficoNivelServicioTiempoEntrega(double ppmin, double ppmax, float nivelservicio, float tiempoentrega){
        int limite = (int) ((tiempoentrega/10+1)*10);
        XYSeries nc = new XYSeries("");
        nc.add(tiempoentrega, nivelservicio);
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(nc);

        JFreeChart chart = ChartFactory.createXYLineChart(
                " ",
                "Tiempo de Entrega (días)", 
                "Nivel de Servicio (%)", 
                dataset, 
                PlotOrientation.VERTICAL,
                false,
                false,
                false
        );
        
        XYPlot xyPlot = (XYPlot) chart.getPlot();
        xyPlot.setDomainCrosshairVisible(true);
        xyPlot.setRangeCrosshairVisible(true);
        XYLineAndShapeRenderer r = (XYLineAndShapeRenderer) xyPlot.getRenderer();
        r.setSeriesShape(0, ShapeUtilities.createDiamond(5));
        r.setSeriesShapesVisible(0, true);
        
        NumberAxis domain = (NumberAxis) xyPlot.getDomainAxis();
        domain.setRange(0, limite+2);
        domain.setVerticalTickLabels(false);
        
        NumberAxis range = (NumberAxis) xyPlot.getRangeAxis();
        range.setRange(40, 105);
        
        ChartFrame ventana = new ChartFrame("Nivel de servicio en función del tiempo de entrega", chart);
        ventana.pack();
        ventana.setSize(500, 500);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    
        }
    
}
