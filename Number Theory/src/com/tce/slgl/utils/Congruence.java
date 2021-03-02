package com.tce.slgl.utils;

import java.util.Objects;

/**
 *@classname         Congruence
 *@description       同余式方程
 *@author            TerenceG
 *@lastmodifydate    2021/3/2
 */
public class Congruence {
    /**
     * @author TerenceG
     * @lastmodifydate 2021/3/2
     * @description: 解同余式方程
     * @Param: * @param a * @param c * @param m, ax≡c(mod m)
     * @Return: long
     */
    public static long congruence(long a, long c, long m) {
        long g = EuclideanAlgorithm.gcd(a, m);
        long u0;
        u0 = Objects.requireNonNull(CustomSolution.fun1(a, -m))[0];
        long xk=0;

        if (c % g != 0) {
            System.out.println("" + a + "x" + " ≡ " + c + "(mod " + m + ")无解");
            System.out.println("gcd(a,m) = "+g);
            System.out.println("---------------------------------");
            return xk;
        }
        long x0 = c * u0 / g;
        // System.out.println("u0:"+u0+" g:"+g+" x0:"+x0);//test
        System.out.println("" + a + "x" + " ≡ " + c + "(mod " + m + ")的解共有" + g + "个");
        for (int k = 0; k < g; k++) {
            xk = x0 + k * m / g;
            while(xk>m) {
                xk-=m;
            }
            System.out.println("" + xk + "(mod " + m + ")");
        }
        System.out.println("---------------------------------");
        return xk;
    }
}
