package com.tce.slgl.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TerenceG
 * @classname ContinuedFractionUti
 * @description 连分数工具类
 * @lastmodifydate 2021/3/8
 */
public class ContinuedFractionUtils {
    /**
     * @author TerenceG
     * @lastmodifydate 2021/3/8
     * @description: 求非平方数平方根的连分数表示
     * @Param: * @param num
     * @Return: List<Integer>
     */
    public static List<Integer> getCFbySR(int num) {
        List<Integer> res = new ArrayList<>();
        //开方
        double r = Math.sqrt(num);
        //取整
        int an = (int) Math.floor(r);
        res.add(an);

        boolean flag = true;
        int count = 0;
        while (flag) {
            //取倒数
            r = Math.pow(r - an, -1);
            an = (int) Math.floor(r);
            res.add(an);
            if (++count % 2 == 0 && count > 3) {
                int cn = 1;
                while (cn <= res.size() / 2 && res.get(cn).equals(res.get(cn + res.size() / 2))) {
                    cn++;
                }
                if (cn == res.size() / 2 + 1) {
                    flag = false;
                }
            }
        }
        //删除多余的元素 循环节长度+1（a0）
        int len = res.size() / 2 + 1;
        while (res.size() > len) {
            res.remove(res.size() - 1);
        }
        return res;
    }

    /**
     * @author TerenceG
     * @lastmodifydate 2021/3/8
     * @description: 连分数加法
     * @Param: * @param lmn  int[3]  l + m/n
     * @Return: List<Integer>
     */
    public static int[] addtion(int[] lmn) {
        int numerator = lmn[0] * lmn[2] + lmn[1];
        int denominator = lmn[2];
        int[] res = new int[2];
        res[0] = numerator;
        res[1] = denominator;
        return res;
    }

    public static void main(String[] args) {
        //41的循环节2 2 12 ，有点问题 todo 小改，对于循环节是1的要另外考虑
        List<Integer> res = getCFbySR(41);

        for (Integer i : res
        ) {
            System.out.println(i);
        }
    }
}
