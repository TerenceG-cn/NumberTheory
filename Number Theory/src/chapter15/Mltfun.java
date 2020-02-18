package chapter15;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mltfun {
	public static void main(String[] args) {

		int threadNum = 10;
		CountDownLatch latch = new CountDownLatch(threadNum);
		long[] startN = new long[threadNum];
		long[] endN = new long[threadNum];
		int max = 1000_000_000;
		int min = 800_000_000;
		int tmp = min;

		long len = (max - min) / threadNum;

		for (int i = 0; i < threadNum; i++) {
			startN[i] = tmp;
			tmp += len;
			endN[i] = tmp - 1;
		}
//		System.out.println(startN[5]);
//		System.out.println(endN[5]);
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			for (int i = 0; i < threadNum; i++) {
				System.out.println("thread" + i + "开始运行！");
				exec.execute(new funσTask(startN[i], endN[i], latch));
			}
			latch.await();
			exec.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
