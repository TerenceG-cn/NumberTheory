package com.tce.slgl.chapter17;

import com.tce.slgl.chapter05.GCD_LCM;
import com.tce.slgl.chapter06.xiti6_3;
import com.tce.slgl.chapter11.xiti11_4;
import com.tce.slgl.chapter16.xiti16_2;

public class xiti17_6 {
	/**
	 * ���� x��k�η� ģm��k��� ����gcd(k,��(m))=1��gcd(b,m)=1 �����Է���
	 * ku-��(m)b=1=gcd(k,��(m))���Եõ�һ���u��v ��ŷ����ʽ b�Ħ�(m)�η� ģm��1
	 * 
	 * @param power k
	 * @param mod   m
	 * @param b
	 * @return
	 */
	public static long fun(long power, long mod, long b) {
		if (GCD_LCM.gcd(b, mod) != 1) {
			System.out.println("gcd(b, mod) != 1");
			return 0;
		}
		long eularM = xiti11_4.getEularFun(mod);
		if (GCD_LCM.gcd(power, eularM) != 1) {
			System.out.println("gcd(k, ��(m)) != 1");
			return 0;
		}
		long u = xiti6_3.fun(power, eularM)[0];
		return xiti16_2.funaKm(b, u, mod);

	}

	public static void main(String[] args) {
//		System.out.println(fun(329, 1147, 452));
//		System.out.println(fun(113, 463, 347));
//		System.out.println(fun(275, 588, 139));
		System.out.println(fun(2, 337, 84));
	}

}
