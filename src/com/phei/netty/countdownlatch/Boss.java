package com.phei.netty.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Boss implements Runnable {
	private CountDownLatch latch;
	
	public Boss(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		System.out.println("老板在等所有工人干完活。。。");
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("老板终于可以验工了，验完收工！");
	}
}
