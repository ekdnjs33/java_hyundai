package com.app3_부모부터;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new  Cat();
		// Pet class 생성자 : 이게 왜 출력되는지?
		// Cat class 생성자 
		// *** 항상 자신(new Cat)보다 상위 클래스(new Pet)가 먼저 생성된다!
		
		/*
		 * 		생성자 호출 형태 
		 * 		
		 * 		1. 다른 클래스에서 객체 생성시
		 * 			new 클래스명();
		 * 
		 * 		2. 자식클래스에서 부모 생성자 호출 ***
		 * 			(자식클래스의 생성자 첫라인에 자동 삽입)
		 * 			super();
		 * 			명시적으로  지정할 시 반드시 첫라인에 사용해야 된다.  
		 * 
		 * 		3. 같은 클래스의 특정생성자에서 다른생성자 호출 
		 * 			this();
		 */

	}

}
