package com.tce.slgl.chapter21;

import java.util.ArrayList;
import java.util.List;

public class xiti21_3and6 {
	/*以3为二次剩余的素数*/
	private final static int[] qr3= {11,13,23,37,47,59,61,71,73,83,97,107,109};
	/*以3为二次非剩余的素数*/
	private final static int[] nr3= {5,7,17,19,29,31,41,43,53,67,79,89,101,103,113,127};
	
	/**
	 * 20.2
	 * 模p的所有满足1≤a<p的二次剩余a的和 A
	 * 模p的所有满足1≤a<p的二次非剩余b的和 B
	 */
	static int[] AeqlB = {5,13,17,29,37,41,53,61,73,89,97};//满足二次剩余的和等于二次非剩余的和、小于100的素数满足二次剩余的和等于二次非剩余的和
	static int[] AneqB = {7,11,23,31,43,47,59,67,71,79,83,91};//3?
	
	public static List<Integer> tryMod(int n,int[] array) {
		List<Integer> res=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			res.add(array[i]%n);
		}
		return res;
	}
	public static void main(String[] args) {
//		System.out.println(tryMod(24, qr3));//11,1
//		System.out.println(tryMod(24, nr3));//5,7
		/**
		 * 21.3
		 * 结论是猜想，
		 * 对于满足模12余11或1的奇素数p，3是模p的二次剩余；
		 * 对于满足模12余7或5的奇素数p，3是模p的二次非剩余；
		 * 未证明
		 */
		
		System.out.println(tryMod(4, AeqlB));
		System.out.println(tryMod(4, AneqB));
		/**
		 * 21.6
		 * 结论是
		 * 对于满足模4余1的奇素数p,二次剩余的和等于二次非剩余的和
		 * 对于满足模4余3的奇素数p,二次剩余的和不等于二次非剩余的和
		 */
	}

}
