package SaltandSmooth;

import java.util.Random;

public class Salter {
	Random r = new Random();

	public void salter() {

		// generates a random number
		int a = r.nextInt(2000);

		// calculates the y values when x is 0 to 20
		for (int i = 0; i <= data.data1.size() - 1; i++) {
			// sets an array that either subtracts or adds the amount specified
			int[] change = { -a, a };
			// chooses either to add a negative or positive number to the data point
			int pick = r.nextInt(2);
			// sets y equal to the out put of the equation
			data.data2.add(data.data1.get(i) + change[pick]);

		}
	}
}
