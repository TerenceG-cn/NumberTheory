package com.tce.slgl.chapter33;

import com.tce.slgl.utils.EuclideanAlgorithm;

/**
 * @author TerenceG
 * @classname Exw
 * @description 习题33.2
 * @lastmodifydate 2021/3/11
 */
public class Ex2 {
    private static final double GOLD = (1 + Math.pow(5, 0.5)) / 2;

    private void findGold(int Y) {
        double x = 0, y = 21;
        double[] res = {0, 1, 0};

        System.out.println(GOLD);
        while (y <= Y) {
            x = Math.rint(y * GOLD);
            System.out.println("y=" + y + " x=" + x);
            if (Math.abs(x - y * GOLD) < res[1] && x > 0 && EuclideanAlgorithm.gcd((long) x, (long) y) == 1) {
                res[1] = Math.abs(x - y * GOLD);
                res[0] = x;
                res[2] = x / y;
            }
            y++;
        }
        System.out.println(res[0] + " " + res[1] + " " + res[2]);
    }

    public static void main(String[] args) {
        Ex2 cla = new Ex2();
        cla.findGold(1000);
    }
}
