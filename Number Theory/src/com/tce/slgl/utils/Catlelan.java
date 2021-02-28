package com.tce.slgl.utils;
//卡特兰数递推公式h(n)=h(n-1)*(4*n-2)/(n+1);

import java.math.*;
import java.util.*;

/**
 *@classname         Catlelan
 *@description       卡特兰数
 *@author            TerenceG
 *@lastmodifydate    2021/2/28
 */
public class Catlelan {
    /**
     * @author TerenceG
     * @lastmodifydate 2021/2/28
     * @description: 卡特兰数打表
     * @Param: * @param size
     * @Return: java.math.BigInteger[]
     */
    public static BigInteger[] getCatlelanList(int size) {
        BigInteger dp[];//定义一个数组
        //规定数组的大小
        dp = new BigInteger[size];
        dp[1] = BigInteger.valueOf(1);
        int i;
        //卡特兰数打表
        for (i = 2; i < size; i++) {
            dp[i] = dp[i - 1].multiply(BigInteger.valueOf(4 * i - 2)).divide(BigInteger.valueOf(i + 1));
        }
        return dp;
    }

    public static void main(String[] args) {
        //需要第几个卡特兰数
        Scanner cin = new Scanner(System.in);
        int m;
        BigInteger[] dp = getCatlelanList(1000);
        while (cin.hasNext()) {
            m = cin.nextInt();
            System.out.println(dp[m]);
        }
        cin.close();
    }
}