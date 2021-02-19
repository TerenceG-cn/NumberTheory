package com.tce.slgl.chapter15;

import static com.tce.slgl.chapter15.xiti15_10.funK;
import static com.tce.slgl.chapter15.xiti15_7.funs;

import java.util.concurrent.CountDownLatch;;

public class Fun¦ÒTask implements Runnable {
	private long start;
	private long end;
	private CountDownLatch latch;

	public Fun¦ÒTask(long start, long end, CountDownLatch latch) {
		this.start = start;
		this.end = end;
		this.latch = latch;
	}

	@Override
	public void run() {
		
		for (long i = start; i <= end; i++) {
			if (i != funs(i) && !funK(i, 3) && funK(i, 9))// && i != funs(funs(i)
				System.out.println(i);
		}
		latch.countDown();

	}

}
