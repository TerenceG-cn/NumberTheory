package com.tce.slgl.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PrimeFactors
 * @Description 将任意自然数分解为质数的乘积
 * @Author TerenceG
 * @LastModifyDate 2021/2/28
 */
public class PrimeFactors {

    private static final int MIN_PRIME_NUM = 2;

    public static Map<Long, Integer> calc2(long number) {
        Map<Long, Integer> factors = new HashMap<>(16);
        //内层循环
        if (number >= MIN_PRIME_NUM) {
            for (long factor = 2; factor < number; factor++) {
                while (number % factor == 0 && number > factor) {
                    if (factors.containsKey(factor)) {
                        factors.put(factor, factors.get(factor) + 1);
                    } else {
                        factors.put(factor, 1);
                    }
                    number = number / factor;
                }
            }
            if (factors.containsKey(number)) {
                factors.put(number, factors.get(number) + 1);
            } else {
                factors.put(number, 1);
            }
        }

        return factors;
    }

    public static Map<Long, Integer> calc3(long num) {
        Map<Long, Integer> factors = new HashMap<>(16);
        //外层循环
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (factors.containsKey(i)) {
                    factors.put(i, factors.get(i) + 1);
                } else {
                    factors.put(i, 1);
                }
                num /= i;
                i--;
            }
        }
        if (factors.containsKey(num)) {
            factors.put(num, factors.get(num) + 1);
        } else {
            factors.put(num, 1);
        }
        return factors;
    }


    public static void main(String[] args) {
        int size = 100000;
        long startTime = System.currentTimeMillis() / 1000;
        for (int i = 0; i <= size; i++) {
            System.out.println(i + ": " + PrimeFactors.calc2(i));
        }
        long endTime = System.currentTimeMillis() / 1000;
        System.out.println("总耗时：" + (endTime - startTime));


        //num=9991,12083,31706,148997,9999973,200000000235L,4*Math.pow(148997, 2)+1)
        //System.out.println(PrimeFactors.calc3(31706))
    }
}
