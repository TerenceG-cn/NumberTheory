package com.tce.slgl.chapter10;

import java.util.Scanner;

public class CongruenceSystem {

	public static long cgrResult(long[] params) {
		long b = params[0], m = params[1], c = params[2], n = params[3];
		long y = com.tce.slgl.chapter08.xiti8_7.congruence(m, c - b, n);
		while (y < 0) {
			y += n;
		}
		System.out.println(y);
		return y * m + b;
	}

	public static void main(String[] args) {
		long[] params = new long[4];// b,m,c,n;x¡Ôb(mod m),x¡Ôc(mod n)
		for (int i = 0; i < params.length; i++) {
			params[i] = new Scanner(System.in).nextLong();
		}
		System.out.println(cgrResult(params));
	}

}
