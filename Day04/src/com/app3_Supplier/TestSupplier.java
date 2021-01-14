package com.app3_Supplier;

import java.util.Date;
import java.util.function.Supplier;

/*
 *     1) Supplier
 *     		- 파라미터 없고 리턴값이 있다.
 *     
 *     2) 종류
 *     		...
 *     		
 *     
 * 
 */

public class TestSupplier {

	public static void main(String[] args) {
		
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {
				return "Hello";
			}
		};
		String result = s.get();
		System.out.println("1. Supplier 익명클래스: "+result);

		
		Supplier<Date> s2 = new Supplier<Date>() {
			@Override
			public Date get() {
				return new Date();
			}
		};
		Date d = s2.get();
		System.out.println("2. Supplier 익명클래스 현재날짜: "+d);
		
		Supplier<String> s3 = ()->"Hello";
		String result3 = s3.get();
		System.out.println("3. Supplier 람다: "+result3);
		
		Supplier<Date> s4 = ()->new Date();
		Date d2 = s4.get();
		System.out.println("4. Supplier 람다 현재날짜: "+d2);

	}

}
