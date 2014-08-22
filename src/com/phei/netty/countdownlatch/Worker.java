package com.phei.netty.countdownlatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Worker implements Runnable {

	private CountDownLatch latch;
	private String name;
	
	public Worker(CountDownLatch latch, String name) {
		this.latch = latch;
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + " 开始工作...");
		
		try {
			TimeUnit.SECONDS.sleep(new Random().nextInt(15));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		latch.countDown();
		System.out.println(name + " 干完活儿了，交工去...");
	}

}
