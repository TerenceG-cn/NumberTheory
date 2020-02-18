package chapter15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import utils.PrimeFactors;

/**
 * 编写程序计算σ(n)，σ(n)是n的所有因数之和 1.将n分解为素数乘积 2.利用σ(n)两个性质
 * 
 * @author 10352
 *
 */
public class xiti15_7 {
	/**
	 * 素数幂次的σ值
	 * 
	 * @param p 素数
	 * @param k 幂次
	 * @return σ值
	 */
	public static long funσWithPrime(long p, int k) {
		return (long) ((Math.pow(p, k + 1) - 1) / (p - 1));
	}

	public static long funσ(long n) {
		if (n < 1)
			return 0;
		Map<Long, Integer> factors = PrimeFactors.calc3(n);
		long result = 1l;

		for (Entry<Long, Integer> f : factors.entrySet()) {
			result *= funσWithPrime(f.getKey(), f.getValue());
		}

		return result;
	}

	/**
	 * s(n) = σ(n)-n
	 * 
	 * @param n
	 * @return
	 */
	public static long funs(long n) {
		return funσ(n) - n;
	}

	public static void main(String[] args) {
//		int bz = 0, wq = 0, gs = 0;
//		for (int i = 2; i < 101; i++) {
//			int σN = funσ(i);
//			System.out.print("σ(" + i + ") = " + σN + "\t");
//			if (σN > 2 * i) {
//				System.out.println(" " + i + "是过剩数");
//				gs++;
//			} else if (σN < 2 * i) {
//				System.out.println(" " + i + "是不足数");
//				bz++;
//			} else {
//				System.out.println(" " + i + "是完全数");
//				wq++;
//			}
//		}
//		System.out.println("不足数：" + bz + "完全数：" + wq + "过剩数：" + gs);
		System.out.println(funs(18048976));
		System.out.println(funs(20100368));
		System.out.println(funs(18914992));
		System.out.println(funs(19252208));
		
		
		
	}
}
