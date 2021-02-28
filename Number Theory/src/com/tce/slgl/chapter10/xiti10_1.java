package com.tce.slgl.chapter10;

import com.tce.slgl.utils.EuclideanAlgorithm;

public class xiti10_1 {

	public static void main(String[] args) {
		int m;
		for (m = 1; m < 17; m++) {
			int B = 1;
			for (int j = 1; j < m; j++) {
				if (EuclideanAlgorithm.gcd(j, m) == 1) {
					B *= j;
				}
			}
			System.out.println("m="+m+"\tB="+B+"\t\tB??1(mode m) or B??1(mode m)\t"+ B%m+"\tvt"+(B*B)%m);
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
