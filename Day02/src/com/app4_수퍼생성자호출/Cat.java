package com.app4_수퍼생성자호출;

// *** Cat is a Pet 관계 성립 : Pet의 구성요소를 Cat이 그냥 사용 가능 (부모생성자와 부모에서 private은 상속 X)

public class Cat extends Pet { // 자바는 단일 상속만 지원, 부모클래스가 하나만 올 수 있다. 

	String color; // 고유한 속성  

	public Cat() {}

	public Cat(String name, int age) {
		//this.name = name;
		//this.age = age;
		
		super(name, age);
		// ** 이거보다는 부모에서 초기화하고 super(name, age) 가져다 쓰는게 더 좋아!
	}

	public Cat(String name, int age, String color) {
		//this.name = name;
		//this.age = age;
		
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// Dog도 똑같이 만들면 돼.
}
