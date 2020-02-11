package chapter15;

import static chapter15.xiti15_7.funs;

public class xiti15_10 {
	public static boolean funK(int n, int k) {
		int a = n;
		for (int i = 0; i < k; i++) {
			a = funs(a);
		}
		if (a == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
//		for(int i=2;i<16000;i++) {
//			if(funK(i,5)&&i!=funs(i))
//				System.out.println(i);
//		}
		
		for (int i = 18000000; i < 20101000; i++) {
			if (funK(i, 4) && i != funs(i) && i != funs(funs(i)))//Ð§ÂÊÌ«µÍÁË
				System.out.println(i);
		}

		System.out.println(funK(18048976, 4));
		System.out.println(funK(20100368, 4));
		System.out.println(funK(18914992, 4));
		System.out.println(funK(19252208, 4));
		
		System.out.println(funK(18656380, 4));
		System.out.println(funK(20522060, 4));
		System.out.println(funK(28630036, 4));
		System.out.println(funK(24289964, 4));

	}
}
