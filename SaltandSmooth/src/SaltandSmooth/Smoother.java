package SaltandSmooth;

import java.util.Arrays;

import org.apache.commons.math3.analysis.interpolation.AkimaSplineInterpolator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;

public class Smoother {
	public void smoother() {
		for(int i = 0; i < data.data2.size()-1; i++) {
			double a = data.data2.get(i);
			double b = data.data2.get(i+1);
			double mean = ((a+b))/2;
			data.data3.add(mean);
		}
		
		   /*double [] xDouble = new double [data.data2.size()];  
		    double [] yDouble = new double [data.data2.size()];
		    for(int i = 0; i < data.data2.size(); i++) {
		    	xDouble[i]= i;
		    	yDouble[i]= data.data2.get(i);
		    	
		    }
		    System.out.println(Arrays.toString(xDouble)); 
		    System.out.println(Arrays.toString(yDouble)); 

		    AkimaSplineInterpolator asi = new AkimaSplineInterpolator();
		    PolynomialSplineFunction psf = asi.interpolate(xDouble, yDouble);

		    for (PolynomialFunction pf : psf.getPolynomials()) {
		        System.out.println(pf.polynomialDerivative());  
		    }*/
	}
}