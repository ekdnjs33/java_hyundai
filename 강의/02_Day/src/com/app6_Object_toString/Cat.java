package com.app6_Object_toString;


// Cat is a Pet 성립 : Pet의 구성요소를 Cat이 그냥 사용 가능 ( 부모생성자와 private은 상속불가)
public class Cat extends Pet {

	 String color; //고유한 속성

	public Cat() {
	}
	public Cat(String name, int age) {
		super(name, age);
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
	
	@Override //어노테이션, @Override의미는  현재메서드가 오버라이딩 메서드임을 알려주는 기능
	public String getPet() {
		return super.getPet()+"\t"+color;
	}
	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}





