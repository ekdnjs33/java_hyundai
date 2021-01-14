package com.app1;

/* 인터페이스 생성 ==> 특정 기능을 하는 추상메소드 생성 목적  
 * 
 * 		파라미터는 있고 리턴값은 없는 메소드 작성  
 */


@FunctionalInterface
interface MyInterface<T>{  
	
	public abstract void fun(T obj);
	
}

public class TestMain {

	
	public static void main(String[] args) {

		MyInterface<String> m = new MyInterface<String>() {

			@Override
			public void fun(String obj) {
				System.out.println("1. MyInterface 익명클래스: "+obj);
			}
			
		};
		m.fun("hello");
		
		
		MyInterface<Integer> m2 = new MyInterface<Integer>() {

			@Override
			public void fun(Integer obj) {
				System.out.println("2. MyInterface 익명클래스(int): "+obj);				
			}
			
		};
		m2.fun(1004);
		
		
		MyInterface<String> m3 = obj->System.out.println("3. MyInterface 람다표현식: "+obj);
		m3.fun("World");
	}

}
