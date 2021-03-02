package com.tce.slgl.chapter17;

import com.tce.slgl.utils.EuclideanAlgorithm;
import com.tce.slgl.chapter11.Ex4;
import com.tce.slgl.chapter16.xiti16_2;
import com.tce.slgl.utils.CustomSolution;

public class xiti17_6 {
	/**
	 *
	 *
	 * @param power k
	 * @param mod   m
	 * @param b
	 * @return
	 */
	/**
	 * @author          TerenceG
	 * @lastmodifydate  2021/2/28
	 * @description:    对与 x的k次方 模m余k求解 满足gcd(k,Φ(m))=1，gcd(b,m)=1
	 * 					由线性方程ku-Φ(m)b=1=gcd(k,Φ(m))可以得到一组解u，v 由欧拉公式 b的Φ(m)次方 模m余1
	 * @Param:
	 * 		@param power    k
	 *	 	@param mod      m
	 *		@param b        b
	 * @Return:     long
	 */
	public static long fun(long power, long mod, long b) {
		if (EuclideanAlgorithm.gcd(b, mod) != 1) {
			System.out.println("gcd(b, mod) != 1");
			return 0;
		}
		long eularM = Ex4.getEularFun(mod);
		if (EuclideanAlgorithm.gcd(power, eularM) != 1) {
			System.out.println("gcd(k, Φ(m)) != 1");
			return 0;
		}
		long u;
		u=CustomSolution.fun1(power, eularM)[0];
		return xiti16_2.funaKm(b, u, mod);

	}

	public static void main(String[] args) {
//		System.out.println(fun(329, 1147, 452));
//		System.out.println(fun(113, 463, 347));
//		System.out.println(fun(275, 588, 139));
		System.out.println(fun(2, 337, 84));
	}

}
