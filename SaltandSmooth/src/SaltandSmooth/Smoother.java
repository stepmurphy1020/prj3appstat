package SaltandSmooth;

import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;

public class Smoother {
	public void smoother() {
		for(int i = 0; i < data.data2.size()-2; i++) {
			double a = data.data2.get(i);
			double[] c;
			double[] d;
			d[i]= a;
			c[i]= i;
			double mean = ((a+b))/2;
			data.data3.add(mean);
			PolynomialSplineFunction n = new PolynomialSplineFunction(c, d);
		}
	}
}