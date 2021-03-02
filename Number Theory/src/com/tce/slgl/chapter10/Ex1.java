package com.tce.slgl.chapter10;

import com.tce.slgl.utils.EuclideanAlgorithm;

/**
 * @author TerenceG
 * @classname Ex1 todo
 * @description 习题10.1
 * @lastmodifydate 2021/3/2
 */
public class Ex1 {

	public static void main(String[] args) {
		int m;
		for (m = 1; m < 17; m++) {
			int b = 1;
			for (int j = 1; j < m; j++) {
				if (EuclideanAlgorithm.gcd(j, m) == 1) {
					b *= j;
				}
			}
			System.out.println("m=" + m + "\tB=" + b + "\t\tB??1(mode m) or B??1(mode m)\t" + b % m + "\tvt" + (b * b) % m);
		}
//		int B=1,count=0;
//		for (int j = 1; j < 3750; j++) {
//			if (GCD_LCM.gcd(j, 3750) == 1) {
//				count++;
//				B *= j;
//			}
//		}
//		System.out.println(count);
	}

}
