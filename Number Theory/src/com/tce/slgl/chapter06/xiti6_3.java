package com.tce.slgl.chapter06;

//解ax+by=gcd(a,b)的有效算法 
public class xiti6_3 {
	public static long[] fun(long a, long b) {
		long x = 1, g = a, v = 0, w = b, y, s, t, q;
		long[] res = new long[2];
		while (true) {
			if (b == 0) {
				System.out.println("b=0?!");
				return null;
			}
			if (w == 0) {
				y = (g - a * x) / b;
				while (x < 0) {
					x += b;
					y -= a;
				}
				res[0] = x;
				res[1] = y;
				System.out.println("(g,x,y) = (" + g + "," + x + "," + y + ")");
				break;
			} else {
				t = g % w;
				q = (g - t) / w;
				s = x - q * v;
				x = v;
				g = w;
				v = s;
				w = t;
			}
		}
		return res;
	}

	public static void main(String[] args) {
//		fun(12345, 67890);
//		fun(9876, 54321);
//		fun(105, 121);
//		fun(19789, 23548);
//		fun(31875, 8387);
//		fun(22241739, 19848039);
//		fun(6324, 0);
//		fun(37, 47);
		fun(329, 1080);
	}
}
/*
 * (g,x,y) = (15,11,-2) (g,x,y) = (3,9048,-1645) (g,x,y) = (1,-53,46) (g,x,y) =
 * (7,1303,-1095) (g,x,y) = (1,-381,1448) (g,x,y) = (237,-8980,10063)
 */
