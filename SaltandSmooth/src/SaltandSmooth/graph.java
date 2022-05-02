package SaltandSmooth;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class graph extends JFrame {
	public graph() {
		// super("Line Chart With Example with JFreechart");
		JPanel createG = createGraph();
		add(createG, BorderLayout.CENTER);
		setSize(640, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private JPanel createGraph() {
		String ChartTitle = "SaltedVSSmoothedData";
		String AxisLabelX = "Input";
		String AxisLabelY = "Output";

		CategoryDataset data = createGraphData();

		JFreeChart graph = ChartFactory.createLineChart(ChartTitle, AxisLabelX, AxisLabelY, data);

		return new ChartPanel(graph);
	}

	private CategoryDataset createGraphData() {
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		String series1 = "SaltedData";
		String series2 = "SmoothedData";
		for (int i = 0; i < SaltandSmooth.data.data1.size(); i++) {
			data.addValue(i, series1, SaltandSmooth.data.data1.get(i));

		}
		for (int l = 0; l < SaltandSmooth.data.data2.size(); l++) {
			data.addValue(l, series2, SaltandSmooth.data.data1.get(l));
		}
		return data;
	}

}
