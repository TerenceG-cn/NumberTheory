package com.tce.slgl.chapter10;

/**
 * 求高次幂的末尾数字，4位
 * 
 * @author TerenceG
 *
 */
public class xiti11_13 {
	public static int getLastFour(int a, int potence) {
		int res = a;
		for (int i = 1; i < potence; i++) {
			res *= a;// wrong a*=a;
			if (res > 100_00) {
				res %= 10000;
			}
		}
		//System.out.println(a + " : " + res);
		return res;
	}

	public static void main(String[] args) {
//		for (int i = 2; i <= 10; i++) {
//			getLastFour(i, 1000);
//		}
		int count=0;
		for(int j=1;j<=1000;j++) {
			if(getLastFour(6, j)==16)
				System.out.println(count);
			count++;
		}
	}
}
