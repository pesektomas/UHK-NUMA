package org.uhk.numa;

public class Bisekce {
	private static final float PRECISION = 0.000001f;

	public void bisekce(double a, double b) {

		double y = Double.MAX_VALUE;

		int step = 1;
		while (Math.abs(y) >= PRECISION) {
			System.out.print(step + ":");
			double s = (a + b) / 2;
			y = bisekceFce(s);

			System.out.println("s: " + s);
			System.out.println("f(s): " + y);

			if (y > 0) {
				a = s;
			} else {
				b = s;
			}

			System.out.println("<" + a + ";" + b + "> \n");
			step++;
		}
	}

	private double bisekceFce(double s) {
		return (s * s) - Math.cos(s);
	}
}
