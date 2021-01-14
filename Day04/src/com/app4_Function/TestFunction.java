package com.app4_Function;

import java.util.function.Function;

/*
 *     1) Function
 *     		- 파라미터 있고 리턴값 있는 경우
 *     		- 특정 데이터타입으로 파라미터 전달해서 임의의 데이터타입으로 반환하도록 맵핑(*)하는 용도로 사용.
 *     		  (예, int --> String) 
 * 
 */

public class TestFunction {

	public static void main(String[] args) {
		
		// String을 받아서 int로 표현  
		Function<String, Integer> f = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		int n = f.apply("Hello");
		System.out.println("1. Function 익명클래스: "+n);
		
		Function<String, Boolean> f2 = new Function<String, Boolean>() {
			
			@Override
			public Boolean apply(String t) {
				return t.length()==5;
			}
		};
		boolean n2 = f2.apply("hello");
		System.out.println("2. Function 익명클래스: "+n2);


		Function<String, Integer> f3 = t->t.length();
		int n3 = f3.apply("dawonkim");
		System.out.println("3. Function 람다: "+n3);
		
		Function<String, Boolean> f4 = t->t.length()==5;
		boolean n4 = f4.apply("dawonkim");
		System.out.println("3. Function 람다: "+n4);

	}

}
