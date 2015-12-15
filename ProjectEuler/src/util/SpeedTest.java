package util;

import problem_018.MaximumPath;

public class SpeedTest {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		//---------------------------------------------------------
		//Replace with the program or method that should be tested:
		new MaximumPath();
		//---------------------------------------------------------
		
		long stop = System.currentTimeMillis();
		long delay = stop - start;
		System.out.println("Program executed in " + delay + " miliseconds");
	}

}
