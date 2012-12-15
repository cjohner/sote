package jfreechart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class FreeChart {
	public static void main(String[] args) {
		JFreeChart chart = getJFreeChart();
		ChartFrame frame = new ChartFrame("Simple Test", chart);
		frame.pack();
		frame.setVisible(true);
	}

	public static JFreeChart getJFreeChart() {
		XYSeries datensatz1 = new XYSeries("Reihe 1");
		datensatz1.add(3, 5);
		datensatz1.add(4, 6);
		datensatz1.add(5, 9);
		
		XYSeries datensatz2 = new XYSeries("Reihe 2");
		datensatz2.add(3, 21);
		datensatz2.add(4, 19);
		datensatz2.add(5, 19);
		
		XYSeriesCollection alleDaten = new XYSeriesCollection();
		alleDaten.addSeries(datensatz1);
		alleDaten.addSeries(datensatz2);
		
		JFreeChart chart = ChartFactory.createXYLineChart(
				"Zufallszahlen", /*Titel*/
				"x-Werte", "ms", alleDaten, PlotOrientation.VERTICAL, 
				true, /*legende*/
				true, /*tooltipps*/
				true /*URLs*/);
		return chart;
	}
}
