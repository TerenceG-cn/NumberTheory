package com.tce.slgl.funactions;

public class Factorial {
	/**
	 * 求数x的阶乘
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
