package com.tce.slgl.chapter05;

public class ThreeNplusOne {
	public static void main(String[] args) {
		int n,count,i;
		for (i = 1; i < 900; i++) {
			n = i;
			count = 1;
			System.out.print(n);
			while (n != 1) {
				if (n % 2 == 0) {
					n /= 2;
				} else {
					n = 3 * n + 1;
				}
				//System.out.print(" "+n);
				count++;
			}
			System.out.println("\tËã·¨³¤¶È£º" + count);
		}
	}
}
