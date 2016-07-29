package com.xinpaninjava.aboutlambda;

/**
 * utilize the lambda expression to initialize the Runnable interface
 * 
 * @author XinPan
 * @since 2016-07-29 12:21:47
 */
public class MultiTreadTestByLambda {

	public static void main(String[] args) {
		// lambda±í´ïÊ½
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("run..." + i);
			}
		});
		// run thread
		thread.start();
		// main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("main..." + i);
		}
	}

}
