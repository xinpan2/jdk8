package com.xinpaninjava.methodinvoke;

/**
 * invoke the instance method by class
 * 
 * take the compareTo() in the String as an example:
 * 
 * public int compareTo(String anotherString)
 */
@FunctionalInterface
interface comparator {
	int compare(String s1, String s2);
}

public class InvokeInstanceMethodByClass {

	public static void main(String[] args) {
		/*
		 * invoke the instance method
		 */
		comparator comparator = String::compareTo;
		System.out.println(comparator.compare("A", "B"));
	}
}
