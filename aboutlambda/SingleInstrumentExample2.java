package com.xinpaninjava.aboutlambda;

/**
 * test having one return result method by lambda
 */
@FunctionalInterface
interface computor {
	int add(int x, int y);
}

public class SingleInstrumentExample2 {

	public static void main(String[] args) {
		// initialize the interface
		computor computor = (x, y) -> x + y;
		// invoke the concrete method by x+y
		System.out.println("the result is " + computor.add(1, 2));
	}

}
