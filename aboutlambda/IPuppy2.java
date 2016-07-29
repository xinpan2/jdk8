package com.xinpaninjava.aboutlambda;

/**
 * jdk8 new features about functional programming
 */
public interface IPuppy2 {
	public static void staticMethod() {
		System.out.println("IPuppy.staticMethod()");
	}

	public default void defaultMethod() {
		System.out.println("IPuppy.defaultMethod()");
	}

	void add();
}
