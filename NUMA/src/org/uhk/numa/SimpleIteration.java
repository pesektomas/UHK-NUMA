package org.uhk.numa;

public class SimpleIteration {

	private static final float PRECISION = 0.000001f;
	
	public static final byte FCE_1 = 0;
	public static final byte FCE_2 = 1;
	
	public void iter(double x0, byte TYPE){
		double x1 = Double.MAX_VALUE;
		int step = 1;

		while(true){
			
			if(TYPE == 0){
				x1 = fce1(x0);
			} else if(TYPE == 1){
				x1 = fce2(x0);
			}
			
			System.out.println(String.format("%d \n x1: %f\n x1-x0: %f \n", step, x0, (x1-x0)));
			step++;
			
			if(Math.abs(x1-x0) <= PRECISION){
				break;
			} else {
				x0 = x1;
			}
		}
		
	}
	
	public void tab(double a, double b, double step, byte TYPE){
		System.out.println("i\t\tf(x)\t\tf'(x)");
		for(double i = a; i <= b; i += step){
			if(TYPE == 0){
				System.out.println(String.format("%f\t%f\t%f", i, fce1(i), fceDer1(i)));
			} else if(TYPE == 1){
				System.out.println(String.format("%f\t%f\t%f", i, fce2(i), fceDer2(i)));
			}
			
		}
	}
	
	private double fce1(double x){
		return Math.pow(Math.E, (5*x - 8) / 8);
	}
	
	private double fceDer1(double x){
		return ((5/8.0) * fce1(x));
	}
	
	private double fce2(double x){
		return (8/5.0f) * (Math.log(x) + 1) ; 
	}
	
	private double fceDer2(double x){
		return (8 / (5.0 * x));
	}
	
}
