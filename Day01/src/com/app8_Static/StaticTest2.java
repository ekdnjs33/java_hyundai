package com.app8_Static;

import java.util.Arrays;

public class StaticTest2 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt("10"); // 자주 사용 기억!
		System.out.println(num + 20); // 30
		System.out.println("10" + 20); // 1020
		
		/* 문자열이 아닌 데이터를 문자열로 만들 때 */
		String str = String.valueOf(10);
		System.out.println(str + 20); // 1020
		String str1 = String.valueOf(true);
		System.out.println(str1);
		String str2 = String.valueOf(3.14);
		System.out.println(str2);
		
		// Arrays.sort();
		// Arrays.toString();
	}

}
