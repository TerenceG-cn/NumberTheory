package com.tce.slgl.chapter12;

import static com.tce.slgl.utils.FactorialAndPower.*;

/**
 * @author TerenceG
 * @classname Ex5
 * @description 习题12.5
 * @lastmodifydate 2021/3/7
 */
public class Ex5 {

	public static void main(String[] args) {
		int size = 11;
		for (int i = 1; i < size; i++) {
			System.out.println("fun1: " + i + "!:" + fun1(i));
			System.out.println("fun2: " + i + "!:" + fun2(i));
		}
		System.out.println(10 + "!:" + fun1(10));
		System.out.println(100 + "!:" + fun2(100));
		System.out.println(1000 + "!:" + fun2(1000));

		for (int i = 1; i < size; i++) {
			System.out.println("fun3:\t" + i + "!:" + fun3(i));
			System.out.println("fun4:\t" + i + "!:" + fun4(i));
		}

		System.out.println(fun(1000, 7));
		System.out.println(fun(5000, 11));
	}
}
