package com.app6_Predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class TestPredicate2 {

	public static void main(String[] args) {

		// 문제: 지정된 변수값이 2의 배수이고 3의 배수이냐?
		
		int num = 6;
		IntPredicate x = n->n%2==0;
		IntPredicate x2 = n->n%3==0;
		IntPredicate x3 = x.and(x2);
		
		boolean result = x3.test(num); // 6이 2의 배수이면서 3의 배수인가  
		System.out.println(result);
		
		System.out.println(x.and(x2).test(10));
		
		String str = "Hello";
		Predicate<String> y = n->n.length()==5;
		Predicate<String> y2 = n->n.charAt(0)=='A';
		Predicate<String> yk = n->n.charAt(0)=='B';
		Predicate<String> y3 = y.or(y2);
//		Predicate<String> y3 = y || y2; // true || false 이어야 하는데, y, y2는 그냥 참조
		
		boolean result2 = y3.test(str); // 6이 2의 배수이거나 3의 배수인가  
		System.out.println(result2);
		
		System.out.println(y.or(y2).test("App"));
		
		Predicate<String> z = n->n.length()==5; //true
		Predicate<String> z2 = z.negate(); //false
		
		boolean result3 = z2.test("hello");
		System.out.println(result3);
	}

}
