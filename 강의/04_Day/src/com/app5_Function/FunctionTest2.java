package com.app5_Function;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

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

public class FunctionTest2 {

	public static void main(String[] args) {
		
		BiFunction<String, String, Integer> f = new BiFunction<String, String, Integer>() {
			@Override
			public Integer apply(String t, String u) {
				return t.length()+u.length();
			}
		};
		int num = f.apply("Hello", "World");
		System.out.println("1. BiFunction 익명클래스: " + num);
		
		BiFunction<String, String, Integer> f2 = (t, u)->t.length()+u.length();
		int num2 = f2.apply("Hello", "World");
		System.out.println("1. BiFunction 람다표현식: " + num2);
		/////////////////////////////
		IntFunction<String> x = new IntFunction<String>() {
			
			@Override
			public String apply(int value) {
				return String.valueOf(value);
			}
		};
		String x2 = x.apply(100);
		System.out.println("3. BiFunction 익명클래스: " + x2);
		
		IntFunction<String> xx = value-> String.valueOf(value);
		String xx2 = xx.apply(100);
		System.out.println("3. BiFunction 람다표현식: " + xx2);
		
	}//end main
}//end class
