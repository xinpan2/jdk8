package com.xinpaninjava.methodinvoke;

/**
 * using the class to invoke the static method
 */
@FunctionalInterface
interface IExample1 {
	int add(int x, int y);
}

public class InvokeStaticMethodByClass {

	public static void main(String[] args) {
		/*
		 * invoke the static method by class
		 * 
		 * utilizing the form "className::staticMethodName"
		 */
		IExample1 example1 = InvokeStaticMethodByClass::add;
		System.out.println("the result is:" + example1.add(1, 2));
	}

	// the static method
	public static int add(int x, int y) {
		return x + y;
	}

}
