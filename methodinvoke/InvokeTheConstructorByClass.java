package com.xinpaninjava.methodinvoke;

/**
 * invoke the constructor by class
 */
@FunctionalInterface
interface DogFactory {
	Dog getDog(String name, double price);
}

/**
 * the Dog class
 * 
 * devise the constructor having 2 parameters
 */
class Dog {
	private String name;
	private double price;

	public Dog(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", price=" + price + "]";
	}

}

public class InvokeTheConstructorByClass {

	public static void main(String[] args) {
		/*
		 * invoke the constructor method
		 */
		DogFactory dogFactory = Dog::new;
		Dog dog = dogFactory.getDog("puppy", 99);
		System.out.println(dog);
	}

}
