package chapter10;

import java.util.Scanner;

import chapter08.xiti8_7;

public class CongruenceSystem {

	public static long cgrResult(long[] params) {
		long b = params[0], m = params[1], c = params[2], n = params[3];
		long y = xiti8_7.congruence(m, c - b, n);
		while(y<0) {
			y+=n;
		}
		System.out.println(y);
		return y * m + b;
	}

	public static void main(String[] args) {
		long[] params = new long[4];// b,m,c,n;x��b(mod m),x��c(mod n)
		for (int i = 0; i < params.length; i++) {
			params[i] = new Scanner(System.in).nextLong();
		}
		System.out.println(cgrResult(params));
	}

}
