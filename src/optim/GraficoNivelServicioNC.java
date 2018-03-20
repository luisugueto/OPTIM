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
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.NumberAxis;
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
public class GraficoNivelServicioNC extends JFrame{
    
    public GraficoNivelServicioNC(float nsmin, float nsmax, float confianza, float nivelservicio, double tiempoentrega, double sumaDemandaAnual, int cp){
        XYSeries nc = new XYSeries("");
        // nc.add(confianza, nivelservicio);
        
        ArrayList<String> confianzas = new ArrayList<String>();
        confianzas.add(""+80);
        confianzas.add(""+95);
        confianzas.add(""+99);
        confianzas.add(""+99.9);
        
        double res3 = 0;
        
        for (int i = 0; i < confianzas.size() ; i++) {
                String textoCrit = "";
                double auxConfianza = 0;
                int selectedvalue;
				switch (confianzas.get(i)) {
					case "80": textoCrit = "Baja Criticidad"; auxConfianza = 80; break;
					case "95": textoCrit = "Media Criticidad"; auxConfianza = 95 ;break;
					case "99.9": textoCrit = "Alta Criticidad"; auxConfianza = 99.9; ;break;
					default: textoCrit = ""; break;
				}
				res3 = 100 - ((100-auxConfianza)*sumaDemandaAnual*tiempoentrega)/(cp*365);
				if (confianzas.get(i) == "80" || confianzas.get(i) == "95" || confianzas.get(i) == "99.9") 
                    nc.add(auxConfianza, res3);
				else 
                    nc.add(auxConfianza, res3);
				if (auxConfianza == confianza) selectedvalue = i;
			}
        
        
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(nc);

        JFreeChart chart = ChartFactory.createXYLineChart(
                " ",
                "Nivel de Confianza (%)", 
                "Nivel de Servicio (%)", 
                dataset, 
                PlotOrientation.VERTICAL,
                false,
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
        
        xyPlot.setDomainCrosshairVisible(true);
        xyPlot.setRangeCrosshairVisible(true);
        XYLineAndShapeRenderer r = (XYLineAndShapeRenderer) xyPlot.getRenderer();
        r.setSeriesShape(0, ShapeUtilities.createDiamond(5));
        r.setSeriesShapesVisible(0, true);
        r.setBaseItemLabelsVisible(true);
        r.setBaseItemLabelGenerator(new LegendXYItemLabelGenerator(xyPlot.getLegendItems(), tiempoentrega));
        
        NumberAxis domain = (NumberAxis) xyPlot.getDomainAxis();
        domain.setRange(75, 105);
        domain.setVerticalTickLabels(false);
        
        NumberAxis range = (NumberAxis) xyPlot.getRangeAxis();
        range.setRange(nsmin, nsmax+1);
        
        ChartFrame ventana = new ChartFrame("Puntos de pedido en función del nivel de confianza", chart);
        ventana.pack();
        ventana.setSize(500, 500);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    
    }

    private static class LegendXYItemLabelGenerator implements XYItemLabelGenerator {

        public LegendXYItemLabelGenerator(LegendItemCollection legendItems, double tiempoentrega) {
        }

        @Override
        public String generateLabel(XYDataset xyd, int i, int i1) {
            if(xyd.getXValue(i, i1) == 80.0)
            {
                return "Baja Criticidad";
            }
            
            if(xyd.getXValue(i, i1) == 95.0)
            {
                return "Media Criticidad";
            }
            if(xyd.getXValue(i, i1) == 99.9)
            {
                return "Alta Criticidad";
            }
            return "";
        }
    }
    
}
