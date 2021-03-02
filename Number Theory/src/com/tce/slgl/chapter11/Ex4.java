package com.tce.slgl.chapter11;

import java.util.Map;
import java.util.Map.Entry;

import com.tce.slgl.utils.PrimeFactors;

/**
 *@classname         Ex4
 *@description       习题11.4
 *@author            TerenceG
 *@lastmodifydate    2021/3/2
 */
public class Ex4 {

	public static long getEularFun(long n) {
		Map<Long, Integer> primeFactors=PrimeFactors.calc3(n);
		long res=1;
		for (Entry<Long, Integer> p : primeFactors.entrySet()) {
			res*=Math.pow(p.getKey(), p.getValue()-1)*(p.getKey()-1L);
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(getEularFun(1147));

	}

}
