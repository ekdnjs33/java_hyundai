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
  
public class PredicateTest {

	public static void main(String[] args) {

		Predicate<String> s = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length()==5;
			}
		};
		
		boolean result = s.test("Hello");
		System.out.println("1.Predicate 익명 클래스: " + result);
		
		Predicate<String> s2 = t -> t.length()==5;
		boolean result2 = s2.test("Hello");
		System.out.println("1.Predicate 람다표현식ㄴ: " + result2);
		///////////////////////////////////////////////////////
		BiPredicate<String, Integer> k = new BiPredicate<String, Integer>() {
			@Override
			public boolean test(String t, Integer u) {
				return t.length() == u;
			}
		};
		boolean k2 = k.test("Hello", 4);
		System.out.println("2. BiPredicate 익명 클래스: " + k2);
		
		BiPredicate<String, Integer> kk = (t, u) ->t.length() == u;
		boolean kk2 = kk.test("Hello", 4);
		System.out.println("2. BiPredicate 람다표현식: " + kk2);
		////////////////////////////////////////////////////////
		IntPredicate z = new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				return value==4;
			}
		};
		
		boolean z2 = z.test(4);
		System.out.println("3. IntPredicate 익명 클래스: " + z2);
		
		IntPredicate z3 =value->value==4;
		boolean z4 = z3.test(4);
		System.out.println("4. IntPredicate 람다표현식: " + z4);
	}//end main
}//end class






