package com.app5_오버라이딩메서드;

public class TestPet {

	public static void main(String[] args) { 
	
		Cat c = new Cat("나비", 2, "블랙");
		Dog d = new Dog("망치", 1, "숫컷");
		
		System.out.println("고양이 정보:"+ c.getPet());
		System.out.println("강아지 정보:"+ d.getPet());
	}
}
