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
	    for(i=2;i<lim;i++) //�±꣺i����>=2����Ҫ�ж��Ƿ�Ϊ����������
	    {
	        for(j=2;j<i;j++) //�±꣺j����=2С��i������
	            if(i%j==0) //����ܱ������������˳�
	                break;
	            if(j==i) //����±�j=i����ô���������������±�Ϊk��aa����
	                aa[k++]=i;
	    }
	    return k;
	}

	public static void main(String[] args) {
		int aa[]=new int[100],i;
	    findp(100,aa);
	    
	    for(i=0;i<8;i++) {//22!����Χ
	    	xiti8_7.congruence(1, factorial(aa[i]-1), aa[i]);
	    }
	}

}
