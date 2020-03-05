package com.tce.slgl.chapter20;

import java.util.ArrayList;
import java.util.List;

/**
 * ģPƽ��ʣ��
 * 
 * @author 10352
 *
 */
public class ModPsqar {
	/**
	 * ���������Ķ���ʣ��
	 * 
	 * @param p
	 * @return
	 */
	public static List<Long> getP2(long p) {
		List<Long> res = new ArrayList<Long>();
		for (long i = 0; i < (p - 1) / 2 + 1; i++) {
			res.add((long) (Math.pow(i, 2) % p));
		}
		return res;
	}

	/**
	 * ��ģp����������1��a<p�Ķ���ʣ��a�ĺ� A
	 * 
	 * @param p
	 * @return
	 */
	public static long getA(long p) {
		long res = 0;
		List<Long> p2 = getP2(p);
		for (long i = 1; i < p; i++)
			if (p2.contains(i))
				res += i;
		return res;
	}

	/**
	 * ��ģp����������1��a<p�Ķ��η�ʣ��b�ĺ� B
	 * 
	 * @param p
	 * @return
	 */
	public static long getB(long p) {
		long res = 0;
		List<Long> p2 = getP2(p);
		for (long i = 1; i < p; i++)
			if (!p2.contains(i))
				res += i;
		return res;

		/*
		 * another way:A+B=p(p-1)/2
		 * 
		 * long A=getA(p); return p(p-1)/2-A;
		 */
	}

	/**
	 * �����õ·��ŵļ�ª����
	 * 
	 * @param q
	 * @param p
	 * @return
	 */
	public static int getLen(long q, long p) {
		return getP2(p).contains(q) ? 1 : -1;
	}

	public static void main(String[] args) {
//		List<Long> list=getP2(3011L);
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i)==81)
//				System.out.println(i);
//		}
//		System.out.println((int)(Math.pow(256, 2)+14*256)%337);

//		long[] pNums = { 5, 7, 11, 13, 17, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 91, 97 };
//		long[] AeqlB = {5,13,17,29,37,41,53,61,73,89,97};
//		long[] AneqB = {7,11,23,31,43,47,59,67,71,79,83,91};
//		for (int i = 0; i < pNums.length; i++) {
//			System.out.print("A(" + pNums[i] + ") = " + getA(pNums[i]));
//			System.out.println("\tB(" + pNums[i] + ") = " + getB(pNums[i]));
//			System.out.println(getB(pNums[i])%pNums[i]==0);
//		}

		
//		System.out.println(getLen(85, 101));
//		System.out.println(getLen(29, 541));
//		System.out.println(getLen(101, 1987));
//		System.out.println(getLen(68, 101));
		System.out.println(getLen(31706, 43789));//-1
		//System.out.println(getP2(43789));
		
		System.out.println();
	}
}
