package SaltandSmooth;

import java.util.ArrayList;

public class data {
	static ArrayList<Integer> data1 = new ArrayList<>();
	//adds data points to the data ArrayList on the interval a to b
	public void addData(int a, int b) {
		for(int i = a; i < b; i++) {
			int c = ((3*(i*i))+ (4*i)+12);
			data1.add(c);
		}
	}
}
