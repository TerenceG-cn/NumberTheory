package com.tce.slgl.chapter01;

import java.util.LinkedList;
import java.util.List;

public class TriangularNumbers {
	// 找出小于n的三角数，n(n+1)/2
	public static List<Integer> findTriangularNumbers(int n) {
		List<Integer> result = new LinkedList<Integer>();
		int i, tri = 0;
		for (i = 1; tri < n; i++) {
			tri = i * (i + 1) / 2;
			result.add(tri);

		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> a = findTriangularNumbers(10000);
		int count = 0;
		for (int i : a) {
			// if(Math.sqrt(i)*10%10==0) { //判断是否是一个平方数
			System.out.print(i + "\t");
			if (count++ > 10) {
				System.out.println();
				count = 0;
			}
			// }
		}
		System.out.println();
	}
}
