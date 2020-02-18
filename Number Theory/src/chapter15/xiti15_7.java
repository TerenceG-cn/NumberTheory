package chapter15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import utils.PrimeFactors;

/**
 * ��д��������(n)����(n)��n����������֮�� 1.��n�ֽ�Ϊ�����˻� 2.���æ�(n)��������
 * 
 * @author 10352
 *
 */
public class xiti15_7 {
	/**
	 * �����ݴεĦ�ֵ
	 * 
	 * @param p ����
	 * @param k �ݴ�
	 * @return ��ֵ
	 */
	public static long fun��WithPrime(long p, int k) {
		return (long) ((Math.pow(p, k + 1) - 1) / (p - 1));
	}

	public static long fun��(long n) {
		if (n < 1)
			return 0;
		Map<Long, Integer> factors = PrimeFactors.calc3(n);
		long result = 1l;

		for (Entry<Long, Integer> f : factors.entrySet()) {
			result *= fun��WithPrime(f.getKey(), f.getValue());
		}

		return result;
	}

	/**
	 * s(n) = ��(n)-n
	 * 
	 * @param n
	 * @return
	 */
	public static long funs(long n) {
		return fun��(n) - n;
	}

	public static void main(String[] args) {
//		int bz = 0, wq = 0, gs = 0;
//		for (int i = 2; i < 101; i++) {
//			int ��N = fun��(i);
//			System.out.print("��(" + i + ") = " + ��N + "\t");
//			if (��N > 2 * i) {
//				System.out.println(" " + i + "�ǹ�ʣ��");
//				gs++;
//			} else if (��N < 2 * i) {
//				System.out.println(" " + i + "�ǲ�����");
//				bz++;
//			} else {
//				System.out.println(" " + i + "����ȫ��");
//				wq++;
//			}
//		}
//		System.out.println("��������" + bz + "��ȫ����" + wq + "��ʣ����" + gs);
		System.out.println(funs(18048976));
		System.out.println(funs(20100368));
		System.out.println(funs(18914992));
		System.out.println(funs(19252208));
		
		
		
	}
}
