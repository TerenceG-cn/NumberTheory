package com.tce.slgl.chapter05;

/**
 * @author TerenceG
 * @classname ThreeNplusOne
 * @description 3n+1问题
 * @lastmodifydate 2021/2/28
 */
public class ThreeNplusOne {
    public static void main(String[] args) {
        int n, count, i, size = 900;
        for (i = 1; i < size; i++) {
            n = i;
            count = 1;
            System.out.print(n);
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                count++;
            }
            System.out.println("\t算法长度：" + count);
        }
    }
}
