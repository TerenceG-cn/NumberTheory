package com.tce.slgl.funactions;

/**
 * 小于n的所有素数
 * 
 * n=100 : 25 n=1000: 168 n=10000 : 1229 n=100000: 9592 n=1000000: 78498
 * n=10000000: 664579
 * 
 * @author 10352
 *
 */
public class FindPrimes {
	private static final int MAX_LENGTH_CHECK = 100000000; // 亿
	private static final int MAX_LENGTH_PRIMELIST = 10000000; // 千万

	private static boolean[] check = new boolean[MAX_LENGTH_CHECK]; // 存储标记
	private static int[] primeList = new int[MAX_LENGTH_PRIMELIST]; // 存储素数

	/**
	 * 埃拉托斯特尼筛法（简称埃氏筛或爱氏筛）：要得到自然数n以内的全部素数，必须把不大于 根号n 的所有素数的倍数剔除，剩下的就是素数。
	 * 例如：给出要筛数值的范围n，找出以内的素数。
	 * 解法：先用2去筛，即把2留下，把2的倍数剔除掉；再用下一个质数，也就是3筛，把3留下，把3的倍数剔除掉；接下去用下一个质数5筛，把5留下，把5的倍数剔除掉；不断重复下去......。
	 * 
	 * 时间复杂度：O(nloglogn) 不足之处：6 在 indexI = 2 时被标记，而在 indexI = 3
	 * 时，又被标记了一次。存在重复标记，有优化空间
	 */
	public static void Eratosthenes(int num) {
		int count = 0;
		for (int indexI = 2; indexI <= num; indexI++) {
			// 当 indexI 不是被剔除的数时，将 indexI 留下
			if (!check[indexI]) {
				primeList[count++] = indexI;
			}
			// 剔除 indexI 的倍数
			for (int indexJ = indexI + indexI; indexJ <= num; indexJ += indexI) {// 改进 int indexJ = indexI *
																					// indexI，但此时最大算到int indexJ = indexI
																					// * indexI
				check[indexJ] = true;
			}
		}
	}

	/**
	 * 欧拉筛法：保证每个合数只会被它的最小质因数筛掉，时间复杂度降低到O(n)。 每一个数都去乘以当前素数表里面已有的数，当 indexI 是合数，且
	 * indexI % primeList[indexJ] == 0 时，只能乘以第一个素数 2
	 */
	public static void Euler(int num) {
		int count = 0;
		for (int indexI = 2; indexI <= num; indexI++) {
			if (!check[indexI]) {
				primeList[count++] = indexI;
			}
			// 每一个数都去乘以当前素数表里面已有的数，如果 indexI 是合数，且 indexI % primeList[indexJ] ==
			// 0，那么它只能乘以第一个素数 2
			// 如：2×2、3×(2、3)、4×(2)、5×(2、3、5)、6×(2)、7×(2、3、5、7)、8×(2)、9×(2、3)、10×(2)
			for (int indexJ = 0; indexJ < count; indexJ++) {
				// 过大的时候跳出
				if (indexI * primeList[indexJ] > num) {
					break;
				}

				check[indexI * primeList[indexJ]] = true;

				// 如果 indexI 是一个合数，而且 indexI % primeList[indexJ] == 0
				// 保证了每个合数只会被它的最小素因子筛掉
				if (indexI % primeList[indexJ] == 0) {
					break;
				}
			}
		}
	}

	public static void Euler2(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (!check[i]) {
				primeList[count++] = i;
			}
			for (int j = 0; j < count && i * primeList[j] <= num; j++) {
				check[i * primeList[j]] = true;
				if (i % primeList[j] == 0)//偶合数只能*2
					break;
			}
		}
	}

	public static int[] getPL() {
		return primeList;
	}

	public static void main(String[] args) {

		// Eratosthenes(10);
		Euler2(10_000_000);

		for (int i = 0; FindPrimes.getPL()[i] != 0; i++) {
			System.out.println("第" + (i + 1) + "个素数：" + FindPrimes.getPL()[i]);
		}

	}

}
