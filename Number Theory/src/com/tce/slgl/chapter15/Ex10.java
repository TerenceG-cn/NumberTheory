package com.tce.slgl.chapter15;


import static com.tce.slgl.utils.EulerFunction.funs;
/**
 * @author TerenceG
 * @classname Ex10
 * @description 习题15.10
 * @lastmodifydate 2021/3/8
 */
public class Ex10 {
	public static boolean funK(long n, int k) {
		long a = n;
		for (int i = 0; i < k; i++) {
			a = funs(a);
		}
		if (a == n)
		{return true;}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		for(int i=2;i<16000;i++) {
			if(funK(i,5)&&i!=funs(i))
				System.out.println(i);
		}
		/*
		 * System.out.println(funK(18048976, 4)); System.out.println(funK(20100368, 4));
		 * System.out.println(funK(18914992, 4)); System.out.println(funK(19252208, 4));
		 *
		 * System.out.println(funK(18656380, 4)); System.out.println(funK(20522060, 4));
		 * System.out.println(funK(28630036, 4)); System.out.println(funK(24289964, 4));
		 */
		//30853845 ?未确认
		System.out.println(funs(29902635));
		//29971755
		System.out.println(funs(30853845));
		//28158165
		System.out.println(funs(29971755));
		//29902635
		System.out.println(funs(28158165));
		
	}
}
