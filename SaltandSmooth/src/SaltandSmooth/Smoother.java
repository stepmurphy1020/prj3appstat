package SaltandSmooth;

public class Smoother {
	public void smoother() {
		for(int i = 0; i < data.data2.size()-1; i++) {
			double a = data.data2.get(i);
			double b = data.data2.get(i+1);
			double mean = ((a+b))/2;
			data.data3.add(mean);
		}
	}
}