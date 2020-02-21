package com.tce.slgl.chapter16;

public class xiti16_2 {
	/**
	 * 求a的k次方模m，逐次平方法
	 * 
	 * @param a
	 * @param k
	 * @param m
	 * @return
	 */
	public static long funaKm(long a, long k, long m) {
		long b = 1;
		while (k >= 1) {
			if (k % 2 == 1) {
				b = ((a * b) % m);
			}

			a = (long) (Math.pow(a, 2) % m);
			// System.out.println(a);
			k = k / 2;
			//
		}
		return b;
	}

	public static void main(String[] args) {
//		System.out.println(funaKm(5, 13, 23));// 21
//		System.out.println(funaKm(28, 749, 1147));// 289
//
//		System.out.println(funaKm(2, 1000, 2379));//562
//		System.out.println(funaKm(567, 1234, 4321));//3214
//		System.out.println(funaKm(47, 258008, 1315171));//1296608
		
		/*16.3*/
		System.out.println(funaKm(7, 7386, 7387));//702,7387不是素数
		System.out.println(funaKm(47, 7392, 7393));//1,7393可能是素数(实际上7393是一个素数)
	}
}
