package com.tce.slgl.chapter15;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * @author TerenceG
 * @classname MltFun
 * @description todo
 * @lastmodifydate 2021/3/8
 */
public class MltFun {
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
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			long startTime = System.currentTimeMillis() / 1000;
			for (int i = 0; i < threadNum; i++) {
				System.out.println("thread" + i + "开始运行！");
				exec.execute(new FunσTask(startN[i], endN[i], latch));
			}
			latch.await();
			long endTime = System.currentTimeMillis() / 1000;
			//805984760  运行时间：66321 s
			System.out.println("运行时间：" + (endTime - startTime) + " s");
			exec.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
