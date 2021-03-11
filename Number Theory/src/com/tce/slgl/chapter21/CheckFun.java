package com.tce.slgl.chapter21;

public class CheckFun {

	public static void main(String[] args) {
		int size=1000;
		for(int i=0;i<size;i++) {
			long p=2*i+1;
			long f=-(11-p)*(p-1)*p;
			System.out.println(p+" "+f+" "+f%24);
		}

	}

}
