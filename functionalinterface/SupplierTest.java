package com.xinpaninjava.functionalinterface;

import java.util.function.Supplier;

/**
 * supplier interface test
 * 
 * by invoking any class's constructor to initialize
 * 
 * and return the object
 * 
 * structure:
 * 
 * @FunctionalInterface 
 * public interface Supplier<T> {
 * 
 *       T get();
 * 
 *  }
 */
public class SupplierTest {
	public static void main(String[] args) {
		Supplier<Dog> supplier = Dog::new;
		System.out.println(supplier.get());
	}

}

/**
 * the Dog class
 * 
 * devise the constructor having 2 parameters
 */
class Dog {
	private String name;
	private double price;

	// public Dog(String name, double price) {
	// super();
	// this.name = name;
	// this.price = price;
	// }
}