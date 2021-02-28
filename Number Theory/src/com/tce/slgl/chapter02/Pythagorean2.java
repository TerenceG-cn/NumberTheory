package com.tce.slgl.chapter02;

/**
 * @author TerenceG
 * @classname Pythagorean2
 * @description b值为2700的勾股数组
 * @lastmodifydate 2021/2/28
 */
public class Pythagorean2 {
    public static void main(String[] args) {
        int size = 10000;
        int b = 2700;
        for (int i = 1; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (Math.pow(j, 2) - Math.pow(i, 2) == Math.pow(b, 2)) {
                    System.out.println("(" + i + "," + "2700" + "," + j + ")");
                }
            }
        }
    }
}
