package com.app4_super생성자호출;

public class TestPet {

	public static void main(String[] args) { 
	
		Cat c = new Cat("나비", 2, "블랙");
		Dog d = new Dog("망치", 1, "숫컷");
		
		System.out.println("고양이이름:" + c.getName());
		System.out.println("고양이나이:" + c.getAge());
		System.out.println("고양이색상:" + c.getColor());
		System.out.println("강아지이름:" + d.getName());
		System.out.println("강아지나이:" + d.getAge());
		System.out.println("강아지성별:" + d.getSex());
	}
}
