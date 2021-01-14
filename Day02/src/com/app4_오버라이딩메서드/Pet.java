package com.app4_오버라이딩메서드;


public class Pet { 

	String name;
	int age;
	
	public Pet() {}
	
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// name하고 age 동시에 반환 > 깃허브 참고  
}
