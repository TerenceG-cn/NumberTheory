package utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 将任意自然数分解为质数的乘积
 * 
 * @author 10352
 *
 */
public class PrimeFactors {
	public static Map<Integer, Integer> calc1(int number) {
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
	public static Map<Long, Integer> calc2(long number) {
		Map<Long, Integer> factors = new HashMap<Long, Integer>();

		if (number >= 2) {
			for (long factor = 2; factor < number; factor++) {
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

	public static Map<Long, Integer> calc3(long num) {// xxxxxxxxxxxxxx
		Map<Long, Integer> factors = new HashMap();
		for (long i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (factors.containsKey(i)) {// factors.add(factor);
					factors.put(i, factors.get(i) + 1);
				} else {
					factors.put(i, 1);
				}
				num /= i;
				i--;
			}
		}
		if (factors.containsKey(num)) {// factors.add(factor);
			factors.put(num, factors.get(num) + 1);
		} else {
			factors.put(num, 1);
		}
		return factors;
	}

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis() / 1000;
		for (int i = 10; i <= 100000; i++) {
			System.out.println(i + ": " + PrimeFactors.calc2(i));
		}
		long endTime = System.currentTimeMillis() / 1000;
		System.out.println("总耗时：" + (endTime - startTime));

	}
}
