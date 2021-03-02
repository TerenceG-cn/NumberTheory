package com.tce.slgl.chapter09;

/**
 * @author TerenceG
 * @classname Ex1
 * @description 习题9.1
 * @lastmodifydate 2021/3/2
 */
public class Ex1 {
    public static void main(String[] args) {
        int size = 29;
        for (int x = 0; x < size; x++) {
            if (Math.pow(x, 2) % size == 6) {
                System.out.println(x);
            }
        }
        size = 13;
        for (int x = 0; x < size; x++) {
            if (Math.pow(x, 3) % size == 3) {
                System.out.println(x);
            }
        }
    }
}
