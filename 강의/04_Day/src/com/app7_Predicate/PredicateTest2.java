package com.app7_Predicate;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/*
 마. Predicate
	 파라미터 있고 boolean 리턴값 있는 경우

   종류
    BiPredicate ==> 두개의 파라미터 전달하고  boolean 리턴
    DoublePredicate =>   하나의 double 전달하고 boolean 리턴
    IntPredicate =>   하나의 int 전달하고 boolean 리턴
    LongPredicate =>   하나의 long 전달하고 boolean 리턴
    
   
    * 논리연산자 역할의 메서드
      1) and() :  && 연산자 대응
      2) or()  : || 연산자 대응
      3) negate() :   ! 연산자 대응
    
*/  
  
public class PredicateTest2 {

	public static void main(String[] args) {

		//1. and() - && 역할
		// 문제: 지정된 변수값이 2의 배수이고 3의 배수이냐?
		int num = 6;
		IntPredicate x = n-> n%2==0;
		IntPredicate x2 = n-> n%3==0;
		IntPredicate x3 = x.and(x2);
		
		boolean result = x3.test(num);
		System.out.println("1. 정수 6이  2의 배수이고 3의 배수이냐?" + result);
		System.out.println("1. 정수10이  2의 배수이고 3의 배수이냐?" + x.and(x2).test(10));
	 
		//2. or() 
		// 문제: 지정된 문자열 길이가 5이거나 첫글자가 A이냐?
		Predicate<String> k = n->n.length()==5;
		Predicate<String> k2 = n->n.charAt(0)=='A';
		Predicate<String> k3 = k.or(k2);
		//Predicate<String> k4 = k || k2;  //   true || false
		boolean result2 = k3.test("Hello");
		System.out.println("2. Hello 문자열 길이가 5이거나 첫글자가 A이냐?" + result2);
		
		//3. negate() : ! 연산자 대응
		// 문제: 지정된 문자열 길이가 5가 아니냐?
		Predicate<String> z = n->n.length()==5; // true
		Predicate<String> z2 = z.negate();      // false
		
		boolean result3 = z2.test("hello");
		System.out.println("2. Hello 지정된 문자열 길이가 5가 아니냐?" + result3);		
		
	}//end main
}//end class
















