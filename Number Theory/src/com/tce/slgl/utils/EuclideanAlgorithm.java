package com.tce.slgl.utils;

/**
 * @author TerenceG
 * @classname EuclideanAlgorithm
 * @description 欧几里得算法计算最大公约数和最小公倍数。算法至多在2log2(b)步结束，步数至多是b位数的7倍。第5章第一次提及
 * @lastmodifydate 2021/2/28
 */
public class EuclideanAlgorithm {
    /**
     * @author TerenceG
     * @lastmodifydate 2021/2/28
     * @description: 求最大公约数
     * @Param: * @param n1 * @param n2
     * @Return: long
     */
    public static long gcd(long n1, long n2) {
        long a = Math.max(n1, n2);
        long b = Math.min(n1, n2);
        if (a == 0 || b == 0) {
            return 0;
        }
        while (b != 0) {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    private static long lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        /*
         * gcd(12345,67890)
         * gcd(54321,9876)
         * gcd(9048, 1645)
         * gcd(1338, 1115)
         * gcd(1438, 1115)
         */
        System.out.println(lcm(312, 56));
        System.out.println(gcd(301337, 307829));
        int size = 720;
        for (int i = 1; i < size; i++) {
            for (int j = i + 1; j <= size; j++) {
                if (gcd(i, j) == 18 && i * j == 720 * 18) {
                    System.out.println("" + i + ", " + j);
                }
            }
        }

    }
}
