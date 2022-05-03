package SaltandSmooth;

public class Function {
	double a = (Math.abs(Main.upperbound) + Math.abs(Main.lowerbound));
	public void function(double input) {
		//creates the function that will add each datapoint to the Original arraylist data1
		double c = ((3 * (input * input)) + (4 * input) + 12);
		data.data1.add(c); 
	}
}
