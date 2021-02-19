package com.tce.slgl.funactions;
//卡特兰数递推公式h(n)=h(n-1)*(4*n-2)/(n+1);
import java.math.*;
import java.util.*;
public class Catlelan {
	
  
  public static void main(String[] args) {
      Scanner cin = new Scanner(System.in);//需要第几个卡特兰数
      BigInteger dp[];//定义一个数组
      dp=new BigInteger[1000];//规定数组的大小
      dp[1]=BigInteger.valueOf(1);
      int i,m;
      for(i=2;i<1000;i++)//卡特兰数打表
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