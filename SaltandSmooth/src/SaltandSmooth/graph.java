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
			//creates an integer i that will but used as a data point in the making of the data
			int a = SaltandSmooth.data.data1.get(i);
			int c = SaltandSmooth.data.data2.get(i);
			//creates a string of the integer i to add to the x value of the graph
			String b = Integer.toString(i);
			
			data.addValue(a, series1, b);
			data.addValue(c, series2, b);

		}
		return data;
	}

}
