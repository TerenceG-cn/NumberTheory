package com.tce.slgl.chapter33;

/**
 * @author TerenceG
 * @classname Ex3
 * @description 习题33.3
 * @lastmodifydate 2021/3/11
 */
public class Ex3 {
    static final double GOLD = (1 + Math.pow(5, 0.5)) / 2;

    public static void main(String[] args) {
        System.out.println(GOLD);
        double r = 1, ri = r;
        int i = 0;
        while (i++ < 30) {
            System.out.println(ri);
            System.out.println("|r" + i + "-γ|=" + Math.abs(GOLD - ri));
            ri = 1 + Math.pow(ri, -1);
        }
    }
}
