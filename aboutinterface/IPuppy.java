package com.xinpaninjava.aboutinterface;

/**
 * jdk8 new features about interface
 * 
 * the interface can not devise concrete method body, which will raise the
 * compile error until jdk8
 */
public interface IPuppy {
	public static void staticMethod() {
		System.out.println("IPuppy.staticMethod()");
	}

	public default void defaultMethod() {
		System.out.println("IPuppy.defaultMethod()");
	}
}
