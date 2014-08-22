package com.phei.netty.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		
		CountDownLatch latch = new CountDownLatch(3);
		
		pool.execute(new Boss(latch));
		pool.execute(new Worker(latch, "张三"));
		pool.execute(new Worker(latch, "李四"));
		pool.execute(new Worker(latch, "王五"));
		
		pool.shutdown();
	}
}
