package com.tce.slgl.chapter20;

import java.util.ArrayList;
import java.util.List;

public class Ä£PÆ½·½Ê£Óà {
	public static List<Long> getP2(long p) {
		List<Long> res = new ArrayList<Long>();
		for (long i = 0; i < p; i++) {
			res.add((long) (Math.pow(i, 2) % p));
		}
		return res;
	}

	public static void main(String[] args) {
//		List<Long> list=getP2(3011L);
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i)==81)
//				System.out.println(i);
//		}
		System.out.println((int)(Math.pow(256, 2)+14*256)%337);
	}
}
