package com.tce.slgl.chapter02;
//找到一组有相同c值的本原勾股数组
public class gougu1 {

	public static void main(String[] args) {
		int i, j, k, l;
		double a1, b1, a2, b2;
		for (i = 1; i < 1000; i++)
			for (j = i + 1; j < 1000; j++)
				for (k = i + 1; k < 1000; k++)
					for (l = k + 1; l < 1000; l++) {
						a1 = Math.pow(2 * i + 1, 2);
						b1 = Math.pow(2 * j + 1, 2);
						a2 = Math.pow(2 * k + 1, 2);
						b2 = Math.pow(2 * l + 1, 2);

						if (a1 + b1 == a2 + b2)
							System.out.println("(" + (2 * i + 1) + "," + (2 * j + 1) + ")    (" + (2 * k + 1) + ","
									+ (2 * l + 1) + ")");
					}

	}

}
