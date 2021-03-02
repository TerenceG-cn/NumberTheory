package com.tce.slgl.chapter12;

public class xiti12_5 {
    // 求n的阶乘
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

	public static int fun3_2(int n) {
		if (n == 1 || n == 2) {
			return 0;
		} else {
			return n / 3 + fun3_2(n / 3);
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

	public static void main(String[] args) {
		int size=11;
		for(int i=1;i<size;i++) {
			System.out.println("fun1: "+i+"!:"+fun1(i));
			System.out.println("fun2: "+i+"!:"+fun2(i));
		}
		System.out.println(10 + "!:" + fun1(10));
		System.out.println(100 + "!:" + fun2(100));
		System.out.println(1000 + "!:" + fun2(1000));

		for(int i=1;i<size;i++) {
			System.out.println("fun3:\t"+i+"!:"+fun3(i));
			System.out.println("fun3_2:\t"+i+"!:"+fun3_2(i));
		}

		System.out.println(fun(1000, 7));
		System.out.println(fun(5000, 11));
	}

}
