package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 将任意自然数分解为质数的乘积
 * 
 * @author 10352
 *
 */
public class PrimeFactors {
	public static Map<Integer, Integer> calc(int number) {
		Map<Integer, Integer> factors = new HashMap();

		if (number >= 2) {
			for (int factor = 2; factor < number; factor++) {
				while (number % factor == 0 && number > factor) {

					if (factors.containsKey(factor)) {// factors.add(factor);
						factors.put(factor, factors.get(factor) + 1);
					} else {
						factors.put(factor, 1);
					}

					number = number / factor;
				}
			}
			if (factors.containsKey(number)) {// factors.add(factor);
				factors.put(number, factors.get(number) + 1);
			} else {
				factors.put(number, 1);
			}
		}

		return factors;
	}

	/* 内层循环 */
	public static List<Integer> calc2(int number) {
		List<Integer> factors = new ArrayList<>();

		if (number >= 2) {
			for (int factor = 2; factor < number; factor++) {
				while (number % factor == 0 && number > factor) {
					factors.add(factor);
					number = number / factor;
				}
			}
			factors.add(number);
		}

		return factors;
	}

	public static void main(String[] args) {

		for (int i = 99990; i <= 100000000; i++) {
			System.out.println(i + ": " + PrimeFactors.calc(i));
		}
		/*
		 * Scanner in = new Scanner(System.in); System.out.println("输入一个数："); long
		 * number = in.nextLong(); System.out.print(number + "="); int i = 1; while (i <
		 * number) { if (number % i == 0 && i == 1) { System.out.print(i + "x"); number
		 * /= i;
		 * 
		 * } else if (number % i == 0 && i != 1) { System.out.print(i + "x"); number /=
		 * i; continue; } i++; } System.out.print(i);
		 */
	}
}
