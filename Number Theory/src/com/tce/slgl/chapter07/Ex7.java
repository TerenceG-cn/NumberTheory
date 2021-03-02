package com.tce.slgl.chapter07;

/**
 * @author TerenceG
 * @classname Ex7
 * @description 分解正整数为素数乘积
 * @lastmodifydate 2021/2/28
 */
public class Ex7 {
    public static void main(String[] args) {
        System.out.print(7393 + " = ");
        getPrimeFactors(7393);
    }

    private static void getPrimeFactors(int num) {
        int i = 2;
        if (num == i) {
            System.out.println(num);
        } else {
            while (true) {
                if (num % i == 0) {
                    System.out.print(i + "*");
                    getPrimeFactors(num / i);
                    break;
                } else {
                    i++;
                    if (i == num) {
                        System.out.println(num);
                        break;
                    }
                }
            }
        }
    }
}
