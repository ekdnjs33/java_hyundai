package com.app3_부모부터;

public class Cat extends Pet {

	public Cat() {
		
		// 지정하지 않아도 super() 생성! ==> 기본적으로 기본생성자 호출 // Pet class 생성자 
		
		// but, 명시적으로 적을 수도 있어
		super(10); // Pet class 생성자2
		
		System.out.println("Cat class 생성자 ");
	}
	
}
