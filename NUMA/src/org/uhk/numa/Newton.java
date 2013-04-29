package org.uhk.numa;

public class Newton {

	private static final float PRECISION = 0.000001f;

	public void newton(double x0) {

		double x1 = Double.MAX_VALUE;
		int step = 1;

		while(true){
			x1 = x0 - newtonFce(x0) / newtonDer(x0);
			System.out.println(String.format("%d \n x1: %f\n x1-x0: %f \n", step, x0, (x1-x0)));
			step++;
			
			if(Math.abs(x1-x0) <= PRECISION){
				break;
			} else {
				x0 = x1;
			}
		}
	}

	public void tab(double a, double b, double step){
		for(double i = a; i <= b; i += step){
			System.out.print(String.format("i: %f: \t %f \n", i, newtonFce(i)));
		}
	}
	
	public void furier(double a, double b, double step){
		System.out.println("i\t\tf(x)\t\tf'(x)\t\tf''(x)");
		for(double i = a; i <= b; i += step){
			System.out.println(String.format("%f\t%f\t%f\t%f", i, newtonFce(i), newtonDer(i), newtonSecondDer(i)));
		}
	}
	
	private double newtonFce(double x) {
		return x - Math.sin(x) - 0.25f;
	}

	private double newtonDer(double x) {
		return 1 - Math.cos(x);
	}

	private double newtonSecondDer(double x) {
		return Math.sin(x);
	}

}
