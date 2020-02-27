package com.tce.slgl.chapter11;

import java.util.Map;
import java.util.Map.Entry;

import com.tce.slgl.funactions.PrimeFactors;

public class xiti11_4 {

	public static long getEularFun(long n) {
		Map<Long, Integer> primeFactors=PrimeFactors.calc3(n);
		long res=1;
		for (Entry<Long, Integer> p : primeFactors.entrySet()) {
			res*=Math.pow(p.getKey(), p.getValue()-1)*(p.getKey()-1l);
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(getEularFun(1147));

	}

}
