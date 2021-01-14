package com.app2;

// 인터페이스 생성 ==> 특정 기능을 하는 추상 메서드 생성 목적 
/*
 *     파라미터 있고 리턴값 없는 기능의 메서드 작성하자.
 */

@FunctionalInterface
interface MyInterface<T>{
	public abstract void fun(T  obj);
}

public class TestMain {

	public static void main(String[] args) {

		MyInterface<String> m = new MyInterface<String>() {
			@Override
			public void fun(String obj) {
					System.out.println("1. MyInterface익명크래스:"+ obj);
			}
		};
		m.fun("Hello");

		MyInterface<Integer> m2 = new MyInterface<Integer>() {
			@Override
			public void fun(Integer obj) {
				System.out.println("2. MyInterface익명크래스:"+ obj);
			}
		};
		m2.fun(100);
		////////////////////////////////////////////////////////
		MyInterface<String>  m3 = obj->System.out.println("3. MyInterface 람다표현식:"+ obj);
		m3.fun("World");
		
	}//end main
}//end  class








