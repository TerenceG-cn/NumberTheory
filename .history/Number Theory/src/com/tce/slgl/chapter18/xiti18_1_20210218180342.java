package com.tce.slgl.chapter18;

import java.util.ArrayList;
import java.util.List;

public class xiti18_1 {
	/*简单公钥加密*/
	public static long[] simplePki_encryption(long m, long k, long[] encryContent) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < encryContent.length; i++)
			sb.append(encryContent[i]);
		System.out.println(convert(sb.toString()));
		//to do
		return new long[10];
	}

	private static List<String> convert(String str) {
		StringBuilder builder = new StringBuilder(str);
		str = builder.toString();
		List<String> res = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			if (i % 3 == 0) {
				// 防越界&保留最高位
				if (i + 3 > str.length()) {
					res.add(str.substring(i));// res.add(Long.parseLong(str.substring(i)));
					break;
				}
				res.add(str.substring(i, i + 3));// res.add(Long.parseLong(str.substring(i, i + 3)));
			}
		}
		return res;
	}

	public static void main(String[] args) {
		long[] content = { 5192, 2604, 422 };
		long[] miwen=simplePki_encryption(7081, 1789, content);
		for(int i=0;i<miwen.length;i++)
			System.out.print(miwen[i]);
	}
}
