/**
 * 
 */
package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author Dell
 *
 */
public class MainDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int r1 = Runtime.getRuntime().availableProcessors();
		System.out.println(r1);

		ExecutorService ftp = Executors.newFixedThreadPool(r1);

		IntStream.range(0, 10).forEach(x -> {
			ftp.execute(new Task());
		});

		ExecutorService stp = Executors.newScheduledThreadPool(10);
		stp.execute(new Task());

		ExecutorService ctp = Executors.newCachedThreadPool();
		ctp.execute(new Task());

		ExecutorService ste = Executors.newSingleThreadExecutor();
		ste.execute(new Task());

	}

}
