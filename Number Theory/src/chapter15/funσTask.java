package chapter15;

import static chapter15.xiti15_10.funK;
import static chapter15.xiti15_7.funs;

import java.util.concurrent.CountDownLatch;;

public class fun��Task implements Runnable {
	private long start;
	private long end;
	private CountDownLatch latch;

	public fun��Task(long start, long end, CountDownLatch latch) {
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
