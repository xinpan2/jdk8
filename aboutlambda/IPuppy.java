package com.xinpaninjava.aboutlambda;

import java.awt.event.ActionListener;
import java.io.File;

/**
 * jdk8 new features about functional programming
 */
@FunctionalInterface
public interface IPuppy {
	public static void staticMethod() {
		System.out.println("IPuppy.staticMethod()");
	}

	public default void defaultMethod() {
		System.out.println("IPuppy.defaultMethod()");
	}

	void add();

	// void add2();
}
