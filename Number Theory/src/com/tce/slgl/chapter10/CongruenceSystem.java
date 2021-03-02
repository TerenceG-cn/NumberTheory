package com.tce.slgl.chapter10;

import java.util.Scanner;

import static com.tce.slgl.utils.Congruence.congruence;
/**
 * @author TerenceG
 * @classname CongruenceSystem
 * @description 同余式方程
 * @lastmodifydate 2021/3/2
 */
public class CongruenceSystem {

	public static long cgrResult(long[] params) {
		long b = params[0], m = params[1], c = params[2], n = params[3];
		long y = congruence(m, c - b, n);
		while (y < 0) {
			y += n;
		}
		System.out.println(y);
		return y * m + b;
	}

	public static void main(String[] args) {
		// b,m,c,n;x≡b(mod m),x≡c(mod n)
		long[] params = new long[4];
		for (int i = 0; i < params.length; i++) {
			params[i] = new Scanner(System.in).nextLong();
		}
		System.out.println(cgrResult(params));
	}

}
