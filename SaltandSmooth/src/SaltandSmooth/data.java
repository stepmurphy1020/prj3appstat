package SaltandSmooth;

import java.util.ArrayList;

public class data {
	static ArrayList<Double> data1 = new ArrayList<>();
	static ArrayList<Double> data2 = new ArrayList<>();
	static ArrayList<Double> data3 = new ArrayList<>();
	// adds data points to the data ArrayList on the interval a to b
	public void addData(double a, double b) {

		for (double i = a; i < b; i++) {
			double c = ((3 * (i * i)) + (4 * i) + 12);
			data1.add(c);
		}
	}
}
