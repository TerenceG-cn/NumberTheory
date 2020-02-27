package com.tce.slgl.chapter17;

import com.tce.slgl.chapter06.xiti6_3;
import com.tce.slgl.chapter11.xiti11_4;
import com.tce.slgl.chapter16.xiti16_2;

public class xiti17_6 {

	public static long fun(long power, long mod, long b) {
		long eularM = xiti11_4.getEularFun(mod);
		long u = xiti6_3.fun(power, eularM)[0];
		return xiti16_2.funaKm(b, u, mod);

	}

	public static void main(String[] args) {
		System.out.println(fun(329, 1147, 452));
		System.out.println(fun(113, 463, 347));
		System.out.println(fun(275, 588, 139));
	}

}
