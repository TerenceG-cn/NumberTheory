package com.tce.slgl.chapter08;

import com.tce.slgl.utils.EuclideanAlgorithm;
import com.tce.slgl.utils.CustomSolution;

import java.util.Objects;

import static com.tce.slgl.utils.Congruence.congruence;

/**
 * @author TerenceG
 * @classname Ex7
 * @description 习题8.7：解同余式方程
 * @lastmodifydate 2021/3/2
 */
public class Ex7 {
	public static void main(String[] args) {
		congruence(8, 6, 14);
		congruence(66, 100, 121);
		congruence(21, 14, 91);
		congruence(72, 47, 200);
		congruence(4183, 5781, 15087);
		congruence(1537, 2863, 6731);
		congruence(1, 81, 73);
		congruence(60, 6, 7);
	}
}
