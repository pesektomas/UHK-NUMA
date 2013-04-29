package org.uhk.numa;

public class NumaFirst {

	
		
	public static void main(String[] a){
		
		//Bisekce bisekce = new Bisekce();
		//bisekce.bisekce(-1.0f, -0.5f);
		//bisekce.bisekce(1.0f, 0.5f);
		
		//Newton newton = new Newton();
		//newton.tab(1.0f, 1.4f, 0.1f);	// vysledek 1,1 .. 1,2
		//newton.furier(1.1f, 1.2f, 0.01f);
		//newton.newton(1.2f);
		
		SimpleIteration iteration = new SimpleIteration();
		//iteration.tab(0.5f, 0.6f, 0.01f, SimpleIteration.FCE_1);
		//System.out.println();
		//iteration.tab(3.6f, 3.7f, 0.01f, SimpleIteration.FCE_1);
		//iteration.iter(0.5f, SimpleIteration.FCE_1);
		
		//iteration.tab(3.6f, 3.7f, 0.01f, SimpleIteration.FCE_2);
		iteration.iter(3.6f, SimpleIteration.FCE_2);
	}
	
}
