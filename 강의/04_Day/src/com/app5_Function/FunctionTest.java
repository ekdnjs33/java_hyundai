package com.app5_Function;

import java.util.function.Function;

/*
 *  4. Function
 *    - 파라미터 있고 리턴값 있는 경우
 *    - 특정 데이터타입으로 파라미터전달해서  임의의 데이터타입으로 반환하도록  맵핑하는 용도로 사용된다.
 *      ( 예> int --> String )
 * 
 *    * 종류
 *    BiFunction<T,U,R> : T와 U 전달하고 R타입으로 반환
 *    DoubleFunction<R> : double로 전달하고 R타입으로 반환
 *    IntFunction<R> : int로 전달하고 R타입으로 반환
 *    IntToDoubleFunction : int로 전달하고 double타입으로 반환
 *    IntToLongFunction : int로 전달하고 long타입으로 반환
 *    LongToDoubleFunction : long로 전달하고 double타입으로 반환
 *    LongToIntFunction : long로 전달하고 int타입으로 반환
 *    
 *    ...
 *    
 *    
 */

public class FunctionTest {

	public static void main(String[] args) {
		
		Function<String, Integer> f = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		int n = f.apply("hello");
		System.out.println("1. Function 익명클래스:" + n);
		
		Function<String, Integer> ff = t->t.length();
		int nn = ff.apply("hello");
		System.out.println("1. Function 람다표현식:" + nn);
		///////////////////////////////
		Function<String, Boolean> f2 = new Function<String, Boolean>() {
			@Override
			public Boolean apply(String t) {
				return t.length()==5;
			}
		};
		boolean n2 = f2.apply("hello");
		System.out.println("2. Function 익명클래스:" + n2);
		
		Function<String, Boolean> ff2 = t->t.length()==5;
		boolean nn2 = ff2.apply("hello");
		System.out.println("2. Function 람다표현식:" + nn2);
		
	}//end main
}//end class
