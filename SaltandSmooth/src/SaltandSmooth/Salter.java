package SaltandSmooth;

import java.util.Random;

public class Salter {
	Random r = new Random();

	public void salter() {

		// generates a random number
		double a = r.nextInt(5500);

		// calculates the y values when x is 0 to 20
		for (int i = 0; i <= data.data1.size() - 1; i++) {
			// sets an array that either subtracts or adds the amount specified
			double[] change = { -a, a };
			// chooses either to add a negative or positive number to the data point dependent on if the input is even or odd
			if((i & 1)== 0) {
				int pick = 0;
				data.data2.add(data.data1.get(i) + change[pick]);
			}else {
				int pick = 1; 
				data.data2.add(data.data1.get(i) + change[pick]);
			}

		}
	}
}
