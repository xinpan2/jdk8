package com.xinpaninjava.aboutlambda;

/**
 * initialize the interface by anonymous inner type
 * 
 * @author XinPan
 * @since 2016-07-29 11:39:54
 */
public class MultiThreadTest {

	public static void main(String[] args) {
		// 匿名内部类
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("run..." + i);
				}
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
