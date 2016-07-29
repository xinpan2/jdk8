package com.xinpaninjava.aboutlambda;

/**
 * the concrete method has one parameter
 */

@FunctionalInterface
interface Dog {
	void shout(String name);
}

public class SingleParameter {

	public static void main(String[] args) {
		// omit the () and {}
		Dog dog = x -> System.out.println(x + " is shouting !!!");
		dog.shout("smith");
	}

}
