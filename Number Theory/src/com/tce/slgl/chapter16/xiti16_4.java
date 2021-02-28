package com.tce.slgl.chapter16;

import java.util.Random;

import com.tce.slgl.utils.PrimeFactors;

public class xiti16_4 {
	/**
	 * 大素数检测
	 * 思路：
	 * 选取2到n-1之间的随机10个数ai
	 * 判断 ai的n-1次方模n 等于 1？（由费马小定理得 n是质数一定是素数，反之不成立，有反例卡米歇尔数）
	 * 再利用素因数分解进一步判断
	 * @param num
	 * @return
	 */
	public static boolean largePrimeDetection(long num) {
		Random random=new Random();
		long[] randomArray=new long[100];
		for(int i=0;i<randomArray.length;i++) {
			randomArray[i]=Math.abs(random.nextLong())%(num-1)+1L;//选取2与n-1之间的10个随机数
		}
		for(int j=0;j<randomArray.length;j++) {
			if(xiti16_2.funaKm(randomArray[j], num-1, num)!=1) {
				//System.out.println(num+"是合数！");
				return false;
			}
		}
		//System.out.println(num+"可能是素数。");
		if(PrimeFactors.calc3(num).containsKey(num)) {
			System.out.println(num+"是素数！");
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		for(long i=200_000_138L;i<600_000_000L;i++) {
			largePrimeDetection(i);
		}
	}
}
