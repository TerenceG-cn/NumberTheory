package com.tce.slgl.chapter06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *@classname         Ex6b
 *@description       习题6.6.b
 *@author            TerenceG
 *@lastmodifydate    2021/2/28
 */
public class Ex6b {
	public static void main(String[] args) {
		int count=0;
		Set<Integer> nums=new HashSet<>();
		int x,y,size=100;
		for(x=0;x<size;x++) {
			for (y = 0; y < size; y++) {
				nums.add(3 * x + 5 * y);
			}
		}
		List<Integer> list = new ArrayList<>(nums);
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
