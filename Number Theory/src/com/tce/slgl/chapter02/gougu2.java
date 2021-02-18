package com.tce.slgl.chapter02;
//b值为2700的勾股数组
public class gougu2 {
	public static void main(String[] args) {
		for(int i=1;i<10000;i++)
			for(int j=i+1;j<10000;j++)
				if(Math.pow(j, 2)-Math.pow(i, 2)==Math.pow(2700,2))
					System.out.println("("+i+","+"2700"+","+j+")");
	}
}
