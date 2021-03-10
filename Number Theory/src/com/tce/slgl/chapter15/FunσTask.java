package com.tce.slgl.chapter15;

import static com.tce.slgl.chapter15.Ex10.funK;
import static com.tce.slgl.utils.EulerFunction.funs;


import java.util.concurrent.CountDownLatch;
/**
 * @author TerenceG
 * @classname FunσTask
 * @description todo
 * @lastmodifydate 2021/3/8
 */
class FunσTask implements Runnable {
    private long start;
    private long end;
    private CountDownLatch latch;

    FunσTask(long start, long end, CountDownLatch latch) {
        this.start = start;
        this.end = end;
        this.latch = latch;
    }

    @Override
    public void run() {

        for (long i = start; i <= end; i++) {
            //if (i != funs(i) && !funK(i, 3) && funK(i, 9)) && i != funs(funs(i)
            if (i != funs(i) && !funK(i, 3) && funK(i, 9)) {
                System.out.println(i);
            }
        }
        latch.countDown();

    }

}
