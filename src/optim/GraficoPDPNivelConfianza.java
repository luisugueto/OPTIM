/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optim;

import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
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
public class GraficoPDPNivelConfianza extends JFrame{
    
    public GraficoPDPNivelConfianza(double ppmin, double ppmax, float confianza, double stockminimo, double dap, double tpum, double tiempoEntrega, double sumaDemandaAnual){        
        XYSeries nc = new XYSeries("");
        
        ArrayList<String> confianzas = new ArrayList<String>();
        confianzas.add(""+50);
        confianzas.add(""+80);
        confianzas.add(""+95);
        confianzas.add(""+99);
        confianzas.add(""+99.9);
        confianzas.add(""+99.99);
        
        for(int i = 0; i < confianzas.size(); i++) {
			double auxStockminimo = tiempoEntrega * (sumaDemandaAnual/365);
            double auxConfianza = 0;
            int criticidad = 0;
            String text = "";
            int selectedvalue = 0;
            
			switch(confianzas.get(i)){
				case "50": criticidad = 0; auxConfianza = 50; text = null; break;
				case "80": criticidad = 1; auxConfianza = 80; text = "Baja Criticidad"; break;
				case "95": criticidad = 2; auxConfianza = 95; text = "Media Criticidad"; break;
				case "99": criticidad = 3; auxConfianza = 99; text = null; break;
				case "99.9": criticidad = 4; auxConfianza = 99.9; text = "Alta Criticidad"; break;
				case "99.99": criticidad = 5; auxConfianza = 99.99; text = null; break;
			}
			double pptotal = ((auxStockminimo * criticidad * dap)/tpum) + auxStockminimo;
            nc.add(auxConfianza, pptotal);
            
            if (auxConfianza == confianza) selectedvalue = i;
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
        XYLineAndShapeRenderer r = (XYLineAndShapeRenderer) xyPlot.getRenderer();
        r.setSeriesShape(0, ShapeUtilities.createDiamond(5));
        r.setSeriesShapesVisible(0, true);
        r.setBaseItemLabelsVisible(true);
        r.setBaseItemLabelGenerator(new LegendXYItemLabelGenerator(xyPlot.getLegendItems()));
        
        NumberAxis domain = (NumberAxis) xyPlot.getDomainAxis();
        domain.setRange(45, 105);
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

    private static class LegendXYItemLabelGenerator implements XYItemLabelGenerator {

        public LegendXYItemLabelGenerator(LegendItemCollection legendItems) {
        }

        @Override
        public String generateLabel(XYDataset xyd, int i, int i1) {
            if(xyd.getXValue(i, i1) == 50.0){
                return "";
            }
            if(xyd.getXValue(i, i1) == 80.0){
                return "Baja Criticidad";
            }
            if(xyd.getXValue(i, i1) == 95.0){
                return "Media Criticidad";
            }
            if(xyd.getXValue(i, i1) == 99.0){
                return "";
            }
            if(xyd.getXValue(i, i1) == 99.9){
                return "Alta Criticidad";
            }
            if(xyd.getXValue(i, i1) == 99.99){
                return "";
            }
            return "";
        }
    }
    
}
