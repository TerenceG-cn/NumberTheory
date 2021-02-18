package com.tce.slgl.chapter05;
//欧几里得算法
public class GCD_LCM{
	public static long gcd(long n1,long n2) {
		long a= Math.max(n1, n2);
		long b= Math.min(n1, n2);
		if(a==0||b==0) return 0;
		while(b!=0) {
			long c=a%b;
			a=b;
			b=c;
		}
		return a;
	}
	
	static long lcm(int a,int b) {
		return a*b/gcd(a, b);
	}
	public static void main(String[] args) {
//		System.out.println(gcd(12345,67890));
//		System.out.println(gcd(54321,9876));
//		System.out.println(lcm(312, 56));
//		System.out.println(gcd(301337, 307829));
//		for(int i=1;i<720;i++)
//			for(int j=i+1;j<=720;j++)
//				if(gcd(i, j)==18&&i*j==720*18)
//					System.out.println(""+i+", "+j);
		System.out.println(gcd(9048, 1645));
		System.out.println(gcd(1338, 1115));
		System.out.println(gcd(1438, 1115));
	}
}

//欧几里得算法至多在2log2(b)步结束，步数至多是b位数的7倍