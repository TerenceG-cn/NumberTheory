package com.tce.slgl.utils;
//�����������ƹ�ʽh(n)=h(n-1)*(4*n-2)/(n+1);
import java.math.*;
import java.util.*;
public class Catlelan {
	
  
  public static void main(String[] args) {
      Scanner cin = new Scanner(System.in);//��Ҫ�ڼ�����������
      BigInteger dp[];//����һ������
      dp=new BigInteger[1000];//�涨����Ĵ�С
      dp[1]=BigInteger.valueOf(1);
      int i,m;
      for(i=2;i<1000;i++)//�����������
      {
          dp[i]=dp[i-1].multiply(BigInteger.valueOf(4*i-2)).divide(BigInteger.valueOf(i+1));  
      }
      while(cin.hasNext())
      {
          m=cin.nextInt();
          System.out.println(dp[m]);
      }
      cin.close();
  }
}