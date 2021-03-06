package com.tce.slgl.utils;

import java.util.Map;

/**
 * @author TerenceG
 * @classname EulerFunction
 * @description 计算σ(n)，σ(n)是n的所有因数之和 1.将n分解为素数乘积 2.利用σ(n)两个性质
 * @lastmodifydate 2021/3/7
 */
public class EulerFunction {

    /**
     * @author TerenceG
     * @lastmodifydate 2021/2/28
     * @description: 求最大公约数
     * @Param: * @param p 素数 * @param k 幂次
     * @Return: long σ值
     */
    public static long funWithPrime(long p, int k) {
        return (long) ((Math.pow(p, k + 1) - 1) / (p - 1));
    }

    public static long fun(long n) {
        if (n < 1) {
            return 0;
        }
        Map<Long, Integer> factors = PrimeFactors.calc3(n);
        long result = 1L;

        for (Map.Entry<Long, Integer> f : factors.entrySet()) {
            result *= funWithPrime(f.getKey(), f.getValue());
        }

        return result;
    }

    /**
     * @author TerenceG
     * @lastmodifydate 2021/3/11
     * @description: s(n) = σ(n)-n
     * @Param: * @param n
     * @Return: long σ值
     */
    public static long funs(long n) {
        return fun(n) - n;
    }
}
