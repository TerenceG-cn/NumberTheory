package com.tce.slgl.chapter16;

import java.util.Random;

import com.tce.slgl.utils.PrimeFactors;

/**
 * @author TerenceG
 * @classname Ex4
 * @description 习题16.4
 * @lastmodifydate 2021/2/28
 */
public class Ex4 {
    /**
     * /**
     *
     * @author TerenceG
     * @lastmodifydate 2021/3/8
     * @description: 大素数检测
     * @Param: * @param num
     * @Return: boolean
     */
    public static boolean largePrimeDetection(long num) {
        Random random = new Random();
        long[] randomArray = new long[100];
        for (int i = 0; i < randomArray.length; i++) {
            //选取2与n-1之间的10个随机数
            randomArray[i] = Math.abs(random.nextLong()) % (num - 1) + 1L;
        }
        for (int j = 0; j < randomArray.length; j++) {
            if (Ex2.funaKm(randomArray[j], num - 1, num) != 1) {
                System.out.println(num + "是合数！");
                return false;
            }
        }
        System.out.println(num + "可能是素数。");
        if (PrimeFactors.calc3(num).containsKey(num)) {
            System.out.println(num + "是素数！");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        long start = 200_000_138L;
        long end = 600_000_000L;
        for (long i = start; i < end; i++) {
            largePrimeDetection(i);
        }
    }
}
