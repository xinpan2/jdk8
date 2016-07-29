package com.xinpaninjava.functionalinterface;

import java.util.function.Function;

/**
 * test the function interface
 * 
 * structure:
 * 
 * Interface Function<T,R>{
 * 
 * public R apply(T t)
 * 
 * }
 * 
 * T: the input type R: the return type
 * 
 * testing by String.startsWith(String),which needs to input a parameter and
 * return a result
 */
public class FunctionTest {

	public static void main(String[] args) {

		Function<String, Boolean> function = "##hello"::startsWith;
		System.out.println(function.apply("##"));
	}

}
