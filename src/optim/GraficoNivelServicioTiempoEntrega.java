/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optim;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Shape;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.util.ShapeUtilities;

/**
 *
 * @author Luis Ugueto
 * ugueto.luis19@gmail.com
 */
public class GraficoNivelServicioTiempoEntrega extends JFrame{
     
    private ChartFrame ventanaa;
    
    public GraficoNivelServicioTiempoEntrega(double ppmin, double ppmax, float nivelservicio, float tiempoentrega, float confianza, double sumaDemandaAnual, int cp){
        int limite = (int) ((tiempoentrega/10+1)*10);
        XYSeries nc = new XYSeries("");
        
        double res = 0;
		double nsmin = 100 - ((100-confianza)*sumaDemandaAnual*limite)/(cp*365);
		double nsmax = 100 - ((100-confianza)*sumaDemandaAnual*1)/(cp*365);

		for (int i = 1; i <= limite ; i++) {
			res = 100 - ((100-confianza)*sumaDemandaAnual*i)/(cp*365);
			nc.add(i, res);
		}
        
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
        
        chart.setBackgroundPaint(Color.WHITE);
        
        XYPlot xyPlot = (XYPlot) chart.getPlot();
        xyPlot.setBackgroundPaint(Color.WHITE);
        xyPlot.setDomainGridlinePaint(Color.DARK_GRAY);
        xyPlot.setRangeGridlinePaint(Color.DARK_GRAY);
        xyPlot.setDomainCrosshairVisible(true);
        xyPlot.setRangeCrosshairVisible(false);
        XYLineAndShapeRenderer r = (XYLineAndShapeRenderer) xyPlot.getRenderer();
        /*xyPlot.setRenderer(new XYLineAndShapeRenderer(true, true) {

            @Override
            public Shape getItemShape(int row, int col) {
                if (col == tiempoentrega-1) {
                    return ShapeUtilities.createDiagonalCross(5, 2);
                }
                // else {
                 //   return super.getItemShape(0, 0);
                //} 
                
                return ShapeUtilities.createDiagonalCross(0, 0);
            }
        }); */
        
        XYPlot plot = chart.getXYPlot();
        // here we change the line size
        int seriesCount = plot.getSeriesCount();
        
        for (int i = 0; i < seriesCount; i++) {
            plot.getRenderer().setSeriesStroke(i, new BasicStroke(3));
        }
        
        r.setSeriesShape(0, ShapeUtilities.createDiamond(5));
        r.setSeriesShapesVisible(0, true);
        r.setBaseItemLabelsVisible(true);
        r.setBaseItemLabelGenerator(new LegendXYItemLabelGenerator(xyPlot.getLegendItems(), tiempoentrega));

        NumberAxis domain = (NumberAxis) xyPlot.getDomainAxis();
        domain.setRange(0, limite+2);
        domain.setVerticalTickLabels(false);
        
        NumberAxis range = (NumberAxis) xyPlot.getRangeAxis();
        range.setRange(nsmin, nsmax);
        
        ChartFrame ventana = new ChartFrame("Nivel de servicio en función del tiempo de entrega", chart);
        
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

    private static class LegendXYItemLabelGenerator implements XYItemLabelGenerator {

        private float tiempoentrega;
        public LegendXYItemLabelGenerator(LegendItemCollection legendItems, float tiempoentrega) {
            this.tiempoentrega = tiempoentrega;
        }

        @Override
         public String generateLabel(XYDataset dataset, int series, int item) {             
             if(tiempoentrega == (float)item ){
                 return "Nivel de servicio para los valores ingresados";
             }
             return "";
        }
    }
    
}
