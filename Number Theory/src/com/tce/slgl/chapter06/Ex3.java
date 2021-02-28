package com.tce.slgl.chapter06;
//解ax+by=gcd(a,b)的有效算法

import com.tce.slgl.utils.CustomSolution;

/**
 *@classname         Ex3
 *@description       习题6.3：解ax+by=gcd(a,b)
 *@author            TerenceG
 *@lastmodifydate    2021/2/28
 */
public class Ex3 {

	public static void main(String[] args) {
		/**
		 * 	fun(12345, 67890);
		 *  fun(9876, 54321);
		 *  fun(105, 121);
		 *  fun(19789, 23548);
		 *  fun(31875, 8387);
		 *  fun(22241739, 19848039);
		 *  fun(6324, 0);
		 *  fun(37, 47);
		 */
		CustomSolution.fun1(329, 1080);
		/**
		 * (g,x,y) = (15,11,-2) (g,x,y) = (3,9048,-1645) (g,x,y) = (1,-53,46)
		 * (g,x,y) = (7,1303,-1095) (g,x,y) = (1,-381,1448) (g,x,y) = (237,-8980,10063)
		 */

	}
}
