package com.tce.slgl.chapter04;
/**
 *@classname         Ex2
 *@description       习题4.2
 *@author            TerenceG
 *@lastmodifydate    2021/2/28
 */
public class Ex2 {
	public static void main(String[] args) {
		int N = 1000000;
		int a, b, c;
		for (a = 1; a < N; a++) {
			for (c = a; c < N; c++) {
				if (2 * Math.pow(a, 3) == Math.pow(c, 2)) {
					System.out.println("" + a + " " + a + " " + c);
				}
			}
		}
	}
}
