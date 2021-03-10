package com.tce.slgl.chapter15;

import static com.tce.slgl.utils.EulerFunction.fun;
import static com.tce.slgl.utils.EulerFunction.funs;

/**
 * @author TerenceG
 * @classname Ex7
 * @description 习题15.7
 * @lastmodifydate 2021/3/7
 */
public class Ex7 {

    public static void main(String[] args) {
        int bz = 0, wq = 0, gs = 0;
        int size = 28123;
        for (long i = 2; i < size; i++) {
            long n = fun(i);
            System.out.print("σ(" + i + ") = " + n + "\t");
            if (n > 2 * i) {
                System.out.println(" " + i + "是过剩数");
                gs++;
            } else if (n < 2 * i) {
                System.out.println(" " + i + "是不足数");
                bz++;
            } else {
                System.out.println(" " + i + "是完全数");
                wq++;
            }
        }
        System.out.println("不足数：" + bz + "完全数：" + wq + "过剩数：" + gs);

        System.out.println(funs(18048976));
        System.out.println(funs(20100368));
        System.out.println(funs(18914992));
        System.out.println(funs(19252208));

        System.out.println(funs(805984760));
        System.out.println(funs(1268997640));
        System.out.println(funs(1803863720));
        System.out.println(funs(2308845400L));
        System.out.println(funs(3059220620L));
        System.out.println(funs(3367978564L));
        System.out.println(funs(2525983930L));
        System.out.println(funs(2301481286L));
        System.out.println(funs(1611969514L));


    }
}
