package com.tce.slgl.chapter21;

import java.util.ArrayList;
import java.util.List;

public class xiti21_3and6 {
	/*��3Ϊ����ʣ�������*/
	private final static int[] qr3= {11,13,23,37,47,59,61,71,73,83,97,107,109};
	/*��3Ϊ���η�ʣ�������*/
	private final static int[] nr3= {5,7,17,19,29,31,41,43,53,67,79,89,101,103,113,127};
	
	/**
	 * 20.2
	 * ģp����������1��a<p�Ķ���ʣ��a�ĺ� A
	 * ģp����������1��a<p�Ķ��η�ʣ��b�ĺ� B
	 */
	static int[] AeqlB = {5,13,17,29,37,41,53,61,73,89,97};//�������ʣ��ĺ͵��ڶ��η�ʣ��ĺ͡�С��100�������������ʣ��ĺ͵��ڶ��η�ʣ��ĺ�
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
		 * �����ǲ��룬
		 * ��������ģ12��11��1��������p��3��ģp�Ķ���ʣ�ࣻ
		 * ��������ģ12��7��5��������p��3��ģp�Ķ��η�ʣ�ࣻ
		 * δ֤��
		 */
		
		System.out.println(tryMod(4, AeqlB));
		System.out.println(tryMod(4, AneqB));
		/**
		 * 21.6
		 * ������
		 * ��������ģ4��1��������p,����ʣ��ĺ͵��ڶ��η�ʣ��ĺ�
		 * ��������ģ4��3��������p,����ʣ��ĺͲ����ڶ��η�ʣ��ĺ�
		 */
	}

}
