package com.app5_오버라이딩메서드;

public class Dog extends Pet {

	String sex; //고유한 속성

	public Dog() {
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Dog(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String getPet() {
		return super.getPet() +"\t"+sex;
	}
	
	
	
}
