package com.tce.slgl.chapter09;

import static com.tce.slgl.utils.Congruence.congruence;
import static com.tce.slgl.utils.FactorialAndPower.getFactorial;

/**
 * @author TerenceG
 * @classname Ex2
 * @description 习题9.2
 * @lastmodifydate 2021/3/2
 */
public class Ex2 {
	//TODO
    public static int findp(int lim, int[] aa) {
        int i, j = 0, k = 0;
        //下标：i代表>=2的需要判断是否为素数的整数
        for (i = 2; i < lim; i++) {
            //下标:j代表》=2小于i的整数
            for (j = 2; j < i; j++) {
				//如果能被整出，立即退出
				if (i % j == 0) {
					break;
				}
			}
            //如果下标j=i，那么是素数，并加入下标为k的aa数组
            if (j == i) {
                aa[k++] = i;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] aa = new int[100];
        int size = 8;
        findp(100, aa);
        //22!超范围
        for (int i = 0; i < size; i++) {
            congruence(1, getFactorial(aa[i] - 1), aa[i]);
        }
    }

}
