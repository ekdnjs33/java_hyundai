package com.app91_추상클래스2.copy;

public class Dog extends Pet {

	//1. 인스턴스 변수
	String sex; //고유한 속성

	//2. 생성자
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
	//3. 변수와 관련된 getter/setter
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
//	@Override
//	public String getPet() {
//		return super.getPet() +"\t"+sex;
//	}
	//4. toString 재정의
	@Override
	public String toString() {
		return "Dog [sex=" + sex + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public void eat() {
		System.out.println("Dog eat");
	}
	@Override
	public void sleep() {
		System.out.println("Dog sleep");
	}

}
