package chapter8;

import chapter5.GCD_LCM;
import chapter6.xiti6_3;

//解同余式方程
public class xiti8_7 {
	public static void congruence(long a, long c, int m) {
		long g = GCD_LCM.gcd(a, m);
		long u0 = xiti6_3.fun(a, 0 - m);

		if (c % g != 0) {
			System.out.println("" + a + "x" + " ≡ " + c + "(mod " + m + ")无解");
			System.out.println("---------------------------------");
			return;
		}
		long x0 = c * u0 / g;
		// System.out.println("u0:"+u0+" g:"+g+" x0:"+x0);//test
		System.out.println("" + a + "x" + " ≡ " + c + "(mod " + m + ")的解共有" + g + "个");
		for (int k = 0; k < g; k++) {
			long xk = x0 + k * m / g;
			while(xk>m) {
				xk-=m;
			}
			System.out.println("" + xk + "(mod " + m + ")");
		}
		System.out.println("---------------------------------");
	}

	public static void main(String[] args) {
		congruence(8, 6, 14);
		congruence(66, 100, 121);
		congruence(21, 14, 91);
		congruence(72, 47, 200);
		congruence(4183, 5781, 15087);
		congruence(1537, 2863, 6731);
		congruence(1, 81, 73);
	}
}
