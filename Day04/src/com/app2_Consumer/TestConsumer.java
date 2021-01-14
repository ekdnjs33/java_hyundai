package com.app2_Consumer;

import java.util.function.Consumer;

/*
 *    함수적 인터페이스 API
 *    
 *    1) Consummer 인터페이스
 *    		- 파라미터 있고 리턴값 없다.
 *    
 *    2) 종류
 *    		...
 *    		파라미터가 최대 2개, 3개 이상인 경우 어쩔 수 없이 MyInerface 같은 거 만들어야 해!  
 *    
 * 
 */

public class TestConsumer {

	public static void main(String[] args) {

		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String s) { //implement method
				System.out.println("1. Consumer 익명클래스: "+s);
				
			}
			
		};
		c.accept("hello");
		
		Consumer<String> c2 = s->System.out.println("2. Consumer 익명클래스: "+s);
		c2.accept("world");
	}
	
}
