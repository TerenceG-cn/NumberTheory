package com.tce.slgl.utils;

/**
 * @author TerenceG
 * @classname Factorial
 * @description 阶乘和幂次
 * @lastmodifydate 2021/2/28
 */
public class FactorialAndPower {
	/**
	 * @author          TerenceG
	 * @lastmodifydate  2021/3/7
	 * @description:    求x的阶乘
	 * @Param:       * @param x
	 * @Return:     long
	 */
	public static long getFactorial(int x) {
		if(x==0) {return 1;}
		return x*getFactorial(x-1);
	}
	public static void main(String[] args) {
		System.out.println(getFactorial(17));
	}

	/**
	 * @author          TerenceG
	 * @lastmodifydate  2021/3/7
	 * @description:    求n的阶乘
	 * @Param:       * @param n
	 * @Return:     long
	 */
	private static long clac(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * clac(n - 1);
		}
	}

	/**
	 * @author          TerenceG
	 * @lastmodifydate  2021/3/2
	 * @description:    求2的k次幂
	 * @Param:       * @param k
	 * @Return:     long
	 */
	public static long powerTwo(int k) {
		if (k == 0) {
			return 1;
		} else {
			return 2 * powerTwo(k - 1);
		}
	}

	/**
	 * @author          TerenceG
	 * @lastmodifydate  2021/3/2
	 * @description:    求n的k次幂
	 * @Param:       * @param n * @param k
	 * @Return:     long
	 */
	public static long powerN(int n, int k) {
		if (k == 0) {
			return 1;
		} else {
			return (long) n * powerN(n, k - 1);
		}
	}

	/**
	 * @author          TerenceG
	 * @lastmodifydate  2021/3/2
	 * @description:    求整除n的阶乘的2的最高幂次
	 * @Param:       * @param n
	 * @Return:     int
	 */
	public static int fun1(int n) {
		long clac = clac(n);
		int k = 0, res = 0;
		long pow2 = 0;
		while ((pow2 = powerTwo(k)) <= clac) {
			if (clac % pow2 == 0) {
				res = k;
			}
			k++;
		}
		return res;
	}

	public static int fun2(int n) {
		if (n == 1) {
			return 0;
		} else {
			return n / 2 + fun2(n / 2);
		}
	}

	/**
	 * @author          TerenceG
	 * @lastmodifydate  2021/3/2
	 * @description:    求整除n的阶乘的3的最高幂次
	 * @Param:       * @param n
	 * @Return:     int
	 */
	public static int fun3(int n) {
		int power=3;
		long clac = clac(n);
		int k = 0, res = 0;
		long powN;
		while ((powN = powerN(power, k)) <= clac) {
			if (clac % powN == 0) {
				res = k;
			}
			k++;
		}
		return res;
	}

	public static int fun4(int n) {
		int MIN_PRIME_NUM=2;
		if (n == 1 || n == MIN_PRIME_NUM) {
			return 0;
		} else {
			return n / 3 + fun4(n / 3);
		}
	}

	/**
	 * @author          TerenceG
	 * @lastmodifydate  2021/3/2
	 * @description:    求整除n的阶乘的p的最高幂次
	 * @Param:       * @param n * @param p
	 * @Return:     int
	 */
	public static int fun(int n, int p) {
		if (n < p) {
			return 0;
		} else {
			return n / p + fun(n / p, p);
		}
	}
}
