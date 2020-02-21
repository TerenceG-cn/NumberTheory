package com.tce.slgl.chapter06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class xiti6_6_b {
	public static void main(String[] args) {
		int count=0,i=0;
		Set<Integer> nums=new HashSet<Integer>();
		int x,y;
		for(x=0;x<100;x++)
			for(y=0;y<100;y++) {
//				if(count>9) {
//					count=0;
//					System.out.println();
//				}
				//System.out.print("\t"+(3*x+5*y));
				
//				count++;
				nums.add(3*x+5*y);
			}
		List<Integer> list = new ArrayList<Integer>(nums);
		Collections.sort(list);
		for(int j=0;j<nums.size();j++) {
			if(count>14) {
				count=0;
				System.out.println();
			}
			System.out.print("\t"+list.get(j));
			count++;
		}
	}
}
