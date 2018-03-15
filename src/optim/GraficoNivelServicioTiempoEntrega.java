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
        
        XYPlot xyPlot = (XYPlot) chart.getPlot();
        xyPlot.setDomainCrosshairVisible(true);
        xyPlot.setRangeCrosshairVisible(false);
        XYLineAndShapeRenderer r = (XYLineAndShapeRenderer) xyPlot.getRenderer();
        r.setBaseItemLabelsVisible(true);
        r.setBaseItemLabelGenerator(new LegendXYItemLabelGenerator(xyPlot.getLegendItems(), tiempoentrega));

        NumberAxis domain = (NumberAxis) xyPlot.getDomainAxis();
        domain.setRange(0, limite+2);
        domain.setVerticalTickLabels(false);
        
        NumberAxis range = (NumberAxis) xyPlot.getRangeAxis();
        range.setRange(nsmin, nsmax);
        
        ChartFrame ventana = new ChartFrame("Nivel de servicio en función del tiempo de entrega", chart);
        ventana.pack();
        ventana.setSize(500, 500);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    
        }

    private static class LegendXYItemLabelGenerator implements XYItemLabelGenerator {

        private float tiempoentrega;
        public LegendXYItemLabelGenerator(LegendItemCollection legendItems, float tiempoentrega) {
            this.tiempoentrega = tiempoentrega;
        }

        @Override
         public String generateLabel(XYDataset dataset, int series, int item) {             
             if(tiempoentrega == (float)item ){
                 return ""+item+" días";
             }
             return "";
        }
    }
    
}
