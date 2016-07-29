package com.xinpaninjava.functionalinterface;

import java.util.function.Consumer;

/**
 * test the consumer interface
 * 
 * use the System.out.println() as an example,since
 * 
 * no result returned;
 * 
 * structure:
 * 
 * @FunctionalInterface 
 * public interface Consumer<T> {
 * 
 * public void accept(T t);
 * 
 * }
 * 
 */
public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> consumer = System.out::println;
		consumer.accept("hahahahhha");
	}

}
