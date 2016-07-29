package com.xinpaninjava.aboutlambda;

/***
 * test the second form of lambda expression by
 * 
 * printing out a random chars
 * 
 * @author XinPan
 * @since 2016-07-29 12:25:13
 *
 */
@FunctionalInterface
interface Animal {
	void eat();
}

public class SingleInstrument {

	public static void main(String[] args) {
		Animal animal = () -> System.out.println("eat¡­¡­");
		animal.eat();
	}

}
