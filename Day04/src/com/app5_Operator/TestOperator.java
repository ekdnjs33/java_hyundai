package com.app5_Operator;

import java.util.function.BinaryOperator;

/*
 *     1) Operator
 *     		- 파라미터 있고 리턴값 있는 경우
 *     		- 전달하는 파라미터를 연산(*)해서 임의의 값으로 리턴하는 용도
 *     	  ==> 내부적으로 Function 상속 받음   
 *     
 *     2) 종류
 *     BinaryOperator<T> : BiFunction<T, U, R> 상속
 *     					 : 두개의 파라미터 전달하고 반환 (모두 데이터타입 동일)
 *     
 *     UnaryOperator<T> : Function<T, R> 상속
 *     					: 하나의 파라미터 전달하고 반환 (모두 데이터타입 동일)  

 */

public class TestOperator {

	public static void main(String[] args) {
		
		BinaryOperator<String> pp = new BinaryOperator<String>() {

			@Override
			public String apply(String t, String u) {
				return t.charAt(0)+" "+u.charAt(0);
			}
		};
		String str = pp.apply("Hello", "World");
		System.out.println(str);
		
		BinaryOperator<String> pp2 = (t, u)->t.charAt(0)+" "+u.charAt(0);
		String str2 = pp2.apply("Da", "Won");
		System.out.println(str2);
		
		
	}

}
