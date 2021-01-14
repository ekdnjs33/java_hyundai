package com.app2_상속적용;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c =  new Cat("nabi", 2, "black");
		
		System.out.println("cat name: " + c.getName());
		System.out.println("cat age: " + c.getAge());
		System.out.println("cat color: " + c.getColor());
	}

}
