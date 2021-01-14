package com.app6_Predicate;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/*
 *    1) Predicate
 *    		- 파라미터 있고 boolean 리턴값 있는 경우
 *    
 *    
 *    * 논리연산자 역할의 메서드
 *    		1) and()    && 연산자 대용
 *    		2) or()     || 연산자 대응
 *    		3) negate()  ! 연산자 대응 
 * 
 */

public class TestPredicate {

	public static void main(String[] args) {
		
		Predicate<String> s = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length()==5;
			}
		};
		boolean result = s.test("Hello");
		System.out.println(result);
		
		Predicate<String> s2 = t->t.length()==5;
		boolean result2 = s2.test("Hello");
		System.out.println(result2);
		
		BiPredicate<String, Integer> k = new BiPredicate<String, Integer>(){
			@Override
			public boolean test(String t, Integer u) {
				return t.length()==u;
			}
		};
		boolean k2 = k.test("hello", 5);
		System.out.println(k2);
		
		BiPredicate<String, Integer> k3 = (t, u)->t.length()==u;
		boolean k4 = k3.test("helloworld", 5);
		System.out.println(k4);
		
		IntPredicate x = new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value==4;
			}
		};
		boolean xx = x.test(4);
		System.out.println(xx);
		
		IntPredicate y = value->value==4;
		boolean yy = y.test(10);
		System.out.println(yy);
		
		
	}

}
