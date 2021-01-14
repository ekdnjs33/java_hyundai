package com.app1_추상클래스2;

public class TestPet {

	public static void main(String[] args) { 
	
		Cat c = new Cat("나비", 2, "블랙");
		Dog d = new Dog("망치", 1, "숫컷");
		
		System.out.println("고양이 정보1:"+ c); 
		c.eat();
		c.sleep();
		System.out.println("강아지 정보:"+ d);
		d.eat();
		d.sleep();
		
		//Pet p = new Pet(); new 불가
		Pet p2 = new Cat("나비", 2, "블랙");
		
		
	}
}
