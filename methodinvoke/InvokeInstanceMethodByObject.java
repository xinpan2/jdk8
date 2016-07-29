package com.xinpaninjava.methodinvoke;

/**
 * invoke the instance method by object
 * 
 * have a glance of toLowerCase():
 * 
 * public String toLowerCase()
 */

@FunctionalInterface
interface computor {
	String transfer();
}

public class InvokeInstanceMethodByObject {

	public static void main(String[] args) {
		/*
		 * A is the object of String and
		 * toLowerCase method is an instance
		 * method
		 */
		computor computor = "A"::toLowerCase;
		System.out.println(computor.transfer());
	}

}
