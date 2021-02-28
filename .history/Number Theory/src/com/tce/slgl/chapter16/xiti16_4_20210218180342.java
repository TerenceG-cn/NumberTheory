package com.tce.slgl.chapter16;

import java.util.Random;

import com.tce.slgl.utils.PrimeFactors;

public class xiti16_4 {
	/**
	 * ���������
	 * ˼·��
	 * ѡȡ2��n-1֮������10����ai
	 * �ж� ai��n-1�η�ģn ���� 1�����ɷ���С����� n������һ������������֮���������з�������Ъ������
	 * �������������ֽ��һ���ж�
	 * @param num
	 * @return
	 */
	public static boolean largePrimeDetection(long num) {
		Random random=new Random();
		long[] randomArray=new long[100];
		for(int i=0;i<randomArray.length;i++) {
			randomArray[i]=Math.abs(random.nextLong())%(num-1)+1L;//ѡȡ2��n-1֮���10�������
		}
		for(int j=0;j<randomArray.length;j++) {
			if(xiti16_2.funaKm(randomArray[j], num-1, num)!=1) {
				//System.out.println(num+"�Ǻ�����");
				return false;
			}
		}
		//System.out.println(num+"������������");
		if(PrimeFactors.calc3(num).containsKey(num)) {
			System.out.println(num+"��������");
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
