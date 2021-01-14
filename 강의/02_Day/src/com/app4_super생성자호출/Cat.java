package com.app4_super생성자호출;


// Cat is a Pet 성립 : Pet의 구성요소를 Cat이 그냥 사용 가능 ( 부모생성자와 private은 상속불가)
public class Cat extends Pet {

	String color; //고유한 속성

	public Cat() {
	}
	public Cat(String name, int age) {
		super(name, age); //부모가 선언된 name,age를 부모가 초기화
	}
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
