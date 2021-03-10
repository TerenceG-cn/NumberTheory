package com.tce.slgl.chapter15;

import static com.tce.slgl.utils.EulerFunction.fun;

/**
 * @author TerenceG
 * @classname EularProject23
 * @description 欧拉计划23
 * @lastmodifydate 2021/3/7
 */
public class EularProject23 {
    public static void main(String[] args) {
        int[] isPerfect = new int[28124];
        for (int i = 0; i < 28124; i++) {
            if (fun(i) > (2 * i)) {
                isPerfect[i] = 1;
            } else {
                isPerfect[i] = 0;
            }
        }
        int count = 0;
        for (int i = 28123; i > 0; i--) {
            count += i;
            for (int j = i; j >= 12; j--) {
                if (isPerfect[j] == 1 && isPerfect[i - j] == 1) {
                    count -= i;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
