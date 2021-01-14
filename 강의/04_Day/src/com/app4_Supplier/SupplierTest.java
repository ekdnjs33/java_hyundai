package com.app4_Supplier;

import java.util.Date;
import java.util.function.Supplier;

/*
 *   2. Supplier
 *    - 파라미터 없고 리턴값이 있다.
 * 
 *    -  종류
 *        BooleanSupplier :  boolean 타입으로 반환
 *        DoubleSupplier  :  double 타입으로 반환
 *        IntSupplier  :  int 타입으로 반환
 *        LongSupplier  :  long 타입으로 반환
 */
public class SupplierTest {
	public static void main(String[] args) {
		Supplier<String> s  = new Supplier<String>() {
			@Override
			public String get() {
				return "Hello";
			}
		};
		String result = s.get();
		System.out.println("1. Supplier 익명클래스:" + result);
		
		Supplier<String> ss  = ()->"Hello";
		String result2 = ss.get();
		System.out.println("1. Supplier 람다표현식:" + result2);
		////////////////////////////////////////////////////////
		Supplier<Date> s2 = new Supplier<Date>() {
			@Override
			public Date get() {
				return new Date();
			}
		};
		Date d = s2.get();
		System.out.println("2. Supplier 익명클래스 현재날짜:" + d);
		
		Supplier<Date> ss2 = ()->new Date();
		Date d2 = ss2.get();
		System.out.println("2. Supplier 익명클래스 현재날짜:" + d2);
	}//end main
}//end class
