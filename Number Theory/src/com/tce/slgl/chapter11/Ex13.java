package com.tce.slgl.chapter11;

/**
 * @author TerenceG
 * @classname Ex13
 * @description 习题11.13：求高次幂的末尾数字，4位
 * @lastmodifydate 2021/3/2
 */
public class Ex13 {
    private static int getLastFour(int a, int potence) {
        int res = a;
        for (int i = 1; i < potence; i++) {
            res *= a;
            if (res > 100_00) {
                res %= 10000;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        /*
        for (int i = 2; i <= 10; i++) {
            getLastFour(i, 1000);
        }
        */
        int count = 0;
        int size = 1000;
        for (int j = 1; j <= size; j++) {
            if (getLastFour(6, j) == 16) {
                System.out.println(count);
            }
            count++;
        }
    }
}
