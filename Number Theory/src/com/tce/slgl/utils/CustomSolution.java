package com.tce.slgl.utils;

/**
 * @author TerenceG
 * @classname CustomSolution
 * @description TODO
 * @lastmodifydate 2021/2/28
 */
public class CustomSolution {
    /**
     * @author          TerenceG
     * @lastmodifydate  2021/2/28
     * @description:    解ax+by=gcd(a,b)的有效算法
     * @Param:       * @param a * @param b
     * @Return:     long[]
     */
    public static long[] fun1(long a, long b) {
        long x = 1, g = a, v = 0, w = b, y, s, t, q;
        long[] res = new long[2];
        while (true) {
            if (b == 0) {
                System.out.println("b=0?!");
                return null;
            }
            if (w == 0) {
                y = (g - a * x) / b;
                while (x < 0) {
                    x += b;
                    y -= a;
                }
                res[0] = x;
                res[1] = y;
                System.out.println("(g,x,y) = (" + g + "," + x + "," + y + ")");
                break;
            } else {
                t = g % w;
                q = (g - t) / w;
                s = x - q * v;
                x = v;
                g = w;
                v = s;
                w = t;
            }
        }
        return res;
    }
}