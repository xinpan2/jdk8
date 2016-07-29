package com.xinpaninjava.functionalinterface;

import java.util.function.Predicate;

/**
 * test predicate interface as its name ,which
 * we can acknowledge the result is boolean type
 * so do we use the return type is boolean
 * 
 * @FunctionalInterface
 * public interface Predicate<T> {
 * 
 *  boolean test(T t);
 *  
 *  }
 */
public class PredicateTest {

	public static void main(String[] args) {
		Predicate<String> predicate = "asfaswe#"::endsWith;
		System.out.println(predicate.test("#"));
	}

}
