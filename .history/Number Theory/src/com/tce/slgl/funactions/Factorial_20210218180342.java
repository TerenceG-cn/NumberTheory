package com.tce.slgl.utils;

public class Factorial {
	/**
	 * ����x�Ľ׳�
	 * @param x
	 * @return
	 */
	static long getFactorial(int x) {
		if(x==0) return 1;
		return x*getFactorial(x-1);
	}
	public static void main(String[] args) {
		System.out.println(getFactorial(17));
	}
}
