package com.tce.slgl.chapter20;

import java.util.ArrayList;
import java.util.List;

public class xiti20_3 {
	/*��3Ϊ����ʣ�������*/
	private final static int[] qr3= {11,13,23,37,47,59,61,71,73,83,97,107,109};
	/*��3Ϊ���η�ʣ�������*/
	private final static int[] nr3= {5,7,17,19,29,31,41,43,53,67,79,89,101,103,113,127};
	
	public static List<Integer> tryMod(int n,int[] array) {
		List<Integer> res=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			res.add(array[i]%n);
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(tryMod(24, qr3));//11,1
		System.out.println(tryMod(24, nr3));//5,7
	}
	/**
	 * ������
	 * ��������ģ12��11��1��������p��3��ģp�Ķ���ʣ�ࣻ
	 * ��������ģ12��7��5��������p��3��ģp�Ķ��η�ʣ�ࣻ
	 */
}
