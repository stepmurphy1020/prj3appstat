package SaltandSmooth;

import java.util.ArrayList;

public class data {
	static ArrayList<Double> data1 = new ArrayList<>();
	static ArrayList<Double> data2 = new ArrayList<>();
	static ArrayList<Double> data3 = new ArrayList<>();
	// adds data points to the data ArrayList on the interval a to b
	public void addData(double a, double b) {
		Function F = new Function(); 
		for (double i = a; i < b; i++) {
			F.function(i);
		}
	}
}
