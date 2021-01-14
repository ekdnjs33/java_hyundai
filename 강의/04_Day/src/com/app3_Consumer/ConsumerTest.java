package com.app3_Consumer;

import java.util.function.Consumer;

/*
 *   함수적(형) 인터페이스 API ===>  컬렉션의 stream  API에서 활용
 *   
 *   1) Consumer 인터페이스
 *     - 파라미터 있고 리턴값은 없다.
 * 
 *   2) 종류
 *     BiConsumer =>  파라미터를 2개 받아서 처리
 *     DoubleConsumer ==> double타입으로 파라미터를 받아서 처리
 *     IntConsumer ==> int타입으로 파라미터를 받아서 처리
 *     LongConsumer ==> long타입으로 파라미터를 받아서 처리
 *     ObjDoubleConsumer ==> 두개의 파라미터중에 하나는 obj 다른하나는 double
 *     ObjIntConsumer ==> 두개의 파라미터중에 하나는 obj 다른하나는 int
 *     ObjLongConsumer ==> 두개의 파라미터중에 하나는 obj 다른하나는 long
 *     
 */

public class ConsumerTest {

	public static void main(String[] args) {

		//1. 익명 클래스
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println("1. Consumer 익명클래스:" + s);
			}
		};
		c.accept("Hello");
		
		Consumer<Integer> c2 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println("2. Consumer 익명클래스:" + t);				
			}
		};
		c2.accept(100);
		///////////////////////////////////////////
		Consumer<String> c3 = s->System.out.println("3. MyInterface 람다표현식:"+ s);
		c3.accept("World");
		
	}//end main
}//end class
