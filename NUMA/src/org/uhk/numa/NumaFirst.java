package org.uhk.numa;

public class NumaFirst {

	private static final float PRECISION = 0.000001f;
	
	private void bisekce(double a, double b){
		
		double y = Double.MAX_VALUE;
		
		int step = 1;
		while(Math.abs(y) >= PRECISION){
			System.out.print(step + ":");
			double s = (a + b) / 2;
			y = bisekceFce(s);
			
			System.out.println("s: " + s);
			System.out.println("f(s): " + y);
			
			if(y > 0){
				a = s;
			} else {
				b = s;
			}
			
			System.out.println("<"+a + ";"+b+">");
			System.out.println();
			step ++;
		}
	}
	
	private double bisekceFce(double s){
		return (s*s) - Math.cos(s);
	}
	
	public static void main(String[] a){
		NumaFirst numaFirst = new NumaFirst();
		numaFirst.bisekce(-1.0f, -0.5f);
		
	}
	
}
