package com.tce.slgl.chapter09;


import  com.tce.slgl.chapter08.xiti8_7;

public class xiti9_2 {

	static long factorial(int x) {
		if(x==0) return 1;
		return x*factorial(x-1);
	}
	static int findp(int lim,int[] aa)
	{
	    int i,j=0,k=0;
	    for(i=2;i<lim;i++) //下标：i代表>=2的需要判断是否为素数的整数
	    {
	        for(j=2;j<i;j++) //下标：j代表》=2小于i的整数
	            if(i%j==0) //如果能被整出，立即退出
	                break;
	            if(j==i) //如果下标j=i，那么是素数，并加入下标为k的aa数组
	                aa[k++]=i;
	    }
	    return k;
	}

	public static void main(String[] args) {
		int aa[]=new int[100],i;
	    findp(100,aa);
	    
	    for(i=0;i<8;i++) {//22!超范围
	    	xiti8_7.congruence(1, factorial(aa[i]-1), aa[i]);
	    }
	}

}
