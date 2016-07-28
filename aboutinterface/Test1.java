package com.xinpaninjava.aboutinterface;

/**
 * to test the define concrete method body in the interface cannot be invoked
 */
public class Test1 {

	public static void main(String[] args) {
		// static method
		IPuppy.staticMethod();
		// default method
		IPuppyImpl iPuppyImpl = new IPuppyImpl();
		iPuppyImpl.defaultMethod();
	}

}
