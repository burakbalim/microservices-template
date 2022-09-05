package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class DemoApplication {

	static ExecutorService executorService = Executors.newFixedThreadPool(100);
	final static Object object = new Object()

	public static void main(String[] args) {

		executorService.submit(new Runnable() {
			@Override
			public void run() {
				test();
			}
		});

	}

	public synchronized static void test() {//here
		//TODO calculation
	}

}
